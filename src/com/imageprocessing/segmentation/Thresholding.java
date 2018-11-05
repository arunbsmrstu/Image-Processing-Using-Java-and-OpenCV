/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.segmentation;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Arun
 */
public class Thresholding {
    
    public Mat getBinarized(Mat source,int min,int max){
        Mat destination = new Mat(source.rows(),source.cols(),source.type());
        destination = source;
        Imgproc.threshold(source,destination,min,max,Imgproc.THRESH_BINARY);
        return destination;
    }
    
}
