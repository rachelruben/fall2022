package module1._8practice;

public class RectangleTest
{
    public static void main(String[] args)
    {
    final double width = 7;
    final double height = 9;
    
    double area = width * height;
    double perimeter = 2 * (width + height);
    
    System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
    System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    
   
    }
}
