package com.inter.design.state;

public class AlertContext {
	MobileAlert alert;

	public MobileAlert getAlert() {
		return alert;
	}

	public void setAlert(MobileAlert alert) {
		this.alert = alert;
	}
	
	public void alert() {
		alert.alert();
	}
}
