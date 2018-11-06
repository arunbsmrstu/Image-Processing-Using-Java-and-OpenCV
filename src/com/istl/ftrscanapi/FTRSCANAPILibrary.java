package com.istl.ftrscanapi;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.NativeLongByReference;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;
import com.sun.jna.win32.StdCallLibrary;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;

public interface FTRSCANAPILibrary extends StdCallLibrary {
	public static final String JNA_LIBRARY_NAME = "ftrScanAPI";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(FTRSCANAPILibrary.JNA_LIBRARY_NAME);
	public static final FTRSCANAPILibrary INSTANCE = (FTRSCANAPILibrary)Native.loadLibrary(FTRSCANAPILibrary.JNA_LIBRARY_NAME, FTRSCANAPILibrary.class);
	/** enum values */
	public static interface FTRSCAN_INTERFACE_STATUS {		
		public static final int FTRSCAN_INTERFACE_STATUS_CONNECTED = 0;		
		public static final int FTRSCAN_INTERFACE_STATUS_DISCONNECTED = 1;
	};
	public static final int TRUE = (int)1;
	public static final int FALSE = (int)0;
	public static final int NULL = (int)0;
	public static final int ERROR_NOT_ENOUGH_MEMORY = (int)8;
	public static final int ERROR_WRITE_PROTECT = (int)19;
	public static final int ERROR_NOT_READY = (int)21;
	public static final int ERROR_NOT_SUPPORTED = (int)50;
	public static final int ERROR_INVALID_PARAMETER = (int)87;
	public static final int ERROR_CALL_NOT_IMPLEMENTED = (int)120;
	public static final int ERROR_NO_MORE_ITEMS = (int)259;
	public static final int ERROR_PORT_UNREACHABLE = (int)1234;
	public static final int ERROR_NO_SYSTEM_RESOURCES = (int)1450;
	public static final int ERROR_TIMEOUT = (int)1460;
	public static final int ERROR_BAD_CONFIGURATION = (int)1610;
	public static final int ERROR_MESSAGE_EXCEEDS_MAX_SIZE = (int)4336;
	public static final int FTR_MAX_INTERFACE_NUMBER = (int)128;
	public static final int FTR_OPTIONS_CHECK_FAKE_REPLICA = (int)0x00000001;
	public static final int FTR_OPTIONS_DETECT_FAKE_FINGER = (int)0x00000001;
	public static final int FTR_OPTIONS_FAST_FINGER_DETECT_METHOD = (int)0x00000002;
	public static final int FTR_OPTIONS_RECEIVE_LONG_IMAGE = (int)0x00000004;
	public static final int FTR_OPTIONS_RECEIVE_FAKE_IMAGE = (int)0x00000008;
	public static final int FTR_OPTIONS_SCALE_IMAGE = (int)0x00000010;
	public static final int FTR_OPTIONS_IMPROVE_IMAGE = (int)0x00000020;
	public static final int FTR_OPTIONS_INVERT_IMAGE = (int)0x00000040;
	public static final int FTR_OPTIONS_PREVIEW_MODE = (int)0x00000080;
	public static final int FTR_OPTIONS_IMAGE_FORMAT_MASK = (int)0x00000700;
	public static final int FTR_OPTIONS_IMAGE_FORMAT_1 = (int)0x00000100;
	public static final int FTR_OPTIONS_ELIMINATE_BACKGROUND = (int)0x00000800;
	public static final int FTR_OPTIONS_IMPROVE_BACKGROUND = (int)0x00001000;
	public static final int FTR_OPTIONS_ROLL_THRESHOLD_MASK = (int)0x001F0000;
	public static final int FTR_OPTIONS_ROLL_THRESHOLD_1 = (int)0x00010000;
	public static final int FTR_GLOBAL_ENABLE_REMOTE_SESSION_DETECTION = (int)0x00000001;
	public static final int FTR_GLOBAL_SYNC_DIR = (int)0x00000002;
	public static final int FTR_GLOBAL_USB_HOST_CONTEXT_VERSION = (int)0x00000003;
	public static final int FTR_GLOBAL_SAVE_SESSION_TO_FILE = (int)0x00000004;
	public static final int FTR_GLOBAL_BLOCK_UNIX_SIGNALS = (int)0x00000005;
	public static final int FTR_GLOBAL_DISABLE_ENCRYPTION = (int)0x00000006;
	public static final int FTR_GLOBAL_VALUE_REMOTE_SESSION_ENABLE = (int)0x00000001;
	public static final int FTR_GLOBAL_VALUE_REMOTE_SESSION_DISABLE = (int)0x00000000;
	public static final int FTR_GLOBAL_VALUE_USB_HOST_CONTEXT_VERSION_MAX = (int)0x00000002;
	public static final int FTR_LIGHT_NO_LIGHT = (int)0x00;
	public static final int FTR_LIGHT_MAIN_IFRED = (int)0x01;
	public static final int FTR_LIGHT_ADDITIONAL_IFRED = (int)0x02;
	public static final int FTR_LIGHT_BACK_IFRED = (int)0x04;
	public static final int FTR_LIGHT_GREEN = (int)0x08;
	public static final int FTR_LIGHT_OFF_MAIN_IFRED = (int)(0x7F & (0x01));
	public static final int FTR_LIGHT_OFF_ADDITIONAL_IFRED = (int)(0x7F & (0x02));
	public static final int FTR_LIGHT_OFF_BACK_IFRED = (int)(0x7F & (0x04));
	public static final int FTR_LIGHT_OFF_GREEN = (int)(0x7F & (0x08));
	public static final int FTR_LIGHT_ON_MAIN_IFRED = (int)(0x80 | (0x01));
	public static final int FTR_LIGHT_ON_ADDITIONAL_IFRED = (int)(0x80 | (0x02));
	public static final int FTR_LIGHT_ON_BACK_IFRED = (int)(0x80 | (0x04));
	public static final int FTR_LIGHT_ON_GREEN = (int)(0x80 | (0x08));
	public static final int FTR_ERROR_BASE = (int)0x20000000;
	public static final int FTR_ERROR_NO_ERROR = (int)0;
	public static final int FTR_ERROR_EMPTY_FRAME = (int)4306;
	public static final int FTR_ERROR_MOVABLE_FINGER = (int)(0x20000000 | (0x0001));
	public static final int FTR_ERROR_NO_FRAME = (int)(0x20000000 | (0x0002));
	public static final int FTR_ERROR_USER_CANCELED = (int)(0x20000000 | (0x0003));
	public static final int FTR_ERROR_HARDWARE_INCOMPATIBLE = (int)(0x20000000 | (0x0004));
	public static final int FTR_ERROR_FIRMWARE_INCOMPATIBLE = (int)(0x20000000 | (0x0005));
	public static final int FTR_ERROR_INVALID_AUTHORIZATION_CODE = (int)(0x20000000 | (0x0006));
	public static final int FTR_ERROR_ROLL_NOT_STARTED = (int)(0x20000000 | (0x0007));
	public static final int FTR_ERROR_ROLL_PROGRESS_DATA = (int)(0x20000000 | (0x0008));
	public static final int FTR_ERROR_ROLL_TIMEOUT = (int)(0x20000000 | (0x0009));
	public static final int FTR_ERROR_ROLL_ABORTED = (int)(0x20000000 | (0x000A));
	public static final int FTR_ERROR_ROLL_ALREADY_STARTED = (int)(0x20000000 | (0x000B));
	public static final int FTR_ERROR_ROLL_PROGRESS_REMOVE_FINGER = (int)(0x20000000 | (0x000C));
	public static final int FTR_ERROR_ROLL_PROGRESS_PUT_FINGER = (int)(0x20000000 | (0x000D));
	public static final int FTR_ERROR_ROLL_PROGRESS_POST_PROCESSING = (int)(0x20000000 | (0x000E));
	public static final int FTR_ERROR_FINGER_IS_PRESENT = (int)(0x20000000 | (0x000F));
	public static final int FTR_ERROR_NULL_PARAMETER = (int)(0x20000000 | (0x0010));
	public static final int FTR_ERROR_LIBUSB_ERROR = (int)(0x20000000 | (0x0011));
	public static final int FTR_ERROR_VERSION_NOT_SUPPORTED = (int)(0x20000000 | (0x0012));
	public static final int FTR_ERROR_BAD_CALLBACK_FUNCTION = (int)(0x20000000 | (0x0013));
	public static final int FTR_ERROR_GENERAL_ENCRYPTION = (int)(0x20000000 | (0x0014));
	public static final int FTR_ERROR_NO_MORE_ITEMS = (int)259;
	public static final int FTR_ERROR_NOT_ENOUGH_MEMORY = (int)8;
	public static final int FTR_ERROR_NO_SYSTEM_RESOURCES = (int)1450;
	public static final int FTR_ERROR_TIMEOUT = (int)1460;
	public static final int FTR_ERROR_NOT_READY = (int)21;
	public static final int FTR_ERROR_BAD_CONFIGURATION = (int)1610;
	public static final int FTR_ERROR_INVALID_PARAMETER = (int)87;
	public static final int FTR_ERROR_CALL_NOT_IMPLEMENTED = (int)120;
	public static final int FTR_ERROR_NOT_SUPPORTED = (int)50;
	public static final int FTR_ERROR_WRITE_PROTECT = (int)19;
	public static final int FTR_ERROR_MESSAGE_EXCEEDS_MAX_SIZE = (int)4336;
	public static final int FTR_ERROR_PORT_UNREACHABLE = (int)1234;
	public static final int FTR_LOG_MASK_OFF = (int)0;
	public static final int FTR_LOG_MASK_TO_FILE = (int)0x00000001;
	public static final int FTR_LOG_MASK_TO_AUX = (int)0x00000002;
	public static final int FTR_LOG_MASK_TIMESTAMP = (int)0x00000004;
	public static final int FTR_LOG_MASK_THREAD_ID = (int)0x00000008;
	public static final int FTR_LOG_MASK_PROCESS_ID = (int)0x00000010;
	public static final int FTR_LOG_LEVEL_MIN = (int)0;
	public static final int FTR_LOG_LEVEL_OPTIMAL = (int)1;
	public static final int FTR_LOG_LEVEL_FULL = (int)2;
	public static final int FTR_DEVICE_USB_1_1 = (int)0;
	public static final int FTR_DEVICE_USB_2_0_TYPE_1 = (int)1;
	public static final int FTR_DEVICE_SWEEP = (int)2;
	public static final int FTR_DEVICE_USB_2_0_TYPE_2 = (int)4;
	public static final int FTR_DEVICE_USB_2_0_TYPE_3 = (int)5;
	public static final int FTR_DEVICE_USB_2_0_TYPE_4 = (int)6;
	public static final int FTR_DEVICE_USB_2_0_TYPE_50 = (int)7;
	public static final int FTR_DEVICE_USB_2_0_TYPE_60 = (int)8;
	public static final int FTR_DEVICE_USB_2_0_TYPE_25 = (int)9;
	public static final int FTR_DEVICE_USB_2_0_TYPE_10 = (int)10;
	public static final int FTR_DEVICE_USB_2_0_TYPE_80W = (int)11;
	public static final int FTR_DEVICE_USB_2_0_TYPE_90B = (int)12;
	public static final int FTR_DEVICE_USB_2_0_TYPE_80H = (int)13;
	public static final int FTR_DEVICE_USB_2_0_TYPE_88H = (int)14;
	public static final int FTR_DEVICE_USB_2_0_TYPE_64 = (int)15;
	public static final int FTR_DEVICE_USB_2_0_TYPE_26E = (int)16;
	public static final int FTR_DEVICE_USB_2_0_TYPE_80HS = (int)17;
	public static final int FTR_DEVICE_USB_2_0_TYPE_98 = (int)210;
	public static final int FTR_SCANNER_FEATURE_LFD = (int)1;
	public static final int FTR_SCANNER_FEATURE_DIODES = (int)2;
	public static final int FTR_SCANNER_FEATURE_GET_IMAGE2 = (int)3;
	public static final int FTR_SCANNER_FEATURE_SERIAL_NUMBER = (int)4;
	public static final int FTR_SCANNER_FEATURE_LONG_IMAGE = (int)5;
	public static final int FTR_SCANNER_FEATURE_IS_CALIBRATED = (int)6;
	public static final int FTR_SCANNER_FEATURE_IS_LFD_CALIBRATED = (int)7;
	public static final int FTR_SCANNER_FEATURE_ROLL = (int)8;
	public static final int FTR_SCANNER_FEATURE_ENCRYPTION = (int)9;
	public static final int FTR_POWER_EVENT_SLEEP = (int)0x00000001;
	public static final int FTR_POWER_EVENT_SESSION_DISCONNECT = (int)0x00000002;
	public static final int FTR_POWER_EVENT_SESSION_LOGOFF = (int)0x00000004;
	public static final int FTR_POWER_EVENT_LOGGING_OFF = (int)0x00000008;
	public static final int FTR_POWER_EVENT_SHUTDOWN = (int)0x00000010;
	public static final int FTR_POWER_EVENT_LOCK = (int)0x00000020;
	public static final long FTR_POWER_EVENT_ALL = (long)0xFFFFFFFFL;
	/**
	 * define<br>
	 * Conversion Error : 0xFFFFFFFF, 0<br>
	 * SKIPPED:<br>
	 * <i>native declaration : line 0</i><br>
	 * 0xFFFFFFFF, 0
	 */
	/**
	 * define<br>
	 * Conversion Error : 0xFFFFFFFF, 0xFFFFFFFF<br>
	 * SKIPPED:<br>
	 * <i>native declaration : line 0</i><br>
	 * 0xFFFFFFFF, 0xFFFFFFFF
	 */
	public static final long FTR_TIMEOUT_INFINITE = (long)0xFFFFFFFFL;
	public static final int FTR_REGISTRY_INDEX_LUM_AVERAGE = (int)0;
	public static final int FTR_PROPERTY_NUMBER_OF_IMAGE_SIZES = (int)1;
	public static final int FTR_PROPERTY_LFD_LEVEL = (int)2;
	public static final int FTR_PROPERTY_LFD_SW_1_CALCULATED_DATA = (int)3;
	public static final int FTR_PROPERTY_LFD_SW_1_PARAM = (int)4;
	public static final int FTR_PROPERTY_LFD_SW_1_RESERVED = (int)5;
	public static final int FTR_PROPERTY_LFD_SW_2_CALCULATED_DATA = (int)6;
	public static final int FTR_PROPERTY_LFD_SW_2_PARAM = (int)7;
	public static final int FTR_PROPERTY_LFD_D_SW_2_CALCULATED_DATA = (int)8;
	public static final int FTR_PROPERTY_ENCRYPTION = (int)9;
	public static final int FTR_PROPERTY_ENCRYPTED_RAW_IMAGE_PTR = (int)10;
	public static final int FTR_PROPERTY_ENCRYPTED_RAW_IMAGE_SIZE = (int)11;
	public static final int FTR_ROLL_DIRECTION_NOT_DEFINED = (int)0;
	public static final int FTR_ROLL_DIRECTION_FROM_LEFT_TO_RIGHT = (int)1;
	public static final int FTR_ROLL_DIRECTION_FROM_RIGHT_TO_LEFT = (int)2;
	public static final int FTR_ROLL_FRAME_PARAM_FLAG_NOT_CALIBRATED = (int)0x00000001;
	public static final int FTR_ROLL_FRAME_PARAM_FLAG_INDEX = (int)0x00000002;
	public static final int FTR_ROLL_FRAME_PARAM_FLAG_DOSE = (int)0x00000004;
	public static final int FTR_ROLL_FRAME_PARAM_FLAG_CONRAST = (int)0x00000008;
	public static final int FTR_ROLL_RESULT_OK = (int)0;
	public static final int FTR_ROLL_RESULT_REVERSE_ROLLING = (int)1;
	public static final int FTR_ROLL_RESULT_TOO_FAST_ROLLING = (int)2;
	public static final int FTR_ROLL_RESULT_SLIPPAGE_AREAS = (int)3;
	public static final int FTR_ROLL_RESULT_BREAK = (int)4;
	public static final int FTR_ROLL_CB_REASON_PUT_FINGER = (int)0x00000001;
	public static final int FTR_ROLL_CB_REASON_REMOVE_FINGER = (int)0x00000002;
	public static final int FTR_ROLL_CB_REASON_PROCESSING = (int)0x00000003;
	public static final int FTR_ROLL_CB_REASON_BEFORE_POSTPROCESSING = (int)0x00000004;
	public static final int FTR_ROLL_CB_REASON_POSTPROCESSING = (int)0x00000005;
	public static final int FTR_ROLL_CB_REASON_AFTER_POSTPROCESSING = (int)0x00000006;
	public static final int FTR_ROLL_CB_REASON_STARTED = (int)0x00000007;
	public static final int FTR_ROLL_CB_REASON_ABORTED = (int)0x00000008;
	public static final int FTR_ROLL_CB_REASON_KEEP_EMPTY = (int)0x00000009;
	public static final int FTR_ROLL_CB_OPERATION_SET_DIODES_STATUS = (int)0x00000001;
	public static final int FTR_ROLL_CB_OPERATION_SET_GET_PIN_STATUS = (int)0x00000002;
	public static final int FTR_LFD_MODE_HW = (int)0x00000001;
	public static final int FTR_LFD_MODE_SW_1 = (int)0x00000002;
	public static final int FTR_LFD_MODE_SW_2 = (int)0x00000004;
	public static final int FTR_LFD_MODE_SW_1_MAX_STRENGTH = (int)9;
	public static final int FTR_LFD_MODE_SW_2_MOST_LIKELY_TO_BE_FAKE = (int)5;
	public static final int FTR_LFD_LEVEL_1 = (int)0x00000001;
	public static final int FTR_LFD_LEVEL_2 = (int)(0x00000001 | 0x00000002);
	public static final int FTR_LFD_LEVEL_3 = (int)(0x00000001 | 0x00000004);
	public static final int FTR_LFD_LEVEL_MAX = (int)(0x00000001 | 0x00000002 | 0x00000004);
	public static final int FTR_VERSION_UNKNOWN_VERSION = (int)0xFFFF;
	public interface PFTRROLLFNCB extends StdCallLibrary.StdCallCallback {
		int apply(Pointer pUserContext, NativeLong dwRollCallbackReason, Pointer pFtrContext, Pointer pReasonCtx);
	};
	/**
	 * Original signature : <code>void* ftrScanOpenDevice()</code><br>
	 * <i>native declaration : line 422</i>
	 */
	Pointer ftrScanOpenDevice();
	/**
	 * Original signature : <code>void* ftrScanOpenDeviceOnInterface(int)</code><br>
	 * <i>native declaration : line 424</i>
	 */
	Pointer ftrScanOpenDeviceOnInterface(int nInterface);
	/**
	 * Original signature : <code>void* ftrScanOpenDeviceWithIoContext(void*)</code><br>
	 * <i>native declaration : line 426</i>
	 */
	Pointer ftrScanOpenDeviceWithIoContext(Pointer pContext);
	/**
	 * Original signature : <code>void ftrScanCloseDevice(void*)</code><br>
	 * <i>native declaration : line 428</i>
	 */
	void ftrScanCloseDevice(Pointer ftrHandle);
	/**
	 * Original signature : <code>int ftrScanSetOptions(void*, unsigned long, unsigned long)</code><br>
	 * <i>native declaration : line 430</i>
	 */
	int ftrScanSetOptions(Pointer ftrHandle, NativeLong dwMask, NativeLong dwFlags);
	/**
	 * Original signature : <code>int ftrScanGetOptions(void*, unsigned long*)</code><br>
	 * <i>native declaration : line 432</i>
	 */
	int ftrScanGetOptions(Pointer ftrHandle, NativeLongByReference lpdwFlags);
	/**
	 * Original signature : <code>int ftrScanGetDeviceInfo(void*, PFTRSCAN_DEVICE_INFO)</code><br>
	 * <i>native declaration : line 434</i>
	 */
	int ftrScanGetDeviceInfo(Pointer ftrHandle, FTRSCAN_DEVICE_INFO pDeviceInfo);
	/**
	 * Original signature : <code>int ftrScanGetInterfaces(PFTRSCAN_INTERFACES_LIST)</code><br>
	 * <i>native declaration : line 436</i>
	 */
	int ftrScanGetInterfaces(FTRSCAN_INTERFACES_LIST pInterfaceList);
	/**
	 * Original signature : <code>int ftrSetBaseInterface(int)</code><br>
	 * <i>native declaration : line 438</i>
	 */
	int ftrSetBaseInterface(int nBaseInterface);
	/**
	 * Original signature : <code>int ftrGetBaseInterfaceNumber()</code><br>
	 * <i>native declaration : line 440</i>
	 */
	int ftrGetBaseInterfaceNumber();
	/**
	 * Original signature : <code>int ftrSetLoggingFacilityLevel(unsigned long, unsigned long, char*)</code><br>
	 * <i>native declaration : line 442</i><br>
	 * @deprecated use the safer methods {@link #ftrSetLoggingFacilityLevel(com.sun.jna.NativeLong, com.sun.jna.NativeLong, java.nio.ByteBuffer)} and {@link #ftrSetLoggingFacilityLevel(com.sun.jna.NativeLong, com.sun.jna.NativeLong, com.sun.jna.Pointer)} instead
	 */
	 
