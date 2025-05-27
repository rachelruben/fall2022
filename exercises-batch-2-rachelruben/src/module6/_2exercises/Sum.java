package module6._2exercises;

public class Sum {

	//public static void main(String[] args) {
		//test your method here
		public static int sum(int n) {
			if(n == 0)
				return 0;
			else
				return sum(n - 1) + n;
		}
	}

