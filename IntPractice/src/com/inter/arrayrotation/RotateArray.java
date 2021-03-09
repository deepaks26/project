package com.inter.arrayrotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		/*
		 * 
		 * Scanner sc = new Scanner(System.in); List<Integer> list = new
		 * ArrayList<Integer>(); int arr[] = new int[5]; int i=0; while(sc.hasNextInt())
		 * { arr[i]= sc.nextInt(); System.out.print(arr[i]); i++; }
		 * 
		 * int i=0; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter number of test case"); int noOfTestCase =
		 * sc.nextInt(); // sc.close(); int arrayLength = 0; int rotation =0;
		 * 
		 * System.out.println("Enter array length"); int arr[]; Scanner sc1 = new
		 * Scanner(System.in); String str = sc1.nextLine(); String charArr[] =
		 * str.split(" "); for(int ind=0;ind<charArr.length;ind++) { if(ind==0){
		 * arrayLength = Integer.parseInt(charArr[ind]); }else{ rotation=
		 * Integer.parseInt(charArr[ind]); } }
		 * 
		 * while(sc1.hasNextInt()){ if(i==0){ arrayLength = sc1.nextInt(); }else{
		 * rotation= sc1.nextInt(); } i++; }
		 * 
		 * // sc1.close(); arr = new int[arrayLength];
		 * System.out.println("Enter array element"); i=0; Scanner sc2 = new
		 * Scanner(System.in); String str1 = sc2.nextLine(); String charArr1[] =
		 * str1.split(" "); for(int ind=0;ind<charArr1.length;ind++) { arr[ind] =
		 * Integer.parseInt(charArr1[ind]); }
		 * 
		 * while(sc2.hasNextInt()){ arr[i] = sc2.nextInt(); i++; }
		 * 
		 * //sc2.close(); int temp[]=new int[arrayLength]; for(int
		 * i1=arrayLength-rotation;i1<=arrayLength-1;i1++){ temp[i1] = arr[i1];
		 * System.out.print(temp[i1]+ " "); } for(int
		 * i2=rotation;i2<=arrayLength-1;i2++){ temp[i2] = arr[i2-rotation];
		 * System.out.print(temp[i2]+ " ");
		 * 
		 * }
		 */
			int noOfTestCase = 0;
	     int arrayLength = 0;
	     int rotation =0;
	     int arr[] = {};
	     
			Scanner sc = new Scanner(System.in);
			List<String> list = new ArrayList<String>();
			for(int i=0;i<3;i++) {
				String s = sc.nextLine();
				list.add(s);
			}
			for(int i=0;i<list.size();i++) {
				if(i==0) {
					noOfTestCase = Integer.parseInt(list.get(i));
				}else if(i==1) {
					String charArr[] = list.get(i).split(" ");
					for(int ind=0;ind<charArr.length;ind++) {
				    	 if(ind==0){
				             arrayLength = Integer.parseInt(charArr[ind]);
				         }else{
				             rotation= Integer.parseInt(charArr[ind]);
				         }
				     }
				}else {
					arr = new int[arrayLength];
					String charArr[] = list.get(i).split(" ");
					for(int ind=0;ind<charArr.length;ind++) {
				    	arr[ind] = Integer.parseInt(charArr[ind]);
				     }
				}
			}
			int temp[]=new int[arrayLength];
		     for(int i1=arrayLength-rotation;i1<=arrayLength-1;i1++){
		         temp[i1] = arr[i1];
		         System.out.print(temp[i1]+ " ");
		     }
		     for(int i2=rotation;i2<=arrayLength-1;i2++){
		         temp[i2] = arr[i2-rotation];
		          System.out.print(temp[i2]+ " ");

		     }
		}

}
