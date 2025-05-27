package module5._2parameters;

public class ScopeExample 
{
  public static void inchesToCentimeters(double inches)
  {
      double centimeters = inches * 2.54;
      System.out.println(inches + "-->" + centimeters);
  }

  public static void main(String[] args)  
  {
      inchesToCentimeters(10);
      inchesToCentimeters(15.7);
  }

}
