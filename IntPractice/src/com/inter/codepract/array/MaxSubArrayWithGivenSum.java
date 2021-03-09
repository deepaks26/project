package com.inter.codepract.array;

import java.util.ArrayList;
import java.util.List;

/**
 * find largest continuous array with given sum
 * 
 * @author deepsahoo
 *
 */
public class MaxSubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int sum = 8;

		findMaxSubArray(A, sum);

	}

	static void findMaxSubArray(int arr[], int target) {
		int length = 0;
		int endIndx = -1;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == target) {
					if (j - i + 1 > length) {
						length = j - i + 1;
						endIndx = j;
					}
				}
			}
		}
		System.out.println((endIndx - length + 1) + "," + endIndx);
	}

	// <Severity>|<Error Code>|<Exception Type>|<Message>
	/**
	 * public static void main(String[] args) throws IOException { String str =
	 * "Abc"; String str1 = new String("Abc"); System.out.println(str == str1);
	 * str1.intern(); System.out.println(str == str1);
	 * 
	 * StringBuffer sb1 = new StringBuffer("A"); StringBuffer sb2 = new
	 * StringBuffer("B"); m(sb1, sb2); System.out.println(sb1 + "," + sb2); Thread t
	 * = new Thread(); t.stop();
	 * 
	 * /**
	 */
	/*
	 * 
	 * List<ErrorCode> list = populateErrorCode(); InputStreamReader reader = new
	 * InputStreamReader(System.in, StandardCharsets.UTF_8); BufferedReader in = new
	 * BufferedReader(reader); String line; while ((line = in.readLine()) != null) {
	 * List<String> msgList = Arrays.asList(line.split("\\|")); if
	 * (!msgList.isEmpty()) { for (ErrorCode error : list) { if
	 * (error.exceptionType.equalsIgnoreCase(msgList.get(0))) {
	 * System.out.println(error.severity + "|" + error.errorCode + "|" +
	 * error.exceptionType + "|" + (msgList.size() > 1 ? msgList.get(1) : "")); }
	 * 
	 * } ; } }
	 * 
	 * 
	 * List<String> msgList = Arrays.asList("IJJJ|am".split("\\|"));
	 * System.out.println(msgList);
	 * 
	 * System.out.println("IJJJ|am".replaceAll("\\|", ","));
	 * 
	 */
	/*
	 * System.out.println(fibon(5)); boolean b = false; if(b=true || b) {
	 * System.out.println("sdbjas"); }
	 */

	/*
	 * Integer i=127; Integer j = 127; System.out.println(i==j);
	 */
	/*
	 * int i=0; while(true) { if(i++==4) { //System.out.println(1); break; } ++i; }
	 * System.out.println(++i);
	 */

	/*
	 * List<Integer> list = new ArrayList<Integer>(); list.add(1); list.add(2);
	 * list.add(3); list.add(5); list.add(4);
	 * System.out.println(Collections.binarySearch(list, 4));
	 */
	/*
	 * Hashtable tt = new Hashtable(); tt.put(null,1); Set s = tt.keySet(); Iterator
	 * it = s.iterator(); while(it.hasNext()) { System.out.println(it.next()); }
	 */
	/*
	 * int arr[] = new int[] { 2, 3, 7, 8, 10 }; int n = arr.length; int sum = 11;
	 * int i = 0; int tempSum = arr[i];// 2 for (int j = i + 1; j < n; j++) {
	 * tempSum += arr[j];// 5+7 = 12, 3+7 = 10+8 = 18 if (tempSum == sum) {
	 * System.out.println("suummmmeed"); } else if (tempSum < sum) { continue; }
	 * else { i++;// 3 j = i + 1;// 7 } } System.out.println("deepak");
	 */

	// }

	static int fibon(int i) {
		if (i == 1 || i == 2) {
			return 1;
		}
		return fibon(i - 1) + fibon(i - 2);
	}

	interface iii {

	}

	static void m(StringBuffer sb1, StringBuffer sb2) {
		sb1.append(sb2);
		sb2 = sb1.append("C");
		sb2.append("D");

	}

	static List<ErrorCode> populateErrorCode() {
		List<ErrorCode> list = new ArrayList();
		ErrorCode er1 = new ErrorCode();
		er1.exceptionType = "IOException";
		er1.errorCode = 100;
		er1.severity = "High";
		list.add(er1);

		ErrorCode er2 = new ErrorCode();
		er2.exceptionType = "MemoryException";
		er2.errorCode = 110;
		er2.severity = "High";
		list.add(er2);

		ErrorCode er3 = new ErrorCode();
		er3.exceptionType = "ThreadAbortException";
		er3.errorCode = 200;
		er3.severity = "Medium";
		list.add(er3);

		ErrorCode er4 = new ErrorCode();
		er4.exceptionType = "ResponseTimeoutException";
		er4.errorCode = 300;
		er4.severity = "Low";
		list.add(er4);

		ErrorCode er5 = new ErrorCode();
		er5.exceptionType = "ParameterException";
		er5.errorCode = 301;
		er5.severity = "Low";
		list.add(er5);

		// Collections.sort(list);
		return list;

	}
	/*
	 * IOException 100 High MemoryException 110 High ThreadAbortException 200 Medium
	 * ResponseTimeoutException 300 Low ParameterException 301 Low
	 */

	static class ErrorCode implements iii {
		String exceptionType;
		Integer errorCode;
		String severity;
	}
}
