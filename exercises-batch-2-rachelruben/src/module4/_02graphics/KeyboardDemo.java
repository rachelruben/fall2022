package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class KeyboardDemo {

	public static void main(String[] args) {
		
		//Wait until the user presses a key, checking periodically
		while(!StdDraw.hasNextKeyTyped()) {
			StdDraw.pause(100);
		}
		
		//What character was pressed? Provide a response
		char got = StdDraw.nextKeyTyped();
		if(got == 'y') {
			System.out.println("Yes");
		} else if(got == 'n') {
			System.out.println("No");
		} else {
			System.out.println("What?");
		}
	}
	
}
