package module3._3foreach;

public class IncrementLoop
{
   public static void main(String[] args)
   {
     int[ ] values = {6, 2, 1, 7, 12, 5};
     // Can this loop increment the values?
     for (int i = 0; i < values.length; i++)
     {
       System.out.println("New val: " + (values[i]+1));
     }
     // Print out array to see if they really changed
     System.out.println("Array after the loop: ");
     for (int i = 0; i < values.length; i++)
     {
       System.out.print(values[i]+1 + " ");
     }
   }
}

