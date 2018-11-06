package com.imageprocessing.library;

import org.opencv.core.Core;


public class  Library {
    public static void loadLibrary(){
        try {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
