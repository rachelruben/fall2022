package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class MovingBall {

	public static void main(String[] args) {
		double ballX = 0.0;
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.05);
		
		while (true) {
			
			//Clear the canvas
			StdDraw.clear();
			
			//update the ball position
			ballX = ballX + 0.005;
			if(ballX > 1) { //too far right
				ballX = 0; //back to left
			}
			
			//draw on canvas
			StdDraw.point(ballX, 0.5);
			
			//pause to make the animation smooth
			StdDraw.show(10);
		}
	}
}
