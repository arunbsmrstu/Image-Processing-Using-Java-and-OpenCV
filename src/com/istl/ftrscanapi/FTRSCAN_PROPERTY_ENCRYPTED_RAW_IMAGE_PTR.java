package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_PTR extends Structure {
	/** C type : void* */
	public Pointer pBuffer;
	public NativeLong dwBufferSize;
	public FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_PTR() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("pBuffer", "dwBufferSize");
	}
	/** @param pBuffer C type : void* */
	public FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_PTR(Pointer pBuffer, NativeLong dwBufferSize) {
		super();
		this.pBuffer = pBuffer;
		this.dwBufferSize = dwBufferSize;
	}
	public FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_PTR(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_PTR implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_PROPERTY_ENCRYPTED_RAW_IMAGE_PTR implements Structure.ByValue {
		
	};
}
