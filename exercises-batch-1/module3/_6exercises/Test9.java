package module3._6exercises;

public class Test9
{
    public static void main(String[] args)
    {
        String[][] arr = { {"Hey ", "there! "},{"I ", "hope "},
                          {"you ", "are "}, {"doing ", "well"} };

        // ADD CODE HERE //
        for (int row = 0; row < arr.length; row++)
        {
        	for (int col = 0; col < arr[0].length; col++)
        	{
        		System.out.println(arr[row][col]);
        	}
        }

    }
}

