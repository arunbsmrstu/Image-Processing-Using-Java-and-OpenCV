package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_FAKE_REPLICA_PARAMETERS extends Structure {
	public int bCalculated;
	public int nCalculatedSum1;
	public int nCalculatedSumFuzzy;
	public int nCalculatedSumEmpty;
	public int nCalculatedSum2;
	public double dblCalculatedTremor;
	public double dblCalculatedValue;
	public FTRSCAN_FAKE_REPLICA_PARAMETERS() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bCalculated", "nCalculatedSum1", "nCalculatedSumFuzzy", "nCalculatedSumEmpty", "nCalculatedSum2", "dblCalculatedTremor", "dblCalculatedValue");
	}
	public FTRSCAN_FAKE_REPLICA_PARAMETERS(int bCalculated, int nCalculatedSum1, int nCalculatedSumFuzzy, int nCalculatedSumEmpty, int nCalculatedSum2, double dblCalculatedTremor, double dblCalculatedValue) {
		super();
		this.bCalculated = bCalculated;
		this.nCalculatedSum1 = nCalculatedSum1;
		this.nCalculatedSumFuzzy = nCalculatedSumFuzzy;
		this.nCalculatedSumEmpty = nCalculatedSumEmpty;
		this.nCalculatedSum2 = nCalculatedSum2;
		this.dblCalculatedTremor = dblCalculatedTremor;
		this.dblCalculatedValue = dblCalculatedValue;
	}
	public FTRSCAN_FAKE_REPLICA_PARAMETERS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_FAKE_REPLICA_PARAMETERS implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_FAKE_REPLICA_PARAMETERS implements Structure.ByValue {
		
	};
}
