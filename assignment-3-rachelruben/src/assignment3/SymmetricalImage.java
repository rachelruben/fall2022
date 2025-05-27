package assignment3;

import java.util.Scanner;

public class SymmetricalImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n;
		int m;
		int x;
		int y;
		//input prompt
		System.out.print("Enter the value of m: ");
		m = in.nextInt();
		
		System.out.print("Enter the value of n: ");
		n = in.nextInt();

		//string array because it holds words and characters
		//like width and height stuff
		String image[][] = new String[m][n];
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				image[i][j] = " "; //spaces between stars or blank space
			}
		}
		for (int point = 1; point <= m * n / 4; point++) //random points
		{
			x = (int)(Math.random() * m);
			y = (int)(Math.random() * n);
			
			image[x][y] = "*"; //print star
			image[x][n - y - 1] = "*"; //print star
		}
		
		//how it displays
		for (int i = 0; i < m; i++) //
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
