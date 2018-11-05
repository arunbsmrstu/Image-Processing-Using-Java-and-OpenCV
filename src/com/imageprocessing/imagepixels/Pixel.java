package com.imageprocessing.imagepixels;

import java.awt.Color;
import java.awt.image.BufferedImage;


public class Pixel {
    
    public void getPixelValue(BufferedImage image){
        int width=image.getWidth();;
        int height=image.getHeight();
        int count = 0;
        
        for(int i=0; i<height; i++) {
            for(int j=0; j<width; j++) {
                count++;
                Color c = new Color(image.getRGB(j, i));
                System.out.println("S.No: " + count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
            }
         }
    }
    
}
