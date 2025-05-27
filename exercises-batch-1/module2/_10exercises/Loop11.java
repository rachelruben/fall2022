package module2._10exercises;

public class Loop11
{
    public static void main(String[] args)
    {
        String message = "Ix lovex youxxx";
        int pos = message.indexOf("x");
        while (pos >= 0)
        {
        	System.out.println(message);
        	message = message.substring(0,pos) + message.substring(pos + 1);
        	pos = message.indexOf("x");

        }


    }
}
