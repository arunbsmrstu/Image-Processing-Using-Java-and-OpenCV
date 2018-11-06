package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_FRAME_PARAMETERS extends Structure {
	public int nContrastOnDose2;
	public int nContrastOnDose4;
	public int nDose;
	public int nBrightnessOnDose1;
	public int nBrightnessOnDose2;
	public int nBrightnessOnDose3;
	public int nBrightnessOnDose4;
	/** C type : FTRSCAN_FAKE_REPLICA_PARAMETERS */
	public FTRSCAN_FAKE_REPLICA_PARAMETERS FakeReplicaParams;
	/** C type : unsigned char[64] */
	public byte[] Reserved = new byte[64];
	public FTRSCAN_FRAME_PARAMETERS() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("nContrastOnDose2", "nContrastOnDose4", "nDose", "nBrightnessOnDose1", "nBrightnessOnDose2", "nBrightnessOnDose3", "nBrightnessOnDose4", "FakeReplicaParams", "Reserved");
	}
	/**
	 * @param FakeReplicaParams C type : FTRSCAN_FAKE_REPLICA_PARAMETERS<br>
	 * @param Reserved C type : unsigned char[64]
	 */
	public FTRSCAN_FRAME_PARAMETERS(int nContrastOnDose2, int nContrastOnDose4, int nDose, int nBrightnessOnDose1, int nBrightnessOnDose2, int nBrightnessOnDose3, int nBrightnessOnDose4, FTRSCAN_FAKE_REPLICA_PARAMETERS FakeReplicaParams, byte Reserved[]) {
		super();
		this.nContrastOnDose2 = nContrastOnDose2;
		this.nContrastOnDose4 = nContrastOnDose4;
		this.nDose = nDose;
		this.nBrightnessOnDose1 = nBrightnessOnDose1;
		this.nBrightnessOnDose2 = nBrightnessOnDose2;
		this.nBrightnessOnDose3 = nBrightnessOnDose3;
		this.nBrightnessOnDose4 = nBrightnessOnDose4;
		this.FakeReplicaParams = FakeReplicaParams;
		if ((Reserved.length != this.Reserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Reserved = Reserved;
	}
	public FTRSCAN_FRAME_PARAMETERS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_FRAME_PARAMETERS implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_FRAME_PARAMETERS implements Structure.ByValue {
		
	};
}
