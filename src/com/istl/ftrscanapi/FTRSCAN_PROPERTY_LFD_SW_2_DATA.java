package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_PROPERTY_LFD_SW_2_DATA extends Structure {
	public NativeLong dwScore;
	public FTRSCAN_PROPERTY_LFD_SW_2_DATA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dwScore");
	}
	public FTRSCAN_PROPERTY_LFD_SW_2_DATA(NativeLong dwScore) {
		super();
		this.dwScore = dwScore;
	}
	public FTRSCAN_PROPERTY_LFD_SW_2_DATA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_PROPERTY_LFD_SW_2_DATA implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_PROPERTY_LFD_SW_2_DATA implements Structure.ByValue {
		
	};
}
