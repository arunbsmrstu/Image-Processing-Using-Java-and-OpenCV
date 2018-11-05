package com.imageprocessing.utils;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;


public class Utils {
    
    public static Mat getMatFromBufferedImage(BufferedImage image){
        Mat mat=new Mat(image.getHeight(),image.getWidth(),CvType.CV_8UC3);
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
    
}
