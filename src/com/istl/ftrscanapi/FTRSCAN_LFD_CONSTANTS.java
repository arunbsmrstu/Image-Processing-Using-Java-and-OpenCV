package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_LFD_CONSTANTS extends Structure {
	public int nLMin;
	public int nLMax;
	public int nCMin;
	public int nCMax;
	public int nEEMin;
	public int nEEMax;
	public FTRSCAN_LFD_CONSTANTS() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("nLMin", "nLMax", "nCMin", "nCMax", "nEEMin", "nEEMax");
	}
	public FTRSCAN_LFD_CONSTANTS(int nLMin, int nLMax, int nCMin, int nCMax, int nEEMin, int nEEMax) {
		super();
		this.nLMin = nLMin;
		this.nLMax = nLMax;
		this.nCMin = nCMin;
		this.nCMax = nCMax;
		this.nEEMin = nEEMin;
		this.nEEMax = nEEMax;
	}
	public FTRSCAN_LFD_CONSTANTS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_LFD_CONSTANTS implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_LFD_CONSTANTS implements Structure.ByValue {
		
	};
}
