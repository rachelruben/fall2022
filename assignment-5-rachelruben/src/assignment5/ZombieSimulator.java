package assignment5;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

/**
 * A Zombie Simulator!
 */
public class ZombieSimulator {
	public static final int X = 0;
	public static final int Y = 1;
	private static final String ZOMBIE_TOKEN_VALUE = "Zombie";

	private static final Color ZOMBIE_COLOR = new Color(146, 0, 0);
	private static final Color NONZOMBIE_COLOR = new Color(0, 0, 0);
	private static final Color TEXT_COLOR = new Color(73, 0, 146);
	public static final double ENTITY_RADIUS = 0.008;

	public static final double RANDOM_DELTA_HALF_RANGE = 0.006;

	

	/**
	 * Read entities from a file.
	 */
	public static void readEntities(Scanner in, boolean[] areZombies, double[][] positions) {
		
		for(int i = 0; i < areZombies.length; i++) {
			String zombie = in.next();
			if(zombie.equals(ZOMBIE_TOKEN_VALUE)) {
				areZombies[i] = true;
			}
			else {
				areZombies[i] = false;
			}
			positions[i][X] = in.nextDouble(); //more clearly conveys reading the X coordinate
			positions[i][Y] = in.nextDouble(); //more clearly conveys reading the Y coordinate
		}
	}

	/**
	 * Draw all the entities. Zombies are drawn as ZOMBIE_COLOR filled circles of
	 * radius ENTITY_RADIUS and non-zombies with filled NONZOMBIE_COLOR filled
	 * circles of radius ENTITY_RADIUS). Further, add feedback for nonzombie count
	 * (when ready to do so), and any additional desired drawing features.
	 * 
	 * @param areZombies the zombie state of each entity
	 * @param positions  the (x,y) position of each entity
	 */
	public static void drawEntities(boolean[] areZombies, double[][] positions) {
		// DONE: Clear the frame
		StdDraw.clear();

		StdDraw.enableDoubleBuffering();
		for(int i = 0; i < areZombies.length; i++) {
			if(areZombies[i] == true) {
				StdDraw.setPenColor(ZOMBIE_COLOR);
				StdDraw.filledCircle(positions[i][X], positions[i][Y], ENTITY_RADIUS);
			}
			else {
				StdDraw.setPenColor(NONZOMBIE_COLOR);
				StdDraw.filledCircle(positions[i][X], positions[i][Y], ENTITY_RADIUS);
			}
			StdDraw.setPenColor(TEXT_COLOR);
			StdDraw.text(0.1, 0.94, nonzombieCount(areZombies) + "/" + areZombies.length);
		}
		// DONE: Show everything that was drawn (show the updated frame). This should be
		// the only "show()" command!
		StdDraw.show();
	}

	/**
	 * Check if the entity at the given index is touching a zombie. (HINT: You know
	 * the location of the center of each entity and that they all have a radius of
	 * ENTITY_RADIUS. If the circles representing two entities overlap they are
	 * considered to be touching. Consider using the distance formula.)
	 *
	 * @param index      the index of the entity to check
	 * @param areZombies the zombie state of each entity
	 * @param positions  the (x,y) position of each entity
	 * @return true if the entity at index is touching a zombie, false otherwise
	 */
	public static boolean touchingZombie(int index, boolean[] areZombies, double[][] positions) {

		boolean touching = false; 
		for(int i = 0; i < areZombies.length; i++) {
			double distance = Math.hypot((positions[index][X]-positions[i][X]),(positions[index][Y]-positions[i][Y]));
			if(distance <= 2 * ENTITY_RADIUS && areZombies[i] == true) {
				touching = true;
			}
		}
		return touching; 
	}

	/**
	 * Update the areZombies states and positions of all entities (assume Brownian
	 * motion).
	 *
	 * The rules for an update are:
	 * 
	 * Each entity should move by a random value between -RANDOM_DELTA_HALF_RANGE 
	 * and +RANDOM_DELTA_HALF_RANGE in both the x and the y coordinates.
	 * 
	 * Entities should not be able to leave the screen. x and y coordinates should
	 * be kept between [0-1.0]
	 *
	 * If a non-zombie is touching a zombie it should change to a zombie. (HINT: you
	 * need to check all entities. On each one that is NOT a zombie, you can re-use
	 * code you've already written to see if it's "touching" a Zombie and, if so,
	 * change it to a zombie.)
	 *
	 * @param areZombies the zombie state of each entity
	 * @param positions  the (x,y) position of each entity
	 */
	public static void updateEntities(boolean[] areZombies, double[][] positions) {
	
		double movingx = 0.0;
		double movingy = 0.0; 
		
		for(int i = 0; i < areZombies.length; i++) {
			movingx = (Math.random() * (2 * RANDOM_DELTA_HALF_RANGE)) - RANDOM_DELTA_HALF_RANGE;
			boolean directionx = Math.random() < 0.5;
			movingy = (Math.random() * (2 * RANDOM_DELTA_HALF_RANGE)) - RANDOM_DELTA_HALF_RANGE;
			boolean directiony = Math.random() < 0.5;
			if(directionx == true) {
				movingx *= -1;
			}
			if(directiony == true) {
				movingy *= -1;
			}
			if(positions[i][X] + movingx >= 0 && positions[i][X] + movingx <= 1.0) {
				positions[i][X] += movingx;
			}
			if(positions[i][Y] + movingy >= 0 && positions[i][Y] + movingy <= 1.0) {
				positions[i][Y] += movingy;
			}
			if(touchingZombie(i, areZombies, positions) == true) {
				areZombies[i] = true;
			}
		}
	}

	/**
	 * Return the number of nonzombies remaining
	 */
	
	public static int nonzombieCount(boolean[] areZombies) {

		int count = 0;
		for(int i = 0; i < areZombies.length; i++) {
			if(areZombies[i] == false) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Run the zombie simulation.
	 */
	private static void runSimulation(Scanner in) {
		StdDraw.enableDoubleBuffering(); // reduce unpleasant drawing artifacts, speed things up

		int N = in.nextInt();
		boolean[] areZombies = new boolean[N];
		double[][] positions = new double[N][2];
		readEntities(in, areZombies, positions);
		
		StdDraw.pause(500);

		while(nonzombieCount(areZombies) > 0) {
			updateEntities(areZombies, positions);
			drawEntities(areZombies, positions);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("zombieSims");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		runSimulation(in); 
	}

}
