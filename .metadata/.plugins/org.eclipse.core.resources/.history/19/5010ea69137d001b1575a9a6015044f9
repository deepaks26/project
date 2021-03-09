package com.inter.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class TestDeadLock {

	
	
	
		public static class ParkingRecord implements Comparator<ParkingRecord> {

			int time;
			boolean arrived;

			public ParkingRecord(int time, boolean arrived) {
				this.time = time;
				this.arrived = arrived;
			}

			public ParkingRecord() {
				
			}

			@Override
			public int compare(ParkingRecord p1, ParkingRecord p2) {
				return p1.time - p2.time;
			}
			
		}
		
		static int minParkingSpaces(int[][] parkingStartEndTimes) {

			int result = 0;
			int count = 0;
			List<ParkingRecord> parkingRecords = new ArrayList<>();
			
			for (int i = 0; i < parkingStartEndTimes.length; i++) {
				parkingRecords.add(new ParkingRecord(parkingStartEndTimes[i][0], true));
				parkingRecords.add(new ParkingRecord(parkingStartEndTimes[i][1], false));
			}
			
			Collections.sort(parkingRecords, new ParkingRecord());;
			
			for (ParkingRecord pr : parkingRecords) {
				if (pr.arrived) {
					count++;
					result = Math.max(result, count);
				} else {
					count--;
				}
			}
			return result;
		}
		
		
	
	    public static class RatingStatisticsCollectorImpl  {
	        HashMap<String,List<Integer>> ratingMap = new HashMap<String,List<Integer>>();
	       
	        
	        public void putNewRating(String app, int rating){
	            if(ratingMap.containsKey(app)) {
	            	ratingMap.get(app).add(rating);
	            }else {
	            	List<Integer> intList = new ArrayList<Integer>();
	            	intList.add(rating);
	            	ratingMap.put(app,intList);
	            }
	        }

	        public double getAverageRating(String app){
	            List<Integer> intlList = ratingMap.get(app);
	            if(!intlList.isEmpty()) {
	            	return intlList.stream().mapToInt(i->i).average().getAsDouble();
	            }
	            return 0;
	        }

	       
	        public int getRatingsCount(String app){
	        	 List<Integer> intlList = ratingMap.get(app);
	        	  if(!intlList.isEmpty()) {
		            	return intlList.size();
		            }
		            return 0;
	        }
	    }
	    
	    
	public static Object obj1 = new Object();
	public static Object obj2 = new Object();
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		  Stream<String> w = Stream.of("one","two","three"); 
		  
		  OptionalInt len = w.mapToInt(String::length).reduce((i1,i2)-> i1+i2);
		  len.getAsInt();
		  
		 
		int a[] = new int[] {1,2,3};
		int a1;
		int a2[] = m1(a);
		System.out.println(a[1] + a2[1] + " ");
//		Thread d1 = new DeadThread1();
//		Thread d2 = new DeadThread2();
//		d1.start();
//		d2.start();
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		String s = "abc";
		String s1 = new String("abc");
			m.put(s, 10);
			m.put(s1, 20);
			m.put(new String("abc"), 30);
			System.out.println(m.get("abc"));
			
			List<String> l = new ArrayList<String>();
			l.add("a");
			l.add("b");
			
			
			String str = "a";
			try {
				
				str += "b";
			}finally {
				str+="c";
			}
			str+="d";
			System.out.println("try-catch"+str);
		
		
		  for(int i = 0;i<l.size();i++) {
			  if(l.get(i).equals("a")) {
				  l.remove("a"); 
				  
			  }
		  }
		  System.out.println(l);
		 
		  List<Integer> l1 = new ArrayList<Integer>();
		  Integer int1 = new Integer(1);
			l1.add(int1);
			int1 = 2;
			System.out.println(l1);
			
		
	}

	static int[] m1(int a[]){
		a[1] =5;
		return a;
		
	}
	static class DeadThread1 extends Thread {
		public void run() {
			synchronized (obj1) {
				System.out.println("Thread 1: Holding lock 1...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock 2...");

				synchronized (obj2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}

	}
	
	
	static class DeadThread2 extends Thread {
		public void run() {
			synchronized (obj2) {
				System.out.println("Thread 2: Holding lock 2...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 1...");

				synchronized (obj1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}

	}
	
	int m1() {
		try {
			return 1;
		}finally {
			return 2;
		}
	}
}
