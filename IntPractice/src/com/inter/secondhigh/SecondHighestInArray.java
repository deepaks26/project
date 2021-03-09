package com.inter.secondhigh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestInArray {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 3, 1, 4, 2, 6 };

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] > arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.get(1));

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);

		list2.add(1);
		list1.retainAll(list2);
		System.out.println(list1);
	}
}
