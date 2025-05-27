package sortanalysis;

import java.util.Scanner;

public class DataSortingAndAnalysis {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		//System.out.print("How big would you like the array to be? ");
		int size = in.nextInt();
				
		while(size <= 0) // cant input 0 or less than 0 because it wont run otherwise
		{
			System.out.print("Your input is invalid! How big would like the array to be? ");
			size = in.nextInt();
		}
		
		int input[] = new int[size]; //new array
		
		System.out.println();
		System.out.print("Input: "); //titles it input 
		for (int i = 0; i < size; i++)
		{
			int number = in.nextInt();
			input[i] = number; //holds the data
			System.out.print(input[i] + " "); //prints the data
		}
		
		for (int i = 0; i < size; i++) //current swapping index in array
		{
			for (int j = i; j < size; j++)
			{
				if (input[i] > input[j])
				{			
					int jMin = 0; //index of minimum value in unsorted portion of array (placeholder)
					jMin = input[j]; //update index of minimum value
					input[j] = input[i];
					input[i] = jMin;
			}		
		}
		
	}
		{
		System.out.println();
		System.out.print("Sorted: ");
		for (int k = 0; k < input.length; k++)
		{
		System.out.print(input[k] + " ");
		}
		
		double length = input.length;
		double sum = 0;
		
		for (int i = 0; i< input.length; i++)
		{
			sum += input[i];
		}
		double mean = (sum / length); 
		System.out.println("\nMean: " + mean);
	
		double median;
		if (size % 2 == 1) //if the total number is odd
		{
			median = input[(size + 1)/2-1];
		}
		else //if the total is even
		{
			median = (double)(input[size/2-1] + input[size/2])/2;
		}
		//median = input[input.length/2];
		System.out.println("Median: " + median);
		
		int minimum = input[0];
		//i = 4 makes it print only once
		for (int i = 1; i < input.length; i++)
		{
			if(input[i] < minimum)
			{
				minimum = input[i];
			}
		}
		System.out.println("Min: " + minimum);

		int maximum = input[0];
		//i = 4 makes it so that it prints only once
		for (int i = 1; i < input.length; i++)
		{
			if(input[i] > maximum)
			{
				maximum = input[i];
			}
		}
		System.out.println("Max: " + maximum);

		int range = maximum - minimum;
		System.out.println("Range: " + range);
		}
	}
}
