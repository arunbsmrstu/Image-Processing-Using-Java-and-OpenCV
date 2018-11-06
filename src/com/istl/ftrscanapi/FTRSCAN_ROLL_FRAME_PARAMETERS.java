package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRSCAN_ROLL_FRAME_PARAMETERS extends Structure {
	public NativeLong dwSize;
	public NativeLong dwFlags;
	public NativeLong dwStatus;
	public NativeLong dwRollingResult;
	public NativeLong dwDirection;
	public NativeLong dwFrameIndex;
	public NativeLong dwFrameDose;
	public NativeLong dwFrameContrast;
	public NativeLong dwFrameTimeMs;
	public FTRSCAN_ROLL_FRAME_PARAMETERS() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dwSize", "dwFlags", "dwStatus", "dwRollingResult", "dwDirection", "dwFrameIndex", "dwFrameDose", "dwFrameContrast", "dwFrameTimeMs");
	}
	public FTRSCAN_ROLL_FRAME_PARAMETERS(NativeLong dwSize, NativeLong dwFlags, NativeLong dwStatus, NativeLong dwRollingResult, NativeLong dwDirection, NativeLong dwFrameIndex, NativeLong dwFrameDose, NativeLong dwFrameContrast, NativeLong dwFrameTimeMs) {
		super();
		this.dwSize = dwSize;
		this.dwFlags = dwFlags;
		this.dwStatus = dwStatus;
		this.dwRollingResult = dwRollingResult;
		this.dwDirection = dwDirection;
		this.dwFrameIndex = dwFrameIndex;
		this.dwFrameDose = dwFrameDose;
		this.dwFrameContrast = dwFrameContrast;
		this.dwFrameTimeMs = dwFrameTimeMs;
	}
	public FTRSCAN_ROLL_FRAME_PARAMETERS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRSCAN_ROLL_FRAME_PARAMETERS implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRSCAN_ROLL_FRAME_PARAMETERS implements Structure.ByValue {
		
	};
}
