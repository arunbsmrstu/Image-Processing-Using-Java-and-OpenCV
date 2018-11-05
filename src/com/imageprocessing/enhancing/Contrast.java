package com.imageprocessing.enhancing;


import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;


public class Contrast {
    
    
    public Mat getEnhancedImage(Mat source){
        Mat destination = new Mat(source.rows(),source.cols(),source.type());
        Imgproc.equalizeHist(source, destination);
        return destination;
    }
    
}
