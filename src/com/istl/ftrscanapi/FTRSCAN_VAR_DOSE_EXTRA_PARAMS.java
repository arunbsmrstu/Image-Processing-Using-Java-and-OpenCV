package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_VAR_DOSE_EXTRA_PARAMS extends Structure {
	public byte byNumberOfFramesMinusOne;
	public byte byReserved1;
	public byte byReserved2;
	public byte byReserved3;
	public byte byReserved4;
	public FTRSCAN_VAR_DOSE_EXTRA_PARAMS() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("byNumberOfFramesMinusOne", "byReserved1", "byReserved2", "byReserved3", "byReserved4");
	}
	public FTRSCAN_VAR_DOSE_EXTRA_PARAMS(byte byNumberOfFramesMinusOne, byte byReserved1, byte byReserved2, byte byReserved3, byte byReserved4) {
		super();
		this.byNumberOfFramesMinusOne = byNumberOfFramesMinusOne;
		this.byReserved1 = byReserved1;
		this.byReserved2 = byReserved2;
		this.byReserved3 = byReserved3;
		this.byReserved4 = byReserved4;
	}
	public FTRSCAN_VAR_DOSE_EXTRA_PARAMS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_VAR_DOSE_EXTRA_PARAMS implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_VAR_DOSE_EXTRA_PARAMS implements Structure.ByValue {
		
	};
}
