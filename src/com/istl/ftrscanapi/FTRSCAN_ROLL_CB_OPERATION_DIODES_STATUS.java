package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_ROLL_CB_OPERATION_DIODES_STATUS extends Structure {
	public byte byGreenDiodeStatus;
	public byte byRedDiodeStatus;
	public FTRSCAN_ROLL_CB_OPERATION_DIODES_STATUS() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("byGreenDiodeStatus", "byRedDiodeStatus");
	}
	public FTRSCAN_ROLL_CB_OPERATION_DIODES_STATUS(byte byGreenDiodeStatus, byte byRedDiodeStatus) {
		super();
		this.byGreenDiodeStatus = byGreenDiodeStatus;
		this.byRedDiodeStatus = byRedDiodeStatus;
	}
	public FTRSCAN_ROLL_CB_OPERATION_DIODES_STATUS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_ROLL_CB_OPERATION_DIODES_STATUS implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_ROLL_CB_OPERATION_DIODES_STATUS implements Structure.ByValue {
		
	};
}
