package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_PROPERTY_ENCRYPTION extends Structure {
	public int bEnable;
	public FTRSCAN_PROPERTY_ENCRYPTION() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bEnable");
	}
	public FTRSCAN_PROPERTY_ENCRYPTION(int bEnable) {
		super();
		this.bEnable = bEnable;
	}
	public FTRSCAN_PROPERTY_ENCRYPTION(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_PROPERTY_ENCRYPTION implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_PROPERTY_ENCRYPTION implements Structure.ByValue {
		
	};
}
