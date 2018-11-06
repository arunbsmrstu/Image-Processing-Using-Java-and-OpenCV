package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_PROPERTY_NUMBER_OF_IMAGE_SIZES extends Structure {
	public int nNumberOfImagesSizes;
	public FTRSCAN_PROPERTY_NUMBER_OF_IMAGE_SIZES() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("nNumberOfImagesSizes");
	}
	public FTRSCAN_PROPERTY_NUMBER_OF_IMAGE_SIZES(int nNumberOfImagesSizes) {
		super();
		this.nNumberOfImagesSizes = nNumberOfImagesSizes;
	}
	public FTRSCAN_PROPERTY_NUMBER_OF_IMAGE_SIZES(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_PROPERTY_NUMBER_OF_IMAGE_SIZES implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_PROPERTY_NUMBER_OF_IMAGE_SIZES implements Structure.ByValue {
		
	};
}
