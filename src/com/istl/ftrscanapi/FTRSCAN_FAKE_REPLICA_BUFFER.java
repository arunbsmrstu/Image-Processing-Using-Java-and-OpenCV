package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_FAKE_REPLICA_BUFFER extends Structure {
	public int bCalculated;
	public int nBuffers;
	public int nWidth;
	public int nHeight;
	public int nSize;
	/** C type : void* */
	public Pointer pBuffers;
	public FTRSCAN_FAKE_REPLICA_BUFFER() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bCalculated", "nBuffers", "nWidth", "nHeight", "nSize", "pBuffers");
	}
	/** @param pBuffers C type : void* */
	public FTRSCAN_FAKE_REPLICA_BUFFER(int bCalculated, int nBuffers, int nWidth, int nHeight, int nSize, Pointer pBuffers) {
		super();
		this.bCalculated = bCalculated;
		this.nBuffers = nBuffers;
		this.nWidth = nWidth;
		this.nHeight = nHeight;
		this.nSize = nSize;
		this.pBuffers = pBuffers;
	}
	public FTRSCAN_FAKE_REPLICA_BUFFER(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_FAKE_REPLICA_BUFFER implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_FAKE_REPLICA_BUFFER implements Structure.ByValue {
		
	};
}
