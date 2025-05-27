package assignment3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		System.out.print("How big would you like the array to be? ");
		int size = in.nextInt();
		
		if (size < 0) //cannot input 0 or less than 0 because it wont run otherwise
		{ //continues to prompt until valid input
			System.out.print("Your input is invalid! How big would like the array to be? ");
			size = in.nextInt();
		}
		else
		{ //user input
			int input[] = new int[size]; //array declaration
			for (int i = 0; i < size; i++) //start index at 0, loop while index less than array length
				//so that user inputs numbers until the array is filled 
			{
				System.out.print("Enter a number: ");
				int number = in.nextInt();
				input[i] = number;
			}
			System.out.print("Given Values: ");
			for (int i = 0; i < size; i++) 
			{ //given output
				System.out.print(input[i] + " "); //literally just prints it in same order as input
			}
			for (int i = 0; i < size; i++)
			{ //i is index 0 which is first input
				//could also set j=0; j<size-i-1;j++ and then flip if statement and have it j+1
				for (int j = 1; j < size - i; j++) //j is index 1 which is second input
					//compares the first two elements of the array
				{ 
					if (input[j - 1] > input[j])
					{ //swaps array [j] and [j-1] which modifies the array value at index
						int t = input[j - 1]; // j - 1 is the last input right ?
						input[j - 1] = input[j];
						input[j] = t;
					}
				}
			}
			System.out.println();
			System.out.print("Sorted Values: ");
			for (int i = 0; i < size; i++)
			{ //sorted output
				System.out.print(input[i] + " ");
			}
		}
	}
}