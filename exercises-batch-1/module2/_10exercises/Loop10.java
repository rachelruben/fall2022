package module2._10exercises;

public class Loop10
{
    public static void main(String[] args)
    {
           String message = "help";
           for (int i = message.length(); i >= 0; i --)
           {
        	   System.out.println(message.substring(0,i));
           }

    }
}
