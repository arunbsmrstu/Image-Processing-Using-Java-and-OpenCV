package com.istl.ftrscanapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_VERSION extends Structure {
	public short wMajorVersionHi;
	public short wMajorVersionLo;
	public short wMinorVersionHi;
	public short wMinorVersionLo;
	public FTRSCAN_VERSION() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("wMajorVersionHi", "wMajorVersionLo", "wMinorVersionHi", "wMinorVersionLo");
	}
	public FTRSCAN_VERSION(short wMajorVersionHi, short wMajorVersionLo, short wMinorVersionHi, short wMinorVersionLo) {
		super();
		this.wMajorVersionHi = wMajorVersionHi;
		this.wMajorVersionLo = wMajorVersionLo;
		this.wMinorVersionHi = wMinorVersionHi;
		this.wMinorVersionLo = wMinorVersionLo;
	}
	public FTRSCAN_VERSION(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_VERSION implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_VERSION implements Structure.ByValue {
		
	};
}
