package assignment6;

public class RecursiveMethods {

	/**
	 * Recursively computes base ^ exponent
	 * 
	 * @param base the base - can be positive or negative
	 * @param exp  the exponent - can be positive or negative
	 * @return base ^ exponent
	 */
	public static double exponent(int base, int exp) {
			// FIXME Recursively compute base^exp
		if(exp == 0) //base case
			return 1.0; // anything to the 0 power is 1
		else if(exp >= 1) //recursion case
			return base * exponent(base, exp - 1); // multiply base for exponent times
		//3 * exponent(3, 4-1)
		//3 * 3 * exponent(3, 3-1)
		//3 * 3 * 3 * exponent(3, 2-1)
		//3 * 3 * 3 * 3 *exponent(3, 1-1) => exponent(3,0) => 1.0
		//3 * 3 * 3 * 3 * 1.0 = 81.0
		else //recursion case
			return (1.0 / base) * exponent(base, exp + 1); // multiply base for exponent times	
	}

	
	/**
	 * Recursively compute the sum of elements in an array
	 * 
	 * @param array an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] array) {
		
			// FIXME: Recursively compute the sum of the values in an array
		return helper(array, 0);
	}

	public static int helper(int[] array, int n) { //helper method (add an int to sum)
		
		if(array.length == n) //base case
			return 0;
		else //recursion case
			return array[n] + helper(array, n + 1); //array, n + 1 is answer, array[n] is value
		//array[1,3,9,7]
		//n = 0 => array[0] + helper(array, 0+1) => 1 + array[1] + helper(array, 1+1) 
		//1 + array[2] + helper(array, 2+1) =? 1 + 3 + array[3] + helper(array, 3+1)
		//1 + 3 + 9 + array[4] + helper(array, n = 4 => return 0) => 1 + 3 + 9 + 7 + 0 = 20
	}
	

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		String result = "";
		for (int i = 0; i < source.length(); ++i) {
			char ch = source.charAt(i);
			if (ch == target) {
				result = result + replacement;
			} else {
				result = result + ch;
			}
		}
		return result;
	}

	/**
	 * Recursively computes string representations of dragon curves
	 * 
	 * @param n the desired degree of the dragon curve
	 * @return the nth dragon curve
	 */
	public static String dragon(int n) {
			// FIXME Recursively compute dragon curves
		String F = "F-H";
		
		if(n == 0) //base case
			return F; 
		//recursive substructure
			return substituteAll(substituteAll(substituteAll(dragon(n - 1), 'F', "!"), 'H', "F+H"), '!', "F-H");
	}
	/**
	 * Finds the length of the longest path in the given 2D array from the specified
	 * start position.
	 * 
	 * @param chart 2D array of stones
	 * @param r     start position row
	 * @param c     start position column
	 * @return the length of the longest path that was found
	 */
	public static int maxPathLength(boolean[][] chart, int r, int c) {
		
			// FIXME Find and return the length of the longest path in the array
		
		//if statement where return 0 if chart at an index is false
		//check each direction for true to move
		//need to maintain board size, 
		//end return uses Math.max to find max length
		
		//base case
		if(r < 0 || r > chart.length - 1|| c < 0 || c > chart[0].length - 1 || chart[r][c] == false) {
			return 0;
		} 
		else { //recursive case
			chart[r][c] = false;
			int up = maxPathLength(chart, r - 1, c);
			int right = maxPathLength(chart, r, c + 1);
			int left = maxPathLength(chart, r, c - 1);
			int down = maxPathLength(chart, r + 1, c);
			chart[r][c] = true;
			int uD = Math.max(up, down);
			int lR = Math.max(left, right);
			int max = Math.max(uD, lR);
			return max + 1;
		}
	}
}
