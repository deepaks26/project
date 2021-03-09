package com.inter.design.chainofresppract1;

public abstract class AbstractLogger {

	AbstractLogger nextLogger;
	protected int level;
	
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger= nextLogger;
	}
	
	void log(int level,String msg) {
		if(this.level<=level) {
			write(msg);
		}else {
			this.nextLogger.log(level, msg);
		}
	}

	protected abstract void write(String msg);
	
}