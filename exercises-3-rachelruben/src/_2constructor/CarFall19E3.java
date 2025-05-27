package _2constructor;

public class CarFall19E3 {

	private double milesDriven;
	private final double milesPerGallon;
	private final double maxFuel;
	private double currentFuel;
	
	public interface Drivable {
		public void drive(double milesPerHour, double hours);
		public double getMilesDriven();
	}
	
	public CarFall19E3(double milesPerGallon, double maxFuel) {
		this.milesDriven = 0; //brand new car has not been driven
		this.currentFuel = 0; //brand new car has no gas
		this.milesPerGallon = milesPerGallon;
		this.maxFuel = maxFuel;
	}
	
	public void drive(double milesPerHour, double hours) {
		double miles = milesPerHour * hours;
		double fuelUsed = miles / this.milesPerGallon;
		if(fuelUsed < this.currentFuel) {
			this.currentFuel = this.currentFuel - fuelUsed;
			this.milesDriven = this.milesDriven + miles;
		} else { //out of gas
			fuelUsed = this.currentFuel;
			miles = fuelUsed * this.milesPerGallon;
			this.currentFuel = 0;
			this.milesDriven = this.milesDriven + miles;
		}
	}
	
	public double getMilesDriven() {
		return this.milesDriven;
	}
	
	public double addFuel(double gallons) {
		if(gallons > this.maxFuel - this.currentFuel) { //too much gas
			double fuelOver = gallons - (maxFuel - currentFuel);
			this.currentFuel = this.maxFuel;
			return fuelOver;
		} else { 
			this.currentFuel = this.currentFuel + gallons;
			return 0;
		}
	}
	
	public String toString() {
		return "Miles Driven: " + this.milesDriven + " Current Fuel: " + this.currentFuel;
	}
		
	
	public static void main(String[] args) { //want to make a car
		// TODO Auto-generated method stub
		//variable declaration (type instance = new type(parameters)
		CarFall19E3 hondaFit = new CarFall19E3(20, 12);
		//NAME reference to instance ... instance.methodName
		double fuelOver = hondaFit.addFuel(12);
		System.out.println(fuelOver);
		System.out.println(hondaFit);
	}
}
