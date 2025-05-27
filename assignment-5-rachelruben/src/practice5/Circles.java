package practice5;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class Circles {
	private static final double THRESHOLD_FOR_CLOSE_ENOUGH = 0.00001;
	public static boolean isCloseEnoughToUnitCircle(double x, double y) {
//		//TODO
		double xSquared = x * x;
		double ySquared = y * y;
		double distanceToOrigin = Math.sqrt(xSquared + ySquared);
		double distanceFromUnitCircle = Math.abs(1.0 - distanceToOrigin);
		
		return distanceFromUnitCircle < THRESHOLD_FOR_CLOSE_ENOUGH;
	}

	

	public static void main(String[] args) {
		System.out.println(isCloseEnoughToUnitCircle(1.0,0.0));
		System.out.println(isCloseEnoughToUnitCircle(0.5,0.5));
		
	//	double theta = Math.PI/3.0;
		
		for(double theta = 0.0; theta < 2.0 * Math.PI; theta += 0.1) {
			System.out.println("theta: " + theta);
			System.out.println(isCloseEnoughToUnitCircle(Math.cos(theta), Math.sin(theta)));

		}
		//System.out.println(isCloseEnoughToUnitCircle(Math.cos(theta), Math.sin(0.5)));
	}
}
