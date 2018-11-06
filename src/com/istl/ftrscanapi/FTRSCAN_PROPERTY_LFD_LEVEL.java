package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_PROPERTY_LFD_LEVEL extends Structure {
	public NativeLong dwLfdLevel;
	public FTRSCAN_PROPERTY_LFD_LEVEL() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dwLfdLevel");
	}
	public FTRSCAN_PROPERTY_LFD_LEVEL(NativeLong dwLfdLevel) {
		super();
		this.dwLfdLevel = dwLfdLevel;
	}
	public FTRSCAN_PROPERTY_LFD_LEVEL(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_PROPERTY_LFD_LEVEL implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_PROPERTY_LFD_LEVEL implements Structure.ByValue {
		
	};
}
