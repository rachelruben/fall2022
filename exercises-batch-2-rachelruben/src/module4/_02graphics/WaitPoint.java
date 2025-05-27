package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		

		// here, the mouse has been pressed
		
		while(!StdDraw.mousePressed()) {
			StdDraw.pause(100);
		}
		// here the mouse is released
		
		while (StdDraw.mousePressed()) {
			StdDraw.pause(100);
		}
		// draw a point at the location of the mouse
		StdDraw.setPenRadius(0.01);
		StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());
		
		// here, a q has been typed
		char gotkey = ' ';
		while (gotkey != 'q') {
			while (!StdDraw.hasNextKeyTyped()) {
				StdDraw.pause(100);
			}
			gotkey = StdDraw.nextKeyTyped();
		}
			StdDraw.text(0.5, 0.5, "Farewell!");
		
	}

}
