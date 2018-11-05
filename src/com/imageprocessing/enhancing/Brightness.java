package com.imageprocessing.enhancing;

import org.opencv.core.Mat;


public class Brightness {
    
    public Mat getBrightness(Mat source,int alpha,int beta){
        Mat destination = new Mat(source.rows(),source.cols(),source.type());
        source.convertTo(destination, -1, alpha, beta);
        return destination;
    }
    
}
