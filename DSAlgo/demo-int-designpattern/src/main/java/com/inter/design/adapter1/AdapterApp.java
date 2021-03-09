package com.inter.design.adapter1;

public class AdapterApp {
	public static void main(String[] args) {
		Bird bird = new Crow();
		bird.makeSound();
		BirdAdapter ba = new BirdAdapter(bird);
		ba.makeSqueak();
	}
}
