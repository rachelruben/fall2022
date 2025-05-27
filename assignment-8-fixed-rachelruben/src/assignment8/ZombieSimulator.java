package assignment8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.NotYetImplementedException;
import support.cse131.Timing;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class ZombieSimulator {
	private static final String ZOMBIE_TOKEN_VALUE = "Zombie";
	private List<Entity> allEntities;

	/**
	 * Constructs a ZombieSimulator with an empty list of Entities.
	 */
	public ZombieSimulator() {
		
			// FIXME
		allEntities = new LinkedList<Entity>();

	//		throw new NotYetImplementedException();
		
	}

	/**
	 * @return the current list of active entities (that is: those which have not
	 *         been consumed).
	 */
	public List<Entity> getEntities() {
		
			// FIXME
		return this.allEntities;

		//	throw new NotYetImplementedException();
		
	}

	/**
	 * Reads an entire zombie simulation file from a specified ArgsProcessor, adding
	 * each Entity to the list of entities.
	 * 
	 * @param ap ArgsProcessor to read the complete zombie simulation file format.
	 */
	public void readEntities(Scanner in) {
		
			// FIXME
		int N = in.nextInt();
		int index = 0;
		List<Entity> allEntities = new LinkedList<Entity>();
		while(index < N) { //reading in all the data
			boolean isZombie = in.toString().equals(this.ZOMBIE_TOKEN_VALUE);
			double positionX = in.nextDouble();
			double positionY = in.nextDouble();
			Entity entity = new Entity(isZombie, positionX, positionY);
			allEntities.add(entity);
			index++;
		}
		this.allEntities = allEntities;
		//	throw new NotYetImplementedException();
		
	}

	/**
	 * @return the number of zombies in entities.
	 */
	public int getZombieCount() {
		
			// FIXME
		int numZombie = 0;
		for (int i = 0; i < allEntities.size(); i++) {
			Entity i1 = allEntities.get(i);
			if(i1.isZombie() == true) {
				numZombie++;
			}
		}
		return numZombie;
		//	throw new NotYetImplementedException();
		
	}

	/**
	 * @return the number of nonzombies in entities.
	 */
	public int getNonzombieCount() {
		
			// FIXME
		int numNonZombie = 0;
		for (int i = 0; i < allEntities.size(); i++) {
			Entity i1 = allEntities.get(i);
			if(i1.isZombie() != true) {
				numNonZombie++;
			}
		}
		return numNonZombie;
		//	throw new NotYetImplementedException();
		
	}

	/**
	 * Draws a frame of the simulation.
	 */
	public void draw() {
		StdDraw.clear();

		// NOTE: feel free to edit this code to support additional features
		for (Entity entity : getEntities()) {
			entity.draw();
		}

		StdDraw.show(); // commit deferred drawing as a result of enabling double buffering
	}

	/**
	 * Updates the entities for the current frame of the simulation given the amount
	 * of time passed since the previous frame.
	 * 
	 * Note: some entities may be consumed and will not remain for future frames of
	 * the simulation.
	 * 
	 * @param deltaTime the amount of time since the previous frame of the
	 *                  simulation.
	 */
	public void update(double deltaTime) {
		
			// FIXME
		List<Entity> updatedEntities = new LinkedList<Entity>();
		for (int i = 0; i < allEntities.size(); i++) {
			Entity i1 = allEntities.get(i);
			if(i1.update(allEntities, deltaTime)) {
				updatedEntities.add(i1);
			}
		}
		this.allEntities = updatedEntities;
		//	throw new NotYetImplementedException();
		
	}

	/**
	 * Runs the zombie simulation.
	 * 
	 * @param args arguments from the command line
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		StdDraw.enableDoubleBuffering(); // reduce unpleasant drawing artifacts, speed things up

		JFileChooser chooser = new JFileChooser("zombieSims");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		ZombieSimulator zombieSimulator = new ZombieSimulator();
		zombieSimulator.readEntities(in);
		
		double prevTime = Timing.getCurrentTimeInSeconds();
		while (zombieSimulator.getNonzombieCount() > 0) {
			double currTime = Timing.getCurrentTimeInSeconds();
			double deltaTime = currTime - prevTime;
			if (deltaTime > 0.0) {
				zombieSimulator.update(deltaTime);
				zombieSimulator.draw();
			}
			StdDraw.pause(10);
			prevTime = currTime;
		}
	}
}
