package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		//Using a built-in color
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//Using a custom color
		Color purply = new Color(255, 0, 150);
		StdDraw.setPenColor(purply);
		StdDraw.filledCircle(.75, .75, .1);
		
		//Use the StdDraw API to do the following:
		
		//Draw a blue point anywhere you like
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.point(0.65, 0.5);
		
		//Draw a larger green point someplace else
		StdDraw.setPenRadius(0.08);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.point(0.25, 0.4);

		//Draw an unfilled red triangle somewhere
		StdDraw.setPenRadius(0.03);
		StdDraw.setPenColor(StdDraw.RED);
		double[] x = {0.1, 0.2, 0.3};
		double[] y = {0.2, 0.3, 0.2};
		StdDraw.polygon(x, y);

		//Draw a filled yellow circle somewhere
		StdDraw.setPenRadius(0.03);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(0.4, 0.4, 0.06);

		//Draw a filled blue rectangle somewhere
		StdDraw.setPenRadius(0.03);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(0.5, 0.08, 0.03, 0.04);

	}
}
