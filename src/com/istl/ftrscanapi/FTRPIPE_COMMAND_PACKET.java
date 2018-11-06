package com.istl.ftrscanapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class FTRPIPE_COMMAND_PACKET extends Structure {
	public NativeLong dwLabel;
	public NativeLong dwInDataSize;
	public NativeLong dwWaitDataSize;
	public NativeLong dwOperationStatus;
	public FTRPIPE_COMMAND_PACKET() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dwLabel", "dwInDataSize", "dwWaitDataSize", "dwOperationStatus");
	}
	public FTRPIPE_COMMAND_PACKET(NativeLong dwLabel, NativeLong dwInDataSize, NativeLong dwWaitDataSize, NativeLong dwOperationStatus) {
		super();
		this.dwLabel = dwLabel;
		this.dwInDataSize = dwInDataSize;
		this.dwWaitDataSize = dwWaitDataSize;
		this.dwOperationStatus = dwOperationStatus;
	}
	public FTRPIPE_COMMAND_PACKET(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTRPIPE_COMMAND_PACKET implements Structure.ByReference {
		
	};
	public static class ByValue extends FTRPIPE_COMMAND_PACKET implements Structure.ByValue {
		
	};
}
