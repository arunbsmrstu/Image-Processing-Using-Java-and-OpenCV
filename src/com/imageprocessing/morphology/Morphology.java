/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.morphology;

import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Arun
 * 
 * System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
   
         
         destination = source;

         int erosion_size = 5;
         int dilation_size = 5;

 */
public class Morphology {
    
    public Mat getEroding(Mat source,int erosion_size){
        Mat destination = new Mat(source.rows(),source.cols(),source.type());
        destination = source;
        Mat element = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new  Size(2*erosion_size + 1, 2*erosion_size+1));
        Imgproc.erode(source, destination, element);
        return destination;
    }
    
    public Mat getDilating(Mat source,int dilation_size ){
        Mat destination = new Mat(source.rows(),source.cols(),source.type());
        destination = source;
        Mat element1 = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new  Size(2*dilation_size + 1, 2*dilation_size+1));
        Imgproc.dilate(source, destination, element1);
        return destination;
    }
    
}
