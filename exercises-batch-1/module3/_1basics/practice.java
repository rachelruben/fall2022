package module3._1basics;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//spring 2019 exam number 7 
		Scanner in = new Scanner(System.in);
		System.out.print("How many rows and columns? ");
		int N = in.nextInt();
		boolean[][] A = new boolean[N][N];
		int numTrue = 0; // at end how many are true
		
		//part 1 
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A[0].length; j++)
			{
				double row = (Math.random());
				
				if (row > 0.5)
				{
					A[i][j] = true;
					System.out.print(" t ");
					numTrue++;
				}
				else
				{
					A[i][j] = false;
					System.out.print(" f ");
				}
				
			}
			
			System.out.println();
			
		}
		System.out.println("The number of true cells in the array I just filled is " + numTrue);
		
		//part 2
		System.out.print("Which row do you want to examine?");
		int r = in.nextInt();
		boolean found = false;
		//my code
		if (found)
		{
			System.out.println("There is a true value in row " + r);
		}
		else
		{
			System.out.println("There are only false values in row " + r);
		}
		

	}

}
