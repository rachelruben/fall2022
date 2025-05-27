package speedlimit;

import java.util.Scanner;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//System.out.println("Enter the speed you were going:");
		int speedNumber = in.nextInt();
		
		// speeding tickets consist of $50 base fine , $50 surcharge
		//$10 for each mile per hour over 10 MPH more than the speed limit
		//System.out.println("Enter the speed limit of the road you were on:");
		int speedLimit = in.nextInt();
		
		int overLimit = speedNumber - speedLimit;
		
		//gives you $100 fine if its less than or equal to ten miles 
		int speedFine = 100;
		speedFine = ((overLimit >= 1 && overLimit <= 10) ? 100 : (overLimit * 10));
		
		String result = overLimit <= 0 ? "Have a nice day." : "You reported a speed of " + speedNumber + " MPH for a speed limit of " + speedLimit + " MPH. \nYou went " + overLimit + " MPH over the speed limit. \n Your fine is $" + speedFine + ".";
		
		//System.out.println("You reported a speed of " + speedNumber + " MPH for a speed limit of " + speedLimit + " MPH.");
		//System.out.println("You went " + overLimit + " MPH over the speed limit.");
		//System.out.println("Your fine is $" + speedFine + ".");
		//System.out.println("Have a nice day.");
		System.out.print(result);
		
		
		
		
	}

}
