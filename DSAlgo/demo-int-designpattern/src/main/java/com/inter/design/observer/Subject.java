package com.inter.design.observer;

public interface Subject {
	void registerObserver(Observer obsAdd);

	void unRegisterObserver(Observer obsRemove);

	void notifyObservers();

}
