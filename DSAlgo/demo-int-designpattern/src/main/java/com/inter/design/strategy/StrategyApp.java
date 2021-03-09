package com.inter.design.strategy;

public class StrategyApp {
	public static void main(String[] args) {
		RunBehaviour runB2 = new ShortRun();
		RunBehaviour  runB1 = new LongRun();
		
		JumpBehaviour jumpB  = new LongJump();
		Fighter fighter =  new Ken(jumpB,runB2);
		fighter.display();
		fighter.jump();
		fighter.run();
		
		
	}
}
