package com.inter.design.chainofresp;

public class ErrorLogger extends AbstractLogger {

	 public ErrorLogger(int level){
	      this.level = level;
	   }
	 
	@Override
	void write(String message) {
		 System.out.println("Standard error ::Logger: " + message);
	}

}
