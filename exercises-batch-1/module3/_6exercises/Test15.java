package module3._6exercises;

public class Test15
{
    public static void main(String[] args)
    {
        // ADD CODE HERE //
    	int[][] array = { {1,2,3}, {4,5,6}, {7,8,9}};
    	
    	for (int row = 0; row < array.length; row++)
    	{
    		for (int col = 0; col < array[0].length; col++)
    		{
    			System.out.println(array[row][col]);
    		}
    	}
    }
}

