package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class MouseFollower {

public static void main(String[] args) {
		
		StdDraw.enableDoubleBuffering();
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			
			StdDraw.filledCircle(x, y, 0.05);
			
			//  
			// End of your frame
			//
			// Stdraw.show() achieves double buffering and
			//   the pause(10) avoids the tight spinning loop
			StdDraw.show();
			StdDraw.pause(10);
		}

	}
}
