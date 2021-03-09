
public class DemoInTApp {
public static void main(String[] args) {
	//System.out.println(sumUptoNNumberHeadRecusrsion(5));
	//System.out.println(sumUptoNNumberTailRecusrsion(0,5));
	//System.out.println(fibonacci(3));
	fibonacciWithourRecursion(6);
}

public static Integer sumUptoNNumberHeadRecusrsion(Integer numUpto) {
	if(numUpto>1) {
		return sumUptoNNumberHeadRecusrsion(numUpto-1)+numUpto;
	}
	return numUpto;
}

public static Integer sumUptoNNumberTailRecusrsion(Integer currentSum,Integer numUpto) {
	if(numUpto<=1) {
		return currentSum+numUpto;
	}
	return sumUptoNNumberTailRecusrsion(currentSum+numUpto,numUpto-1);
}

public static Integer nthPowerOfANumber(Integer nthPower) {
	if(nthPower==0) {
		return 1;
	}
	return 5*nthPowerOfANumber(nthPower-1);
}

public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n-1) + fibonacci(n-2);
}

public  static void fibonacciWithourRecursion(int n) {
    int prevSum = 0;
    int sum = 1;
    int iteration = 1;
    while(iteration!=n) {
    	sum = sum+prevSum;
    	prevSum = sum-prevSum;
    	iteration++;
    }
    System.out.println(sum);
	
}

}
