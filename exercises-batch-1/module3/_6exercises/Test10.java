package module3._6exercises;

public class Test10
{
    public static void main(String[] args)
    {
        // ADD CODE HERE //
    	String[][] colors = { {"red", "yellow", "blue"}, {"orange", "green", "purple"} };
    	
    	for (int row = 0; row < colors.length; row++)
    	{
    		for (int col = 0; col < colors[0].length; col++)
    		{
    			System.out.println(colors[row][col]);
    		}
    	}
    }
}

