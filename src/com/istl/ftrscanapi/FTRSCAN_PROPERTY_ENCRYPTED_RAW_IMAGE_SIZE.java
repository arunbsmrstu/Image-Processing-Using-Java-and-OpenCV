package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_SIZE extends Structure {
	public NativeLong dwSize;
	public FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_SIZE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dwSize");
	}
	public FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_SIZE(NativeLong dwSize) {
		super();
		this.dwSize = dwSize;
	}
	public FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_SIZE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_SIZE implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_SIZE implements Structure.ByValue {
		
	};
}
