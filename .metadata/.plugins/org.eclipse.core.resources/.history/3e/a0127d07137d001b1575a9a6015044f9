package com.inter.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class BinarySearchUsingForkJoin extends RecursiveTask<Integer> {

	int fast;
	int last;
	int key;
	int arr[];

	public BinarySearchUsingForkJoin(int fast, int last, int key, int arr[]) {
		this.fast = fast;
		this.last = last;
		this.arr = arr;
		this.key = key;
	}

	@Override
	protected Integer compute() {

		List<BinarySearchUsingForkJoin> list = new ArrayList();
		if(last>=fast) {
			int mid = (last+fast)/2;
			if(arr[mid]==key) {
				System.out.println(key +"is at pos "+ mid);
				return mid;
			}
			
			if(key<arr[mid]) {
				BinarySearchUsingForkJoin bs1 = new BinarySearchUsingForkJoin(fast, mid-1, key, arr);
				bs1.fork();
				list.add(bs1);
			}else {
				BinarySearchUsingForkJoin bs1 = new BinarySearchUsingForkJoin(mid+1, last, key, arr);
				bs1.fork();
				list.add(bs1);
			}
		}
		for(BinarySearchUsingForkJoin jon : list) {
			jon.join();
		}
		return -1;
	}
	
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int last=arr.length-1;  
		BinarySearchUsingForkJoin join = new BinarySearchUsingForkJoin(0, last, key, arr);
		pool.execute(join);
		pool.shutdown();
		
		join.join();
	}

}
