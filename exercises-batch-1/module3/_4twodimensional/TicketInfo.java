package module3._4twodimensional;

public class TicketInfo
{
   public static void main(String[] args)
   {
      // declare arrays
      int[][] ticketInfo = new int[5][10];
      System.out.println(ticketInfo.length + " rows");
      System.out.println(ticketInfo[0].length + " columns");
      
      String[][] studentNames = new String[10][5];
      System.out.println(studentNames.length + " rows");
      System.out.println(studentNames[0].length + " columns");
   }
}
