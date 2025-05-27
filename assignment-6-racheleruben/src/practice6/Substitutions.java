package practice6;

import assignment6.RecursiveMethods;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class Substitutions {
	public static void main(String[] args) {
		String text = "L_G";
		String textPrime = RecursiveMethods.substituteAll(text, 'L', "!");
		//System.out.println(textPrime);
		String textPrimePrime = RecursiveMethods.substituteAll(textPrime, 'G', "GIMLI");
		//System.out.println(textPrimePrime);
		String textPrime0 = RecursiveMethods.substituteAll(textPrimePrime, '!', "LEGOLAS");
		System.out.println(textPrime0);
	}
}
