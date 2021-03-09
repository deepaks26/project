package com.inter.overlaod;

public class OverloadDemo implements Inter1, Inter2 {

	/*
	 * @Override public void addDef(int a, int b) { Inter1.super.addDef(a, b); }
	 */

	/*
	 * public int add(int a, int b) { return 1; }
	 * 
	 * public float add(float a, int b) { return 1; }
	 */
	/*
	 * @Override public void addDef(int a, int b) { Inter2.super.addDef(1, 2);
	 * Inter1.super.addDef(1, 2); }
	 */
	Inter1 m1(int a) {
		 return null;
	}
	
	void m1() {
		return;
	}
	

	public static void main(String[] args) {
		OverloadDemo ov = new OverloadDemo();
		ov.addDef(1, 2);
		
	//	System.out.println(ov.subDef(1,2));
	}

	@Override
	public void addDef(int a, int b) {
		// TODO Auto-generated method stub
		Inter1.super.addDef(a, b);
	}
	

	

}
