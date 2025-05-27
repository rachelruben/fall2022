package pascal;

import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//System.out.print("Enter the number of rows: ");
		
	//extension attempt 2
		int numRows = in.nextInt();
		int [][] pascal = new int[numRows][numRows]; //i rows , j columns 
		
		for (int i = 0; i < numRows; i++)//iterate through all rows
		{
			pascal[i][0] = 1; //first element as one 
			for (int j = 1; j <= i; j++) //Pascal triangle elements
			{
				pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]; //store in array
			}
		}
		
		System.out.println("column");
		System.out.println("column");
		
		for (int i = 0; i < numRows; i++)
		{
			System.out.print(i + " ");
			//System.out.print(i);
		}
		System.out.println("\nrow");
		
		for (int i = 0; i < numRows; i++)
		{
			System.out.print(i + " "); //gets the row numbers descending
			for (int j = 0; j <= i; j++)
			{
				System.out.print(pascal[i][j] + " " + " ");//spacing
			}

			System.out.println();
			}
		
		//what prints nicely but does not pass 
		//System.out.print("      column\n");
		//for (int i = 0; i < numRows; i++)
		//{
		//	System.out.print(i + "      ");
			//System.out.print(i);
		//}
		//System.out.println("\nrow");
		
		//for (int i = 0; i < numRows; i++)
	//	{
		//	System.out.print("\n" + i + "     "); //gets the row numbers descending
		//	for (int j = 0; j <= i; j++)
		//	{
		//		System.out.print(pascal[i][j] + " " + " ");//spacing
		//	}

		//	System.out.println();
		//	}//
	}
	//int rows = in.nextInt(); //n rows
	//int[][] pascal = new int[rows][rows];//rows and columns are the same
	
	//this version works for the wikipedia one , formatting is slightly off
	//for (int i = 0; i <= rows; i++)
	//{
		//for (int j = 0; j <= rows - i; j++)
	//	{
		//	System.out.print(" "); // for left spacing
		//}
		//int C = 1;
	//	for (int k = 1; k <= i; k++)
	//	{
	//		System.out.print(C + " ");
	//		C = C * (i - k) / k;
	//	}
	//	System.out.println();
	
}

