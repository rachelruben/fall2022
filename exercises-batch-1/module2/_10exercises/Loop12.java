package module2._10exercises;

public class Loop12
{
    public static void main(String[] args)
    {
        String message = "xyxxzax";
        int pos = message.indexOf("x");
        int count = 0;
        while (pos >= 0)
        {
        	count++;
        	message = message.substring(pos + 1);
        	pos = message.indexOf("x");
        }
        System.out.println("There were " + count + " x's");
    }
}
