package com.inter.design.observer;

public class ObserverApp {
	public static void main(String[] args) {
		Subcriber1 sub1 = new Subcriber1();
		Subscriber2 sub2 = new Subscriber2();

		Email email = new Email();
		email.setSubjectLine("hello world");
		email.registerObserver(sub1);
		email.registerObserver(sub2);
		email.notifyObservers();
	}
}
