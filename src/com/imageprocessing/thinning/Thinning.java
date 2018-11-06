/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageprocessing.thinning;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Arun
 */
public class Thinning {
    
    public  int[][] getZhangSuenAlgorithm(int img_bin[][]) throws Exception{
        int i,j,k,A,B;
        //clockwise
        int di[]=new int[]{0,0, -1,-1,0,1,1,1,0,-1};//1st 2 elements are useless
        int dj[]=new int[]{0,0, 0,1,1,1,0,-1,-1,-1};
        boolean EVEN=true;
        
        BufferedImage debugImg=new BufferedImage(img_bin.length, img_bin[0].length, BufferedImage.TYPE_INT_ARGB);
        
        int skeleton[][]=new int[img_bin.length][img_bin[0].length];
        for(i=1;i<img_bin.length-1;i++)
            for(j=1;j<img_bin[i].length-1;j++){
                skeleton[i][j]=0;
                A=img_bin[i][j];
                B=0;
                for(k=2;k<=9;k++)// from P2+P3+...+P9
                    B+=img_bin[i+di[k]][j+dj[k]];
                    // A=1  AND 3<= B <=6?
                    if(A==1 && 3<=B && B<=6){
                        if(!EVEN && img_bin[i+di[2]][j+dj[2]]*img_bin[i+di[4]][j+dj[4]]*img_bin[i+di[6]][j+dj[6]] == 0
                                &&  img_bin[i+di[4]][j+dj[4]]* img_bin[i+di[6]][j+dj[6]]* img_bin[i+di[8]][j+dj[8]] == 0)
                            skeleton[i][j]=1;
                        if(     EVEN
                            &&
                            img_bin[i+di[2]][j+dj[2]]*
                            img_bin[i+di[4]][j+dj[4]]*
                            img_bin[i+di[8]][j+dj[8]] == 0
                            &&
                            img_bin[i+di[2]][j+dj[2]]*
                            img_bin[i+di[6]][j+dj[6]]*
                            img_bin[i+di[8]][j+dj[8]] == 0)
                        
                                skeleton[i][j]=1;
                    
                        
                }
                
                if(skeleton[i][j]==0)
                        debugImg.setRGB(i, j, new Color(255, 255, 255).getRGB());
                else
                        debugImg.setRGB(i, j, new Color(0, 0, 0).getRGB());
                
                EVEN=!EVEN;
            }
        
        ImageIO.write(debugImg, "png", new File("thin.png"));
        return skeleton;
    }
    
}
