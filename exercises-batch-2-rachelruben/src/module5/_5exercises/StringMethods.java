package module5._5exercises;

public class StringMethods {

		public static String selfConcat(String s) {
			return s + s;
		}
		public static String stringRepeat(String t, int n) {
			String result = "";
			for (int i = 0; i < n; i++) {
				result = result.concat(t);
			}
			return result;
		}
 
		public static void main(String[] args) {
			
			//
			// Testing the methods
			//
			System.out.println(selfConcat("echo"));
			System.out.println(stringRepeat("dun", 1));
		}
}
