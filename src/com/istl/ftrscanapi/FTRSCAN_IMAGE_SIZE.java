package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_IMAGE_SIZE extends Structure {
	public int nWidth;
	public int nHeight;
	public int nImageSize;
	public FTRSCAN_IMAGE_SIZE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("nWidth", "nHeight", "nImageSize");
	}
	public FTRSCAN_IMAGE_SIZE(int nWidth, int nHeight, int nImageSize) {
		super();
		this.nWidth = nWidth;
		this.nHeight = nHeight;
		this.nImageSize = nImageSize;
	}
	public FTRSCAN_IMAGE_SIZE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_IMAGE_SIZE implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_IMAGE_SIZE implements Structure.ByValue {
		
	};
}
