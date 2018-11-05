/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.enhancing;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Arun
 */
public class Sharpness {
    
    public Mat getSharoness(Mat source){
        Mat destination = new Mat(source.rows(),source.cols(),source.type());
        Imgproc.GaussianBlur(source, destination, new Size(0,0), 10);
        Core.addWeighted(source, 1.5, destination, -0.5, 0, destination);
        return destination;
    }
    
}
