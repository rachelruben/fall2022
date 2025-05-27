package module3._6exercises;

public class Test13
{

    public static void main(String[] args)
    {
        int[][] array = { {1,2,3},{-1,-2,-3},{4,5,6} };

        //ADD CODE HERE
        int total = 0;
        
        for (int row = 0; row < array.length; row++)
        {
        	total += array[row][row];
        }
        System.out.println("The sum of the diagonal is: " + total);

    }
}

