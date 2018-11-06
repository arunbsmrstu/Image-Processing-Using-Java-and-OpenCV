package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_INTERFACES_LIST extends Structure {
	/** C type : FTRSCAN_INTERFACE_STATUS[128] */
	public int[] InterfaceStatus = new int[128];
	public FTRSCAN_INTERFACES_LIST() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("InterfaceStatus");
	}
	/** @param InterfaceStatus C type : FTRSCAN_INTERFACE_STATUS[128] */
	public FTRSCAN_INTERFACES_LIST(int InterfaceStatus[]) {
		super();
		if ((InterfaceStatus.length != this.InterfaceStatus.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InterfaceStatus = InterfaceStatus;
	}
	public FTRSCAN_INTERFACES_LIST(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_INTERFACES_LIST implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_INTERFACES_LIST implements Structure.ByValue {
		
	};
}
