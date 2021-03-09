package com.inter.codepract.array;

public class FindCountOfElementInArray {

	public static void main(String[] args) {
		 int A[] = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };
		 int max = Integer.MIN_VALUE;
		 for(int i=0;i<A.length;i++) {
			 if(A[i]>max) {
				 max = A[i];
			 }
		 }
		 int B[] = new int[max+1];
		 for(int i=0;i<A.length;i++) {
			 B[A[i]]++;
		 }
		 
		 for(int i=0;i<=max;i++) {
			 if(B[i]>=1) {
				 System.out.println(i + "->" +B[i]);
			 }
		 }
		
		/*
		 * String s = new String("TestString"); List<String> ls =
		 * Arrays.asList(s.split("")); Map<String,Integer> map =
		 * ls.stream().collect(Collectors.toMap(k-> k, v->1,Integer::sum));
		 * System.out.println(map.get("e"));
		 */
	}
		
		
}
