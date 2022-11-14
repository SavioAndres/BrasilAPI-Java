package br.com.brasilapi;

class Log {
	private static boolean enable = false;
	
	protected static void setEnable(boolean enable) {
		Log.enable = enable;
	}

	protected static boolean getEnable() {
		return Log.enable;
	}
	
	protected static void setConsole(String msg) {
		if (Log.enable) {
			System.out.println(msg);
		}
	}
	
	protected static void setConsoleError(String msg) {
		if (Log.enable) {
			System.err.println(msg);
		}
	}

}
