package module5._3return;

import java.util.Scanner;

public class RandomNumberInRange 
{
    //add your method here
	public static int randomInteger(int min, int max)
	{
		return min + (int)(Math.random() * (max - min + 1));
	}

    public static void main(String args[])  
    {
       //test your method by calling it
    	int min = 0;
    	int max = 1;
    	System.out.println(randomInteger(min, max));

    }
}
