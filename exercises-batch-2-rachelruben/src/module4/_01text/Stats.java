package module4._01text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Stats {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Code for setting up Scanner with a file
		//Not your responsibility to understand this part!
		JFileChooser chooser = new JFileChooser("datafiles");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		
		//Using scanner to read from a file
		//Modify and add to the code below
		//to complete the exercise
		//still confused
		double total = 0;
		int count = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		while(in.hasNextDouble()) {
			double d = in.nextDouble();
			if (d > max) {
				max = d;
			}
			if (d < min) {
				min = d;
			}
			System.out.println(in.nextDouble());
			total = total + d;
			count++;			
		}
		System.out.println("Sum: " + total);
		System.out.println("Count: " + count);
		System.out.println("Average: " + (total/count));
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
