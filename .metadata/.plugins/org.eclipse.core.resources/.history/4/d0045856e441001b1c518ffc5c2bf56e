package com.inter.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Email implements Subject {

	private String subjectLine;
	private List<Observer> observerList;

	public Email() {
		observerList = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer obsAdd) {
		observerList.add(obsAdd);
	}

	@Override
	public void unRegisterObserver(Observer obsRemove) {
		observerList.remove(observerList.indexOf(obsRemove));
	}

	@Override
	public void notifyObservers() {
		observerList.forEach(obs -> obs.update(subjectLine));
	}

	public String getSubjectLine() {
		return subjectLine;
	}

	public void setSubjectLine(String subjectLine) {
		this.subjectLine = subjectLine;
	}

}
