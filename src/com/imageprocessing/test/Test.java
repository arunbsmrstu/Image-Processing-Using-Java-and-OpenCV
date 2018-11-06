/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.test;


import com.imageprocessing.enhancing.Sharpness;
import com.imageprocessing.fingerprint.Fingerprint;
import com.imageprocessing.library.Library;
import com.imageprocessing.morphology.Morphology;
import com.imageprocessing.segmentation.Thresholding;
import com.imageprocessing.utils.Utils;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javax.imageio.ImageIO;
import org.opencv.core.Mat;


public class Test {
    
    public static void main(String[] arg) throws IOException{
        
        Library.loadLibrary();
        
//        Fingerprint fp= new Fingerprint();
//        BufferedImage image= fp.getImage();
//        File file=new File("output/fingerprintfromDevice.jpg");
//        ImageIO.write(image, "jpg", file);
//        BufferedImage processing=Utils.getProcessedImage(image);
//        File p=new File("output/processedImage.jpg");
//        ImageIO.write(processing, "jpg", p);
        
//        File file= new File("output/fingerprintfromDevice.jpg");
//        
//        BufferedImage image=ImageIO.read(file);
//         Mat mat=Utils.getMatFromBufferedImage(image);
//         System.out.println(mat);
//         BufferedImage output=Utils.getBufferedImageFromMat(mat);
//         File ps=new File("output/output.jpg");
//         ImageIO.write(output, "jpg", ps);
//         
        System.out.println("Done");
//        Thresholding thresholding = new Thresholding();
//         BufferedImage thresholdingImage=Utils.getBufferedImageFromMat(thresholding.getBinarized(mat, 127, 255));
//         File ps=new File("output/thresholdingImage.jpg");
//        ImageIO.write(thresholdingImage, "jpg", ps);
        
        
        File file= new File("output/fingerprintfromDevice.jpg");
        
        BufferedImage image=ImageIO.read(file);
        Mat mat=Utils.getMatFromBufferedImage(image);
        Thresholding thresholding= new Thresholding();
        BufferedImage matImage=Utils.getBufferedImageFromMat(thresholding.getBinarized(mat, 100, 255));
        File output=new File("output/output.jpg");
        ImageIO.write(matImage,"jpg", output);
        
   
           
    }
    
}
