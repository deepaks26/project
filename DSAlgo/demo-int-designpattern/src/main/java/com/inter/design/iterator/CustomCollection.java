package com.inter.design.iterator;

public class CustomCollection implements Contrainer {
	public String name[] = { "Ashwani Rajput", "Soono Jaiswal", "Rishi Kumar", "Rahul Mehta", "Hemant Mishra" };

	@Override
	public Iterator getIterator() {
		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator {

		int i;

		@Override
		public boolean hasNext() {
			if (i < name.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return name[i++];
			}
			return null;
		}

	}
}
