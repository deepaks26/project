package com.inter.design.adapter1;

public class BirdAdapter implements Squeak {
	Bird bird;

	@Override
	public void makeSqueak() {
		bird.makeSound();

	}

	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}
}
