package module5._2parameters;

public class ShippingCostCalculator {

	public static void calculateShipping(double weight) 
	//calculateShpping as method and weight is parameter
	{
		double cost; //local variable cost
		if (weight < 15.00)
		{
			cost = 9.95;
		}
		else
		{
			cost = 12.95;
		}
		System.out.println(cost);
	}
	public static void main(String[] args) {
		
		double weight1, weight2, weight3;
		double cost1, cost2, cost3;
		
		weight1 = 22.0;
		weight2 = 10.0;
		weight3 = 12.0;
		
		calculateShipping(weight1);
		calculateShipping(weight2);
		calculateShipping(weight3);
		
	}
}
