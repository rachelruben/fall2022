package module3._6exercises;

public class Test11
{

    public static void main(String[] args)
    {
        int[][] array = { {4,7,8},{8,8,7} };

        //ADD CODE HERE
        int count = 0;
        
        for (int row = 0; row < array.length; row++)
        {
        	for (int col = 0; col < array[0].length; col++)
        	{
        		if (array[row][col]==7)
        			count++;
        		
        	}
        }
        System.out.println(count);

    }
}

