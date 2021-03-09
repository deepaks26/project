package com.inter.codepract.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class RotationPallindrom {

	public  static void main(String[] args) {
		/*
		 * System.out.println(maximumOccurringCharacter("helloworld")); dis(1); char ch
		 * = '\u0023';
		 */
		/*
		 * Object objk =null; Optional<String> opt = Optional.of(null);
		 * System.out.println(Optional.ofNullable(null).isPresent());
		 * System.out.println(Optional.empty().equals(opt));
		 */
			//BiPredicate<List<String>, String> u = List::contains;
		
		int arr[] = {1,5,8};
		IntStream st = Arrays.stream(arr);
		System.out.println(st.sum());
		System.out.println(st.reduce(0, (a,b)-> a+b));
			//Function<String, Integer> = () -> String.
		//() -> {return 1};
		//CompletionSer
		/*
		 * System.out.println((checkRotationPallindrom("aab")) ? 1 : 0);
		 * System.out.println((checkRotationPallindrom("abcde")) ? 1 : 0);
		 * System.out.println((checkRotationPallindrom("aaaad")) ? 1 : 0);
		 */
	}
	static boolean checkRotationPallindrom(String str){
		
		for(int i=0;i<str.length()-1;i++) {
			String right = str.substring(i+1);
			String left = str.substring(0,i+1);
			if(checkPallindrom(right+left)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean checkPallindrom(String str){
		/*
		 * int low = 0; int high = str.length()-1; while(low<high) { if(str.charAt(low)
		 * != str.charAt(high)) { return false; } } return true;
		 */
		//Character.
		
		return IntStream.range(0, str.length()/2).noneMatch( i -> str.charAt(i) != str.charAt(str.length()-i-1));
	}
	
	public static char maximumOccurringCharacter(String text) {
        List<String> list = Arrays.asList(text.split(""));
        TreeMap<Integer,String> map = new TreeMap<Integer,String>();
        for(String s : list){
            if(map.containsKey(Collections.frequency(list, s))){
                continue;
            }else{
                map.put(Collections.frequency(list, s),s);
            }
        }
        return map.lastEntry().getValue().toCharArray()[0];

    }
	
	static void dis(Integer i) {
		System.out.println("int");
	}
	

	static void dis(Long i) {
		System.out.println("long");
	}
}
