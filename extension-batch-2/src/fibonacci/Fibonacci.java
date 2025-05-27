package fibonacci;

public class Fibonacci {

	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * 
	 * @param n
	 * @return the nth Fibonacci number, computed recursively
	 */
	public static int recursive(int n) {
		
		if(n <= 1) // base case
			return n; // FIXME
		return recursive(n - 1) + recursive(n - 2); 
	}

	/**
	 * Below write your solution to Fibonacci, using iteration
	 * 
	 * @param n
	 * @return the nth Fibonacci number, computed iteratively
	 */
	public static int iterative(int n) {
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum = 0;
		if(n == 0 || n == 1) //if n is 0 or n is 1 then it should just be 0 or 1
			return n;
		for(int i = 1; i < n; i++) { // calculate fibonacci number
			thirdNum = firstNum + secondNum; // if n = 0 then n2 = 1 then n3 = 1
			firstNum = secondNum;
			secondNum = thirdNum;
		}
			return thirdNum; // FIXME
		
	}
		

}
