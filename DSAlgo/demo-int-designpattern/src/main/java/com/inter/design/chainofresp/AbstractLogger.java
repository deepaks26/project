package com.inter.design.chainofresp;

public abstract class AbstractLogger {

	AbstractLogger nextLogger;

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;
	
	public void setNextLogger(AbstractLogger log) {
		this.nextLogger = log;
	}
	
	public void logMsg(int level, String msg ) {
		
		if(this.level <= level) {
			write(msg);
		}else {
			this.nextLogger.logMsg(level,msg);
		}
	}
	
	abstract void write(String message);
	
	public static void main(String[] args) {
		String x[] = {"mnmnmn"};
		String sx[] = new String[0];
		sx = x;
		System.out.println(sx.length);
				System.out.println(x[0].compareTo(sx[0]));
				System.out.println(x[0]+="abc");
	}
}
