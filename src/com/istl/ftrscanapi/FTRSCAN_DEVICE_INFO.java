package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_DEVICE_INFO extends Structure {
	/** [in, out] */
	public NativeLong dwStructSize;
	public byte byDeviceCompatibility;
	public short wPixelSizeX;
	public short wPixelSizeY;
        
	public FTRSCAN_DEVICE_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dwStructSize", "byDeviceCompatibility", "wPixelSizeX", "wPixelSizeY");
	}
	/** @param dwStructSize [in, out] */
	public FTRSCAN_DEVICE_INFO(NativeLong dwStructSize, byte byDeviceCompatibility, short wPixelSizeX, short wPixelSizeY) {
		super();
		this.dwStructSize = dwStructSize;
		this.byDeviceCompatibility = byDeviceCompatibility;
		this.wPixelSizeX = wPixelSizeX;
		this.wPixelSizeY = wPixelSizeY;
	}
	public FTRSCAN_DEVICE_INFO(Pointer peer) {
		super(peer);
                read();
                
	}
	public static class ByReference extends FTRSCAN_DEVICE_INFO implements Structure.ByReference {
                public ByReference(){
                }
		public ByReference(Pointer p){
                    super(p);
                    read();
                    System.out.println("Reading data >>>> ");
                }
	};
	public static class ByValue extends FTRSCAN_DEVICE_INFO implements Structure.ByValue {
		
	};
}
