package minesweeper;

import java.util.Scanner;

public class MineSweeper {
	public static void main(String[] args) {

		//
		// Do not change anything between here ...
		//
		Scanner in = new Scanner(System.in);
		System.out.println("How many columns?");
		int cols = in.nextInt();
		System.out.println("How many rows?");
		int rows = in.nextInt();
		System.out.println("What is the probability of a mine?");
		double probability = in.nextDouble();
		//
		// ... and here
		//
		// Your code goes below these comments
		//
		int numMines;
		boolean[][] mineField;
		boolean[][] fieldData;
		//rows = fieldData.length;
		//cols = fieldData[0].length;
		mineField = new boolean[rows][cols];
		
		//for (int row = 0; row < fieldData.length; row++)
		{
		//	for (int col = 0; col < fieldData[0].length; col++)
			{
			//	mineField[rows][cols] = fieldData[rows][cols];
				
				//if (mineExists(rows,cols))
				{
			//		numMines++;
				}
			}
		}
		
		int numRows = rows;
		int numCols = cols;
	//	int totalMines = numMines;
		mineField = new boolean[numRows][numCols];
		
		for (int i = 0; i < numRows; i++)
		{
			for (int j = 0; j < mineField[1].length; j++)
			{
				mineField[i][j] = false;
			}
		}
	
	for (int i = 0; i < mineField.length; i++)
	{
		for (int j = 0; j < mineField[0].length; j++)
		{
			if (mineField[i][j])
			{
				mineField[i][j] = false;
			}
		}
	}
	
	int count = 0;
	//while (count != totalMines)
	{
	//	int randomRow = (int)Math.random
	}

		
	}
}
