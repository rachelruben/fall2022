package assignment8.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import assignment8.Entity;
import assignment8.ZombieSimulator;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class ZombieTestUtils {
	public static ZombieSimulator readZombieSimulator(String filename) {
		Scanner ap;
		ZombieSimulator zombieSimulator = new ZombieSimulator();

		try {
			ap = new Scanner(new File("zombieSims/" + filename));
			zombieSimulator.readEntities(ap);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zombieSimulator;
	}

	public static List<Entity> readEntities(String filename) {
		return readZombieSimulator(filename).getEntities();
	}
}
