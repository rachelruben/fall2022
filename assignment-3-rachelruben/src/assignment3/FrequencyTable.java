package assignment3;

import java.util.Scanner;

public class FrequencyTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the number of integers (x): ");
		int x = in.nextInt();
		System.out.print("Please enter the maximum values (n): ");
		int n = in.nextInt();
		
		int workingFrequency[] = new int[n];

		
		int input[] = new int[x];
		for (int i = 0; i < x; i++)
		{
			double number = ((Math.random() * n));
			int input1 = (int)(number);
			input[i] = input1;
		}
		
		//output
		System.out.println("Frequencies for " + x + " randomly generated values between 1 and " + n);
		//int frequency = 0;
		//int i = 0, makes it shift down
		for (int i = 0; i < n; i++)
		{
			int frequency=0;
			for (int j = 0; j < x; j++)
			{
				if (input[j] == i)
				{
					frequency=frequency+1;
					workingFrequency[i] = frequency;
				}
				//System.out.println(frequency);

			}
			//for (int j = 0; j < n; j++)
		//	System.out.println(workingFrequency[j]);
			System.out.println((i + 1) + ": " + workingFrequency[i]);
			frequency = 0;
		}
		
		//int round = 0;
		//round++;
		//System.out.println("\n" + round + ": ");
		
		
	}

}
