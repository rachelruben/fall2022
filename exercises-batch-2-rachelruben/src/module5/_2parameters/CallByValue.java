package module5._2parameters;

public class CallByValue
{
  public static void square(int x)
  {
    x = x * x;
    System.out.println(x);
  }

  public static void main(String[] args)
  {
    int y = 5;
    square(y);
    System.out.println(y);
  }
}
