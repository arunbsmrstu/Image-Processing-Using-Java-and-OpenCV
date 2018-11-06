package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_VERSION_INFO extends Structure {
	/** [in, out] */
	public NativeLong dwVersionInfoSize;
	/** C type : FTRSCAN_VERSION */
	public FTRSCAN_VERSION APIVersion;
	/** C type : FTRSCAN_VERSION */
	public FTRSCAN_VERSION HardwareVersion;
	/** C type : FTRSCAN_VERSION */
	public FTRSCAN_VERSION FirmwareVersion;
	public FTRSCAN_VERSION_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dwVersionInfoSize", "APIVersion", "HardwareVersion", "FirmwareVersion");
	}
	/**
	 * @param dwVersionInfoSize [in, out]<br>
	 * @param APIVersion C type : FTRSCAN_VERSION<br>
	 * @param HardwareVersion C type : FTRSCAN_VERSION<br>
	 * @param FirmwareVersion C type : FTRSCAN_VERSION
	 */
	public FTRSCAN_VERSION_INFO(NativeLong dwVersionInfoSize, FTRSCAN_VERSION APIVersion, FTRSCAN_VERSION HardwareVersion, FTRSCAN_VERSION FirmwareVersion) {
		super();
		this.dwVersionInfoSize = dwVersionInfoSize;
		this.APIVersion = APIVersion;
		this.HardwareVersion = HardwareVersion;
		this.FirmwareVersion = FirmwareVersion;
	}
	public FTRSCAN_VERSION_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_VERSION_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_VERSION_INFO implements Structure.ByValue {
		
	};
}
