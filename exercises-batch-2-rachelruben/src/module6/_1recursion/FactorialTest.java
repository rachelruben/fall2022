package module6._1recursion;

public class FactorialTest {

	public static int factorial(int n) {
		
		if(n <= 0) 
			return 1;
		else 
			return n * factorial(n - 1);
		}
	}

