package flowerpower;


import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;


public class Flower {
	
	/**
	 * 
	 * @param x x coordinate of the center of this ellipse
	 * @param y y coordinate of the center of this ellipse
	 * @param halfWidth half the width of this ellipse
	 * @param halfHeight half the height of this ellipse
	 * @param count depth of the recursion, initial call passes 0
	 */
	private static void flower(Color[] palette, double x, double y, double halfWidth, double halfHeight, int count){
		//
		// FIXME Your code below here
		if(count == 7) { //number of recursions, flower petals repeating on each other
			return;
		}
		
		count++; //keeps adding petals
		halfWidth /= 2; //divide halfWidth by 2 and put the result in halfWidth , so it fits
		halfHeight /= 2; //divide halfHeight by 2 and put the result in halfHeight , so it fits
		
		int colorIndex = (int)(Math.random() * palette.length); //random color selection
		StdDraw.setPenColor(palette[colorIndex]); 
		StdDraw.filledEllipse(x, y, halfWidth * 2, halfHeight * 2); //gives center of ellipse and halfWidth and halfHeight
		
		//to the right of center
		flower(palette, x + halfWidth, y, halfWidth, halfHeight, count);
		//to the left of center
		flower(palette, x - halfWidth, y, halfWidth, halfHeight, count);
		//above center
		flower(palette, x, y + halfWidth, halfWidth, halfHeight, count);
		//below center
		flower(palette, x, y - halfWidth, halfWidth, halfHeight, count);
		//center
		flower(palette, x, y, halfWidth, halfHeight, count);
	}
	
		
	public static void main(String args[]) {
		//
		// Create a palette of colors
		//
		Color[] palette = { StdDraw.BLACK, StdDraw.BLUE, StdDraw.CYAN,
				StdDraw.DARK_GRAY, StdDraw.GRAY, StdDraw.GREEN,
				StdDraw.LIGHT_GRAY, StdDraw.MAGENTA, StdDraw.ORANGE,
				StdDraw.PINK, StdDraw.RED, StdDraw.WHITE, StdDraw.YELLOW };
		//
		// Modify the palette so each color is somewhat transparent
		//   This allows the colors below to bleed through the colors
		//   on top.
		//
		for (int i = 0; i < palette.length; ++i) {
			palette[i] = TransparentColor.transparentColor(palette[i], 70);
		}

		//
		// Kick off the recursion
		// Center is at (0.5, 0.5), half-width .3, half-height .5, depth is 0
		//
		flower(palette, .5, .5, .3, .5, 0);
	}

}
