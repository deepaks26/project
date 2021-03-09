package com.inter.design.chainofresppract2;

public abstract class AbstractLogger {

	AbstractLogger nextLogger;
	int level;
	
	public void log(int level,String message) {
		if(this.level <= level) {
			write(message);
		}else {
			nextLogger.log(level,message);
		}
	}

	protected abstract void write(String message);
}
