/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.test;


import com.imageprocessing.Filter.GaussianFilter;
import com.imageprocessing.library.Library;
import com.imageprocessing.morphology.Morphology;
import com.imageprocessing.segmentation.Thresholding;
import com.imageprocessing.utils.Utils;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.opencv.core.Mat;


public class Test {
    
    public static void main(String[] arg) throws IOException{
        
        Library.loadLibrary();
        
        
        File file= new File("image/input.JPG");
        
        BufferedImage image=ImageIO.read(file);
        Mat mat=Utils.getMatFromBufferedImage(image);
        Morphology morphology= new Morphology();
        BufferedImage matImage=Utils.getBufferedImageFromMat(morphology.getDilating(mat, 5));
        File output=new File("output/morphology.jpg");
        ImageIO.write(matImage,"jpg", output);
        
   
           
    }
    
}
