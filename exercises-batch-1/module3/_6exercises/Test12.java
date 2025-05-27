package module3._6exercises;

public class Test12
{

    public static void main(String[] args)
    {
        int[][] table = { {1,4,9},{11,4,3},{2,2,3} };

        //ADD CODE HERE
        int sum = 0;
        
        for (int col = 0; col < table[0].length; col++)
        {
        	sum += table[1][col];
        }
        System.out.println("The sum is: " + sum);

    }
}
