package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_ROLL_CB_OPERATION_PF_STATUS extends Structure {
	public NativeLong dwFlags;
	public NativeLong dwToggleSet;
	public NativeLong dwPeriod;
	/** 0 or 1 */
	public NativeLong dwSetFlag;
	public FTRSCAN_ROLL_CB_OPERATION_PF_STATUS() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dwFlags", "dwToggleSet", "dwPeriod", "dwSetFlag");
	}
	/** @param dwSetFlag 0 or 1 */
	public FTRSCAN_ROLL_CB_OPERATION_PF_STATUS(NativeLong dwFlags, NativeLong dwToggleSet, NativeLong dwPeriod, NativeLong dwSetFlag) {
		super();
		this.dwFlags = dwFlags;
		this.dwToggleSet = dwToggleSet;
		this.dwPeriod = dwPeriod;
		this.dwSetFlag = dwSetFlag;
	}
	public FTRSCAN_ROLL_CB_OPERATION_PF_STATUS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_ROLL_CB_OPERATION_PF_STATUS implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_ROLL_CB_OPERATION_PF_STATUS implements Structure.ByValue {
		
	};
}
