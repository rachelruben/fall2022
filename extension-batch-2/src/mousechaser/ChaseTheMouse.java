package mousechaser;

import java.awt.Color;
import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.NotYetImplementedException;
import support.cse131.Timing;

public class ChaseTheMouse {
	private static final int X = 0;
	private static final int Y = 1;

	/**
	 * @return the current x and y coordinates of the mouse
	 */
	public static double[] getMousePosition() {
		
			// Delete the line below
			//throw new NotYetImplementedException();
			// Return the current mouse position as specified in the write up
		double[] position = new double[2];
		for(int i = 0; i < position.length; i++) {
			for(int j = 0; j < position.length; j++) {
					position[0] = StdDraw.mouseX();
					position[1] = StdDraw.mouseY();
				}
		}
		return position;
	}

	/**
	 * Draw a ball of radius r at the specified location
	 * 
	 * @param location the x and y coordinate for the ball
	 * @param radius   the radius of the ball
	 */
	public static void drawBall(double[] location, double radius) {
		
			// Delete the line below
			//throw new NotYetImplementedException();
			// Draw the ball here as specified in the write up
		StdDraw.clear();
		StdDraw.setPenColor();
		StdDraw.filledCircle(location[X], location[Y], radius);
		StdDraw.show();
	}

	/**
	 * @param v value
	 * @return v^2
	 */
	public static double square(double v) {
		
			// Delete the line below
			//throw new NotYetImplementedException();
			// Return v squared
		return v * v;
	}

	/**
	 * @param xy vector in 2D space
	 * @return magnitude of xy
	 */
	public static double calculateMagnitude(double[] xy) {
		
			// Delete the line below
			//throw new NotYetImplementedException();
			// Return the magnitude of xy
		double magXY = 0;
		for(int i = 0; i < xy.length; i++) 
			magXY += Math.pow(xy[i], 2.0);
		return Math.sqrt(magXY);
	}

	/**
	 * @param a vector in 2D space
	 * @param b vector in 2D space
	 * @return a + b
	 */
	public static double[] add(double[] a, double[] b) {
		
			// Delete the line below
			//throw new NotYetImplementedException();
			// Return a+b
		double[] result = new double[a.length];
		for(int i = 0; i < a.length; i++)
			result[i] = a[i] + b[i];
		return result;
	}

	/**
	 * @param a vector in 2D space
	 * @param b vector in 2D space
	 * @return a - b
	 */
	public static double[] subtract(double[] a, double[] b) {
		
			// Delete the line below
			//throw new NotYetImplementedException();
			// Return a-b
		double[] result = new double[a.length];
		for(int i = 0; i < a.length; i++)
			result[i] = a[i] - b[i];
		return result;
	}

	/**
	 * @param xy     vector in 2D space
	 * @param scalar
	 * @return xy * scalar
	 */
	public static double[] scalarMultiply(double[] xy, double scalar) {
		
			// Delete the line below
			//throw new NotYetImplementedException();
			// Return xy*scalar
		double[] result = new double[xy.length];
		for(int i = 0; i < xy.length; i++)
			result[i] = xy[i] * scalar;
		return result;
	}

	/**
	 * 
	 * @param currentBallPosition the location of the ball currently
	 * @param mousePosition       the location of the mouse currently
	 * @param speed               the speed with which the ball should move toward
	 *                            the mouse
	 * @param deltaTime           the elapsed time
	 * @return the next location of the ball given its current position, the mouse's
	 *         position, the speed, and the time change
	 */
	public static double[] calculateNextPosition(double[] currentBallPosition, double[] mousePosition, double speed,
			double deltaTime) {
		
			// Delete the line below
	//		throw new NotYetImplementedException();
			// Return the next ball position as specified in the write up
		double[] nextPosition = new double[2];
		
		double radius = speed * deltaTime; //equal to radius
		//get total distance 
		double distance = Math.sqrt(Math.pow(mousePosition[0] - currentBallPosition[0], 2) + Math.pow(mousePosition[1] - currentBallPosition[1], 2)); 
		if(distance <= radius) { //if its inside the circle then its normal
			nextPosition[0] = mousePosition[0];
			nextPosition[1] = mousePosition[1];
		}
		else { //if its outside the circle then it still can only show up inside circle
			double ratio = distance / radius; //gets the ratio of total distance to inside circle
			//mouse position - current position divided by the ratio so that its inside circle 
			nextPosition[0] = ((mousePosition[0] - currentBallPosition[0]) / ratio) + currentBallPosition[0]; 
			nextPosition[1] = ((mousePosition[1] - currentBallPosition[1]) / ratio) + currentBallPosition[1];
		}
			
		
		return nextPosition;
		
		//MY NOTES
			//ball position = start, mouse position = end
			//ball start at center of circle, can only move radius amount any direction
			//want to move total distance amount which would be scalar * ball position
			//amount to move = sqrt of x^2 + y^2
	}

	/**
	 * Simulate a ball chasing the mouse.
	 */
	public static void chaseTheMouse() {
		
			// Delete the line below
			//throw new NotYetImplementedException();
		
		double[] tester = new double[] {0.5, 0.5};
		drawBall(tester, 0.05);
		
		while(true) {
			//tester = getMousePosition();
			tester = calculateNextPosition(tester, getMousePosition(), 0.001, 2);
			drawBall(tester, 0.05);
		}
		//drawBall(location[X], location[Y], 0.5);
		//while(getMousePosition() != drawBall(X, Y, 0.5)) {
			
		}
		//Timing.getCurrentTimeInSeconds();
		
	

	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		chaseTheMouse();
	}
}