	int ftrSetLoggingFacilityLevel(NativeLong dwLogMask, NativeLong dwLogLevel, Pointer lpFileName);
	/**
	 * Original signature : <code>int ftrSetLoggingFacilityLevel(unsigned long, unsigned long, char*)</code><br>
	 * <i>native declaration : line 442</i>
	 */
	///int ftrSetLoggingFacilityLevel(NativeLong dwLogMask, NativeLong dwLogLevel, ByteBuffer lpFileName);
	/**
	 * Original signature : <code>long ftrScanGetLastError()</code><br>
	 * <i>native declaration : line 444</i>
	 */
	NativeLong ftrScanGetLastError();
	/**
	 * Original signature : <code>void ftrScanSetLastError(unsigned long)</code><br>
	 * <i>native declaration : line 446</i>
	 */
	void ftrScanSetLastError(NativeLong dwErrCode);
	/**
	 * Original signature : <code>int ftrScanGetVersion(void*, PFTRSCAN_VERSION_INFO)</code><br>
	 * <i>native declaration : line 448</i>
	 */
	int ftrScanGetVersion(Pointer ftrHandle, FTRSCAN_VERSION_INFO pVersionInfo);
	/**
	 * Original signature : <code>int ftrScanIsScannerFeaturePresent(void*, int, int*)</code><br>
	 * <i>native declaration : line 450</i><br>
	 * @deprecated use the safer methods {@link #ftrScanIsScannerFeaturePresent(com.sun.jna.Pointer, int, java.nio.IntBuffer)} and {@link #ftrScanIsScannerFeaturePresent(com.sun.jna.Pointer, int, com.sun.jna.ptr.IntByReference)} instead
	 */
	///@Deprecated 
	int ftrScanIsScannerFeaturePresent(Pointer ftrHandle, int nScannerFeature, IntByReference pIsPresent);
	/**
	 * Original signature : <code>int ftrScanIsScannerFeaturePresent(void*, int, int*)</code><br>
	 * <i>native declaration : line 450</i>
	 */
	///int ftrScanIsScannerFeaturePresent(Pointer ftrHandle, int nScannerFeature, IntBuffer pIsPresent);
	/**
	 * Original signature : <code>int ftrScanGetFakeReplicaInterval(double*, double*)</code><br>
	 * <i>native declaration : line 452</i><br>
	 * @deprecated use the safer methods {@link #ftrScanGetFakeReplicaInterval(java.nio.DoubleBuffer, java.nio.DoubleBuffer)} and {@link #ftrScanGetFakeReplicaInterval(com.sun.jna.ptr.DoubleByReference, com.sun.jna.ptr.DoubleByReference)} instead
	 */
	///@Deprecated 
	int ftrScanGetFakeReplicaInterval(DoubleByReference pdblMinFakeReplicaValue, DoubleByReference pdblMaxFakeReplicaValue);
	/**
	 * Original signature : <code>int ftrScanGetFakeReplicaInterval(double*, double*)</code><br>
	 * <i>native declaration : line 452</i>
	 */
	///int ftrScanGetFakeReplicaInterval(DoubleBuffer pdblMinFakeReplicaValue, DoubleBuffer pdblMaxFakeReplicaValue);
	/**
	 * Original signature : <code>void ftrScanSetFakeReplicaInterval(double, double)</code><br>
	 * <i>native declaration : line 454</i>
	 */
	void ftrScanSetFakeReplicaInterval(double dblMinFakeReplicaValue, double dblMaxFakeReplicaValue);
	/**
	 * Original signature : <code>int ftrScanGetLFDParameters(PFTRSCAN_LFD_CONSTANTS)</code><br>
	 * <i>native declaration : line 456</i>
	 */
	int ftrScanGetLFDParameters(FTRSCAN_LFD_CONSTANTS pLFDParameters);
	/**
	 * Original signature : <code>int ftrScanSetLFDParameters(PFTRSCAN_LFD_CONSTANTS)</code><br>
	 * <i>native declaration : line 458</i>
	 */
	int ftrScanSetLFDParameters(FTRSCAN_LFD_CONSTANTS pLFDParameters);
	/**
	 * Original signature : <code>int ftrScanGetScanParameters(void*, unsigned long, void*)</code><br>
	 * <i>native declaration : line 460</i>
	 */
	int ftrScanGetScanParameters(Pointer ftrHandle, NativeLong dwParamCode, Pointer pOutBuffer);
	/**
	 * Original signature : <code>int ftrScanGetImageSize(void*, PFTRSCAN_IMAGE_SIZE)</code><br>
	 * <i>native declaration : line 462</i>
	 */
	int ftrScanGetImageSize(Pointer ftrHandle, FTRSCAN_IMAGE_SIZE pImageSize);
	/**
	 * Original signature : <code>int ftrScanGetImage(void*, int, void*)</code><br>
	 * <i>native declaration : line 464</i>
	 */
	int ftrScanGetImage(Pointer ftrHandle, int nDose, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetImage2(void*, int, void*)</code><br>
	 * <i>native declaration : line 466</i>
	 */
	int ftrScanGetImage2(Pointer ftrHandle, int nDose, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetFuzzyImage(void*, void*)</code><br>
	 * <i>native declaration : line 468</i>
	 */
	int ftrScanGetFuzzyImage(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetBacklightImage(void*, void*)</code><br>
	 * <i>native declaration : line 470</i>
	 */
	int ftrScanGetBacklightImage(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetDarkImage(void*, void*)</code><br>
	 * <i>native declaration : line 472</i>
	 */
	int ftrScanGetDarkImage(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetImageByVariableDose(void*, int, void*)</code><br>
	 * <i>native declaration : line 474</i>
	 */
	int ftrScanGetImageByVariableDose(Pointer ftrHandle, int nVariableDose, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGet4in1Image(void*, void*)</code><br>
	 * <i>native declaration : line 476</i>
	 */
	int ftrScanGet4in1Image(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetImageByVariableDoseEx(void*, int, unsigned char, PFTRSCAN_VAR_DOSE_EXTRA_PARAMS, void*)</code><br>
	 * <i>native declaration : line 478</i>
	 */
	int ftrScanGetImageByVariableDoseEx(Pointer ftrHandle, int nVariableDose, byte byLights, FTRSCAN_VAR_DOSE_EXTRA_PARAMS pExtraParams, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetRawImageSize(void*, PFTRSCAN_IMAGE_SIZE)</code><br>
	 * <i>native declaration : line 480</i>
	 */
	int ftrScanGetRawImageSize(Pointer ftrHandle, FTRSCAN_IMAGE_SIZE pImageSize);
	/**
	 * Original signature : <code>int ftrScanGetRawImageByVariableDose(void*, int, void*)</code><br>
	 * <i>native declaration : line 482</i>
	 */
	int ftrScanGetRawImageByVariableDose(Pointer ftrHandle, int nVariableDose, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetRawBacklightImage(void*, void*)</code><br>
	 * <i>native declaration : line 484</i>
	 */
	int ftrScanGetRawBacklightImage(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetRawDarkImage(void*, void*)</code><br>
	 * <i>native declaration : line 486</i>
	 */
	int ftrScanGetRawDarkImage(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanIsFingerPresent(void*, PFTRSCAN_FRAME_PARAMETERS)</code><br>
	 * <i>native declaration : line 488</i>
	 */
	int ftrScanIsFingerPresent(Pointer ftrHandle, FTRSCAN_FRAME_PARAMETERS pFrameParameters);
	/**
	 * Original signature : <code>int ftrScanGetFrame(void*, void*, PFTRSCAN_FRAME_PARAMETERS)</code><br>
	 * <i>native declaration : line 490</i>
	 */
	int ftrScanGetFrame(Pointer ftrHandle, Pointer pBuffer, FTRSCAN_FRAME_PARAMETERS pFrameParameters);
	/**
	 * Original signature : <code>int ftrScanSave7Bytes(void*, void*)</code><br>
	 * <i>native declaration : line 492</i>
	 */
	int ftrScanSave7Bytes(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanRestore7Bytes(void*, void*)</code><br>
	 * <i>native declaration : line 494</i>
	 */
	int ftrScanRestore7Bytes(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetExtMemorySize(void*, int*)</code><br>
	 * <i>native declaration : line 496</i><br>
	 * @deprecated use the safer methods {@link #ftrScanGetExtMemorySize(com.sun.jna.Pointer, java.nio.IntBuffer)} and {@link #ftrScanGetExtMemorySize(com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference)} instead
	 */
	///@Deprecated 
	int ftrScanGetExtMemorySize(Pointer ftrHandle, IntByReference pnSize);
	/**
	 * Original signature : <code>int ftrScanGetExtMemorySize(void*, int*)</code><br>
	 * <i>native declaration : line 496</i>
	 */
	///int ftrScanGetExtMemorySize(Pointer ftrHandle, IntBuffer pnSize);
	/**
	 * Original signature : <code>int ftrScanSaveExtMemory(void*, void*, int, int)</code><br>
	 * <i>native declaration : line 498</i>
	 */
	int ftrScanSaveExtMemory(Pointer ftrHandle, Pointer pBuffer, int nOffset, int nCount);
	/**
	 * Original signature : <code>int ftrScanRestoreExtMemory(void*, void*, int, int)</code><br>
	 * <i>native declaration : line 500</i>
	 */
	int ftrScanRestoreExtMemory(Pointer ftrHandle, Pointer pBuffer, int nOffset, int nCount);
	/**
	 * Original signature : <code>int ftrScanGetSerialNumber(void*, void*)</code><br>
	 * <i>native declaration : line 502</i>
	 */
	int ftrScanGetSerialNumber(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanSaveSerialNumber(void*, void*)</code><br>
	 * <i>native declaration : line 504</i>
	 */
	int ftrScanSaveSerialNumber(Pointer ftrHandle, Pointer pReserved);
	/**
	 * Original signature : <code>int ftrScanGetFirmwareMemorySize(void*, int*)</code><br>
	 * <i>native declaration : line 506</i><br>
	 * @deprecated use the safer methods {@link #ftrScanGetFirmwareMemorySize(com.sun.jna.Pointer, java.nio.IntBuffer)} and {@link #ftrScanGetFirmwareMemorySize(com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference)} instead
	 */
	////@Deprecated 
	int ftrScanGetFirmwareMemorySize(Pointer ftrHandle, IntByReference pnSize);
	/**
	 * Original signature : <code>int ftrScanGetFirmwareMemorySize(void*, int*)</code><br>
	 * <i>native declaration : line 506</i>
	 */
	///int ftrScanGetFirmwareMemorySize(Pointer ftrHandle, IntBuffer pnSize);
	/**
	 * Original signature : <code>int ftrScanSaveFirmwareMemory(void*, void*, int, int)</code><br>
	 * <i>native declaration : line 508</i>
	 */
	int ftrScanSaveFirmwareMemory(Pointer ftrHandle, Pointer pBuffer, int nOffset, int nCount);
	/**
	 * Original signature : <code>int ftrScanRestoreFirmwareMemory(void*, void*, int, int)</code><br>
	 * <i>native declaration : line 510</i>
	 */
	int ftrScanRestoreFirmwareMemory(Pointer ftrHandle, Pointer pBuffer, int nOffset, int nCount);
	/**
	 * Original signature : <code>int ftrScanGetCalibrationConstants(void*, unsigned char*, unsigned char*)</code><br>
	 * <i>native declaration : line 512</i><br>
	 * @deprecated use the safer methods {@link #ftrScanGetCalibrationConstants(com.sun.jna.Pointer, java.nio.ByteBuffer, java.nio.ByteBuffer)} and {@link #ftrScanGetCalibrationConstants(com.sun.jna.Pointer, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	///@Deprecated 
	int ftrScanGetCalibrationConstants(Pointer ftrHandle, Pointer pbyIRConst, Pointer pbyFuzzyConst);
	/**
	 * Original signature : <code>int ftrScanGetCalibrationConstants(void*, unsigned char*, unsigned char*)</code><br>
	 * <i>native declaration : line 512</i>
	 */
	///int ftrScanGetCalibrationConstants(Pointer ftrHandle, ByteBuffer pbyIRConst, ByteBuffer pbyFuzzyConst);
	/**
	 * Original signature : <code>int ftrScanStoreCalibrationConstants(void*, unsigned char, unsigned char, int)</code><br>
	 * <i>native declaration : line 514</i>
	 */
	int ftrScanStoreCalibrationConstants(Pointer ftrHandle, byte byIRConst, byte byFuzzyConst, int bBurnToFlash);
	/**
	 * Original signature : <code>int ftrScanGetFakeReplicaParameters(void*, PFTRSCAN_FAKE_REPLICA_PARAMETERS)</code><br>
	 * <i>native declaration : line 516</i>
	 */
	int ftrScanGetFakeReplicaParameters(Pointer ftrHandle, FTRSCAN_FAKE_REPLICA_PARAMETERS pFakeReplicaParams);
	/**
	 * Original signature : <code>int ftrScanGetFakeReplicaBuffer(void*, PFTRSCAN_FAKE_REPLICA_BUFFER)</code><br>
	 * <i>native declaration : line 518</i>
	 */
	int ftrScanGetFakeReplicaBuffer(Pointer ftrHandle, FTRSCAN_FAKE_REPLICA_BUFFER pFakeReplicaBuffer);
	/**
	 * Original signature : <code>int ftrScanSetNewAuthorizationCode(void*, void*)</code><br>
	 * <i>native declaration : line 520</i>
	 */
	int ftrScanSetNewAuthorizationCode(Pointer ftrHandle, Pointer pSevenBytesAuthorizationCode);
	/**
	 * Original signature : <code>int ftrScanSaveSecret7Bytes(void*, void*, void*)</code><br>
	 * <i>native declaration : line 522</i>
	 */
	int ftrScanSaveSecret7Bytes(Pointer ftrHandle, Pointer pSevenBytesAuthorizationCode, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanRestoreSecret7Bytes(void*, void*, void*)</code><br>
	 * <i>native declaration : line 524</i>
	 */
	int ftrScanRestoreSecret7Bytes(Pointer ftrHandle, Pointer pSevenBytesAuthorizationCode, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanSetDiodesStatus(void*, unsigned char, unsigned char)</code><br>
	 * <i>native declaration : line 526</i>
	 */
	int ftrScanSetDiodesStatus(Pointer ftrHandle, byte byGreenDiodeStatus, byte byRedDiodeStatus);
	/**
	 * Original signature : <code>int ftrScanGetDiodesStatus(void*, int*, int*)</code><br>
	 * <i>native declaration : line 528</i><br>
	 * @deprecated use the safer methods {@link #ftrScanGetDiodesStatus(com.sun.jna.Pointer, java.nio.IntBuffer, java.nio.IntBuffer)} and {@link #ftrScanGetDiodesStatus(com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	///@Deprecated 
	int ftrScanGetDiodesStatus(Pointer ftrHandle, IntByReference pbIsGreenDiodeOn, IntByReference pbIsRedDiodeOn);
	/**
	 * Original signature : <code>int ftrScanGetDiodesStatus(void*, int*, int*)</code><br>
	 * <i>native declaration : line 528</i>
	 */
	///int ftrScanGetDiodesStatus(Pointer ftrHandle, IntBuffer pbIsGreenDiodeOn, IntBuffer pbIsRedDiodeOn);
	/**
	 * Original signature : <code>int ftrScanSave7ControlBytes(void*, void*, int)</code><br>
	 * <i>native declaration : line 530</i>
	 */
	int ftrScanSave7ControlBytes(Pointer ftrHandle, Pointer pBuffer, int bBurnToFlash);
	/**
	 * Original signature : <code>int ftrScanRestore7ControlBytes(void*, void*)</code><br>
	 * <i>native declaration : line 532</i>
	 */
	int ftrScanRestore7ControlBytes(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanRollStart(void*)</code><br>
	 * <i>native declaration : line 534</i>
	 */
	int ftrScanRollStart(Pointer ftrHandle);
	/**
	 * Original signature : <code>int ftrScanRollStarWithVariableDose(void*, int)</code><br>
	 * <i>native declaration : line 536</i>
	 */
	int ftrScanRollStarWithVariableDose(Pointer ftrHandle, int nVariableDose);
	/**
	 * Original signature : <code>int ftrScanRollRawStart(void*)</code><br>
	 * <i>native declaration : line 538</i>
	 */
	int ftrScanRollRawStart(Pointer ftrHandle);
	/**
	 * Original signature : <code>int ftrScanRollRawStarWithVariableDose(void*, int)</code><br>
	 * <i>native declaration : line 540</i>
	 */
	int ftrScanRollRawStarWithVariableDose(Pointer ftrHandle, int nVariableDose);
	/**
	 * Original signature : <code>int ftrScanRollAbort(void*, int)</code><br>
	 * <i>native declaration : line 542</i>
	 */
	int ftrScanRollAbort(Pointer ftrHandle, int bSynchronous);
	/**
	 * Original signature : <code>int ftrScanRollGetImage(void*, void*, unsigned long)</code><br>
	 * <i>native declaration : line 544</i>
	 */
	int ftrScanRollGetImage(Pointer ftrHandle, Pointer pBuffer, NativeLong dwMilliseconds);
	/**
	 * Original signature : <code>int ftrScanRollGetFrameParameters(void*, PFTRSCAN_ROLL_FRAME_PARAMETERS, void*, unsigned long)</code><br>
	 * <i>native declaration : line 546</i>
	 */
	int ftrScanRollGetFrameParameters(Pointer ftrHandle, FTRSCAN_ROLL_FRAME_PARAMETERS pFrameParameters, Pointer pBuffer, NativeLong dwMilliseconds);
	/**
	 * Original signature : <code>int ftrScanRollSetCallBackFn(void*, PFTRROLLFNCB, void*)</code><br>
	 * <i>native declaration : line 550</i>
	 */
	int ftrScanRollSetCallBackFn(Pointer ftrHandle, FTRSCANAPILibrary.PFTRROLLFNCB pUserCbFb, Pointer pUserContext);
	/**
	 * Original signature : <code>int ftrScanRollDoOperationFromCb(void*, unsigned long, void*)</code><br>
	 * <i>native declaration : line 552</i>
	 */
	int ftrScanRollDoOperationFromCb(Pointer pFtrContext, NativeLong dwRollCbOperation, Pointer pRollCbOperationParam);
	/**
	 * Original signature : <code>int ftrScanChangeSystemNotification(unsigned long, unsigned long)</code><br>
	 * <i>native declaration : line 554</i>
	 */
	int ftrScanChangeSystemNotification(NativeLong dwMask, NativeLong dwFlags);
	/**
	 * Original signature : <code>int ftrScanGlobalSetOptions(unsigned long, void*)</code><br>
	 * <i>native declaration : line 556</i>
	 */
	int ftrScanGlobalSetOptions(NativeLong dwOption, Pointer pOptionData);
	/**
	 * Original signature : <code>int ftrScanGlobalGetOptions(unsigned long, void*)</code><br>
	 * <i>native declaration : line 558</i>
	 */
	int ftrScanGlobalGetOptions(NativeLong dwOption, Pointer pOptionData);
	/**
	 * Original signature : <code>int ftrScanGetStripImageSize(void*, PFTRSCAN_IMAGE_SIZE)</code><br>
	 * <i>native declaration : line 560</i>
	 */
	int ftrScanGetStripImageSize(Pointer ftrHandle, FTRSCAN_IMAGE_SIZE pImageSize);
	/**
	 * Original signature : <code>int ftrScanGetStripImageByVariableDose(void*, int, void*)</code><br>
	 * <i>native declaration : line 562</i>
	 */
	int ftrScanGetStripImageByVariableDose(Pointer ftrHandle, int nVariableDose, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetRegistryValues(void*, void*)</code><br>
	 * <i>native declaration : line 564</i>
	 */
	int ftrScanGetRegistryValues(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanConvertRawToFinalImage(void*, void*, void*, int)</code><br>
	 * <i>native declaration : line 566</i>
	 */
	int ftrScanConvertRawToFinalImage(Pointer ftrHandle, Pointer pRawImageBuffer, Pointer pFinalImageBuffer, int nDose);
	/**
	 * Original signature : <code>int ftrSweepGetSlice(void*, void*)</code><br>
	 * <i>native declaration : line 568</i>
	 */
	int ftrSweepGetSlice(Pointer ftrHandle, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrSweepGetMultipleSlices(void*, int, void*)</code><br>
	 * <i>native declaration : line 570</i>
	 */
	int ftrSweepGetMultipleSlices(Pointer ftrHandle, int nSlices, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanControlPin3(void*, unsigned long*, unsigned long, unsigned long)</code><br>
	 * <i>native declaration : line 572</i>
	 */
	int ftrScanControlPin3(Pointer ftrHandle, NativeLongByReference pdwParam1, NativeLong dwParam2, NativeLong dwPeriod);
	/**
	 * Original signature : <code>int ftrScanGetButtonState(void*, unsigned long*)</code><br>
	 * <i>native declaration : line 574</i>
	 */
	int ftrScanGetButtonState(Pointer ftrHandle, NativeLongByReference pdwParam1);
	/**
	 * Original signature : <code>int ftrScanMainLEDsTimeout(void*, unsigned long*, unsigned char)</code><br>
	 * <i>native declaration : line 576</i>
	 */
	int ftrScanMainLEDsTimeout(Pointer ftrHandle, NativeLongByReference pwdParam1, byte byFlag);
	/**
	 * Original signature : <code>void ftrSetGlobalDeviceSync(int)</code><br>
	 * <i>native declaration : line 578</i>
	 */
	void ftrSetGlobalDeviceSync(int fSet);
	/**
	 * Original signature : <code>int ftrInternalDeviceIoExchange(void*, void*)</code><br>
	 * <i>native declaration : line 582</i>
	 */
	int ftrInternalDeviceIoExchange(Pointer ftrHandle, Pointer pData);
	/**
	 * Original signature : <code>int ftrScanGetProperty(void*, int, void*)</code><br>
	 * <i>native declaration : line 584</i>
	 */
	int ftrScanGetProperty(Pointer ftrHandle, int nProperty, Pointer pPropertyData);
	/**
	 * Original signature : <code>int ftrScanGetImageSizes(void*, PFTRSCAN_IMAGE_SIZE)</code><br>
	 * <i>native declaration : line 586</i>
	 */
	int ftrScanGetImageSizes(Pointer ftrHandle, FTRSCAN_IMAGE_SIZE pArrayOfImageSizes);
	/**
	 * Original signature : <code>int ftrScanGetImageOfSpecificSize(void*, int, unsigned char, int, int, void*)</code><br>
	 * <i>native declaration : line 588</i>
	 */
	int ftrScanGetImageOfSpecificSize(Pointer ftrHandle, int nVariableDose, byte byLights, int nWidth, int nHeight, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetImageOfSpecificSizeEx(void*, int, unsigned char, int, int, int, void*)</code><br>
	 * <i>native declaration : line 590</i>
	 */
	int ftrScanGetImageOfSpecificSizeEx(Pointer ftrHandle, int nVariableDose, byte byLights, int nWidth, int nHeight, int nFrames, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanGetImageOfSpecificSize2(void*, int, unsigned char, int, int, int, int, int, void*)</code><br>
	 * <i>native declaration : line 592</i>
	 */
	int ftrScanGetImageOfSpecificSize2(Pointer ftrHandle, int nVariableDose, byte byLights, int nWidth, int nHeight, int nFrames, int nOffsetX, int nOffsetY, Pointer pBuffer);
	/**
	 * Original signature : <code>int ftrScanSetProperty(void*, int, void*)</code><br>
	 * <i>native declaration : line 594</i>
	 */
	int ftrScanSetProperty(Pointer ftrHandle, int nProperty, Pointer pPropertyData);
	/**
	 * Original signature : <code>int ftrScanGetPropertySize(void*, int, unsigned long*)</code><br>
	 * <i>native declaration : line 596</i>
	 */
	int ftrScanGetPropertySize(Pointer ftrHandle, int nProperty, NativeLongByReference propSize);
}
