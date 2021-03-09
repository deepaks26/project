package com.inter.design.strategy;

public abstract class Fighter {
	public abstract void display();

	JumpBehaviour jumpB;
	RunBehaviour runB;

	Fighter(JumpBehaviour jumpB, RunBehaviour runB) {
		this.jumpB = jumpB;
		this.runB = runB;
	}

	public void jump() {
		jumpB.jump();
	}

	public void run() {
		runB.run();
	}

	public void kick() {
		System.out.println("kicked successfully");
	}
}
