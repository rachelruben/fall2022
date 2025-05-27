package module1._8practice;

public class Test7
{
    public static void main(String[] args)
    {
        double gallonPrice = 2.35;
        double milesPerGallon = 40;
        double totalFunds = 8.0;
        double numGallons = totalFunds / gallonPrice;
        double numMiles = numGallons * milesPerGallon;
        System.out.println(numMiles);
    }
}
