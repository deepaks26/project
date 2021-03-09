package com.inter.twodarray;

import java.util.Scanner;

public class GlassHours {

	public static void main(String[] args) {
		int arr[][] = new int[6][6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			String s[] = sc.nextLine().split(" ");
			for (int j = 0; j < s.length; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
			}
		}
		sc.close();

		int count = 0;
		int sum = 0;
		for (int col = 0; col < 6; col++) {
			for (int row = 0; row < 6; row++) {
				if (row + 3 <= 6 && col + 3 <= 6) {
					/*if (arr[col][row] == arr[col + 2][row] && arr[col][row + 1] == arr[col + 2][row + 1]
							&& arr[col][row + 2] == arr[col + 2][row + 1]
							&& arr[col + 1][row + 1] == arr[col][row + 1]) {*/
						count++;
						int currSum = arr[col][row] + arr[col + 2][row] + arr[col][row + 1] + arr[col + 2][row + 1]
								+ arr[col][row + 2] + arr[col + 2][row + 2] + arr[col + 1][row + 1];
						if(currSum>sum) {
							sum = currSum;
						}

					//}
				}
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
