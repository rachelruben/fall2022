package module5._3return;

public class InchesToCentimeters 
{
  public static double inchesToCentimeters(double inches)
      {
          return(inches * 2.54);
      }

      public static void main(String[] args)  
      {
    	  double centimeters;
          centimeters = inchesToCentimeters(10);
          System.out.println(centimeters);
          centimeters = inchesToCentimeters(12.5);
          System.out.println(centimeters);
      }
}
