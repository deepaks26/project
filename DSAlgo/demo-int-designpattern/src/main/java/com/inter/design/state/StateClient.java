package com.inter.design.state;

public class StateClient {

	public static void main(String[] args) {
		AlertContext con = new AlertContext();
		con.setAlert(new VIbration());
		con.alert();
	}
}
