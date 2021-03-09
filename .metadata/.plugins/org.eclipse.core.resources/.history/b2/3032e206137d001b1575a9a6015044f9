package com.inter.thread;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {

	public static void main(String[] args) {
		ForkJoinPool pool  = new ForkJoinPool();
		FolderProcessor system = new FolderProcessor("C:\\Users\\deepsahoo\\Downloads", "exe");
		pool.execute(system);
		pool.shutdown();
		
		List<String> result = system.join();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
