package assignment4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class ZombieData {

	public static void main(String[] args) throws Exception {
		// NOTE: The lines below will prompt the user with a file open dialog box.
		//       The contents of the selected file will be made available via the ArgsProcessor ap.
		JFileChooser chooser = new JFileChooser("zombieSims");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	
		// TODO: 1. Read in the number of entities from Scanner			
		if(in.hasNextLine()) {
			int N = in.nextInt();
			System.out.println(N);

		// TODO: 2. Create the arrays that will hold entity data
		boolean[] areZombies = new boolean[N];
		double[] xs = new double[N];
		double[] ys = new double[N];
		int count = 0;

		// TODO: 3. Read in all the Entity data		
		for(int i = 0; i < areZombies.length; i++) {
			String zombie = in.next();
			if(zombie.equals("Zombie")) {
				areZombies[i] = true;
			}
			else {
				areZombies[i] = false;
				count++;
			}
			xs[i] = in.nextDouble();
			ys[i] = in.nextDouble();
		}
					
		// TODO: 4. Iterate through all the data and display it using StdDraw
		for(int i = 0; i < areZombies.length; i++) {
			if(areZombies[i] == true) {
				StdDraw.setPenRadius(0.008);
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledCircle(xs[i], ys[i], 0.008);
			}
			else {
				StdDraw.setPenRadius(0.008);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(xs[i], ys[i], 0.008);
			}
			Color purple = new Color(200, 50, 210);
			StdDraw.setPenColor(purple);
			StdDraw.text(0.1, 0.15, count + "/" + areZombies.length);

			}
		}
	}
}

