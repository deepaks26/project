package com.inter.design.singleton;

public class SingleObjectProvider {

	private volatile static SingleObjectProvider obj;

	private SingleObjectProvider() {
	}

	public static SingleObjectProvider getInstance() {
		if (obj == null) {
			synchronized (SingleObjectProvider.class) {
				if (obj == null) {
					obj = new SingleObjectProvider();
				}
			}
		}
		return obj;
	}

}
