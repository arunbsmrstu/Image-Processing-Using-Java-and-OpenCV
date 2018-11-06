package com.imageprocessing.fingerprint;

import com.imageprocessing.utils.Utils;
import com.istl.ftrscanapi.FTRSCANAPILibrary;
import com.istl.ftrscanapi.FTRSCAN_IMAGE_SIZE;
import com.sun.jna.Memory;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.WritableImage;


public class Fingerprint  {
    
     WritableImage image=null;
    int ret = -1;
    NativeLong err;
    FTRSCANAPILibrary ftrScanLib = null;
    FTRSCAN_IMAGE_SIZE ImageSize;
    Pointer handle;
    
    public boolean deviceConnection(){
        try {
            ftrScanLib = FTRSCANAPILibrary.INSTANCE;
            handle = ftrScanLib.ftrScanOpenDevice();
            if(handle==null){
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
       return true;
   }
    
    
    public BufferedImage getImage() throws IOException{
        deviceConnection();
        System.out.println("Device opened >>>> ");
        System.out.println("keep fngr>>>> ");
        FTRSCAN_IMAGE_SIZE.ByReference imageSize = new FTRSCAN_IMAGE_SIZE.ByReference();
        ret = ftrScanLib.ftrScanGetImageSize(handle, imageSize);
        if (ret == FTRSCANAPILibrary.TRUE){
            Pointer imgPtr = new Memory(imageSize.nImageSize);
            ftrScanLib.ftrScanSetDiodesStatus(handle, (byte) 254, (byte) 254);
            while (true){
                ret = ftrScanLib.ftrScanGetFrame(handle, imgPtr, null);
                if (ret == FTRSCANAPILibrary.FALSE){
                    err = ftrScanLib.ftrScanGetLastError();
                    if (err == null){
                        System.err.println("No last error found>>>");
                        break;
                    }
                } else{
                    byte[] imgData = new byte[imageSize.nImageSize];
                    imgPtr.read(0, imgData, 0, imageSize.nImageSize);
                    BufferedImage buffImg = Utils.ByteArraytoBufferedImage(imgData, imageSize.nWidth, imageSize.nHeight);
                   // BufferedImage greyScaleImg = Utils.BufferedImageToGrayImage(buffImg);
                    return  buffImg;
// image = SwingFXUtils.toFXImage( greyScaleImg, null);
//                    if (greyScaleImg != null){
//                        BufferedImage final_image=Utils.getProcessedImage(greyScaleImg);
//                        image = SwingFXUtils.toFXImage( final_image, null);
//                        ftrScanLib.ftrScanCloseDevice(handle);
//                        return image;
//                    } else{
//                        System.out.println("no image");
//                    }
                   // break;
                }
            }
        }
        
        return null;
    }
    
    public WritableImage getFingerPrint() throws IOException{
        
        try{
            ftrScanLib = FTRSCANAPILibrary.INSTANCE;
             handle = ftrScanLib.ftrScanOpenDevice();
            if(handle==null){
                System.out.println("No device connected >>>> ");
            }else{
                System.out.println("Device opened >>>> ");
                System.out.println("keep fngr>>>> ");
                FTRSCAN_IMAGE_SIZE.ByReference imageSize = new FTRSCAN_IMAGE_SIZE.ByReference();
                ret = ftrScanLib.ftrScanGetImageSize(handle, imageSize);
                if (ret == FTRSCANAPILibrary.TRUE){
                    Pointer imgPtr = new Memory(imageSize.nImageSize);
                    ftrScanLib.ftrScanSetDiodesStatus(handle, (byte) 254, (byte) 254);
                    while (true){
                        ret = ftrScanLib.ftrScanGetFrame(handle, imgPtr, null);
                        if (ret == FTRSCANAPILibrary.FALSE){
                            err = ftrScanLib.ftrScanGetLastError();
                            if (err == null){
                                System.err.println("No last error found>>>");
                                break;
                            }
                        } else{
                            byte[] imgData = new byte[imageSize.nImageSize];
                            imgPtr.read(0, imgData, 0, imageSize.nImageSize);
                            BufferedImage buffImg = Utils.ByteArraytoBufferedImage(imgData, imageSize.nWidth, imageSize.nHeight);
                            BufferedImage greyScaleImg = Utils.BufferedImageToGrayImage(buffImg);
                            if (greyScaleImg != null){
                                BufferedImage final_image=Utils.getProcessedImage(greyScaleImg);
                                image = SwingFXUtils.toFXImage( final_image, null);
                                return image;
                            } else{
                                System.out.println("no image");
                            }
                            break;
                        }
                    }
                }
                ftrScanLib.ftrScanSetDiodesStatus(handle, (byte) 0, (byte) 0);
                System.out.println("ret = " + ret);
                System.out.println("Image Size = " + imageSize.nImageSize);
                System.out.println("Image Width = " + imageSize.nWidth);
                System.out.println("Image Height = " + imageSize.nHeight);
                ftrScanLib.ftrScanCloseDevice(handle);

            }
        }catch(Exception exc){
            System.err.println(exc);
        }
        
        return image;
    }
    
}
