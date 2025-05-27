package module3._3foreach;

public class ForEachDemo
{
   public static void main(String[] args)
   {
     int[] highScores = { 10, 9, 8, 8, 4};
     String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sydney"};
     // for each loop with an int array
     for (int value : highScores)
     // Print out the length of the new arrays
     {
         System.out.println( value );
     }
     // for each loop with a String array
     for (String value : names)
     {
         System.out.println(value); // this time it's a name!
     }
   }
 }
 
