package com.inter.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FoldProcessor1 extends RecursiveTask<List<Integer>>{

	@Override
	protected List<Integer> compute() {
		List<FoldProcessor1> list = new ArrayList<FoldProcessor1>();
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			if(i<5) {
				FoldProcessor1 fold = new FoldProcessor1();
				fold.fork();
				list.add(fold);
			}else {
				if(i%2==0) {
					System.out.println(i + " is even");
					list1.add(1);
				}
			}
		}
		
		for(FoldProcessor1 fold : list) {
			list1.addAll(fold.join());
		}
		return list1;
	}

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		FoldProcessor1 f1 = new FoldProcessor1();
		pool.execute(f1);
		pool.shutdown();
		
		List<Integer> result = f1.join();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
