package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_PROPERTY_LFD_SW_1_PARAM extends Structure {
	public NativeLong dwStrength;
	public FTRSCAN_PROPERTY_LFD_SW_1_PARAM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dwStrength");
	}
	public FTRSCAN_PROPERTY_LFD_SW_1_PARAM(NativeLong dwStrength) {
		super();
		this.dwStrength = dwStrength;
	}
	public FTRSCAN_PROPERTY_LFD_SW_1_PARAM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_PROPERTY_LFD_SW_1_PARAM implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_PROPERTY_LFD_SW_1_PARAM implements Structure.ByValue {
		
	};
}
