package com.imageprocessing.utils;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;


public class Utils {
    
    
    private final static int clamp(int c){
        return (c>255 ? 255:(c < 0 ? 0 : c));
    }
    
    public static Mat getMatFromBufferedImage(BufferedImage image){
        Mat mat=new Mat(image.getHeight(),image.getWidth(),CvType.CV_8UC1);
        byte[] data=((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        mat.put(0, 0, data);
        return mat;
    }
    
    public static BufferedImage getBufferedImageFromMat(Mat mat) throws IOException{
        MatOfByte mbyt= new MatOfByte();
        Imgcodecs.imencode(".jpg", mat, mbyt);
        byte ba[]=mbyt.toArray();
        BufferedImage bi=ImageIO.read(new ByteArrayInputStream(ba));
        return bi;
    }
    
    public static int[][] getBinaryData(BufferedImage img) throws Exception{
        int i,j,avg=0;
        int img_bin[][]=new int[img.getWidth()][img.getHeight()];
        BufferedImage greyscale=new BufferedImage(img.getWidth(),img.getHeight(),img.getType());
        Color c;
        for(i=0;i<img.getWidth();i++)
            for(j=0;j<img.getHeight();j++)
            {
                c=new Color(img.getRGB(i, j));
                avg=c.getRed()+c.getGreen()+c.getBlue();
                avg/=3;
                if(avg>127)
                    img_bin[i][j]=1;
                else
                    img_bin[i][j]=0;
                greyscale.setRGB(i, j, new Color(avg,avg,avg).getRGB());
            }
        ImageIO.write(greyscale, "png", new File("binary.png"));
        return img_bin;
    }
    
    public static BufferedImage ByteArraytoBufferedImage(byte[] data, int w, int h)
      {
        
          DataBuffer buffer = new DataBufferByte(data, data.length);
          WritableRaster raster = Raster.createInterleavedRaster(buffer, w, h, w, 1, new int[]{0}, null);
          ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
          ColorModel cm = new ComponentColorModel(cs, false, true, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);

          return new BufferedImage(cm, raster, false, null);
      
      }
    
    public static BufferedImage BufferedImageToGrayImage(BufferedImage image) throws IOException
      {
          BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
          Graphics2D g = newImage.createGraphics();
          g.drawImage(image, 0, 0, null);
          g.dispose();

          return newImage;
      }
    
    
    
    
    public static BufferedImage getProcessedImage(BufferedImage img){
        int width = img.getWidth();
        int height= img.getHeight();
        float mean = 0;
        float sum = 0;
        float variance = 0;
        int[] black = new int[]{0, 0, 0};
        int[] white = new int[]{255, 255, 255};
        int array[][] = new int[height + 100][width + 100];
        int arr[][] = new int[height + 100][width + 100];
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();

        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                int clr = img.getRGB(i, j);
                int red = (clr & 0x00ff0000) >> 16;
                array[j + 50][i + 50] = red;
            }
        }
        
        for (int i = 50; i < width + 50; i++){
            for (int j = 50; j < height + 50; j++){
                mean = mean + array[j][i];
            }
        }
        mean = mean / (height * width);

        for (int i = 50; i < width + 50; i++){
            for (int j = 50; j < height + 50; j++){
                sum = sum + ((array[j][i] - mean) * (array[j][i] - mean));
            }
        }
        variance = sum / (width * height);
        
        if (variance < 500){
            for (int i = 50; i < height + 50; i++){
                for (int j = 50; j < width + 50; j++){
                    arr[i][j] = clamp(9 * array[i][j] - (array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1] + array[i][j - 1] + array[i][j + 1] + array[i + 1][j - 1] + array[i + 1][j] + array[i + 1][j + 1]));
                }
            }
        } else{
            for (int i = 50; i < height + 50; i++){
                for (int j = 50; j < width + 50; j++){
                    arr[i][j] = clamp(5 * array[i][j] - (array[i][j - 1] + array[i][j + 1]));
                  }
              }
          }
        
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                int clr = img.getRGB(i, j);
                int red = (clr & 0x00ff0000) >> 16;
                
                if (red > mean){
                    raster.setPixel(i, j, black);
                  } else{
                    raster.setPixel(i, j, white);
                  }
              }
          }
        
        return image;
    }
    
    public static BufferedImage getImageToBufferedImage(Image image){
        return SwingFXUtils.fromFXImage(image, null);
    }
    
}
