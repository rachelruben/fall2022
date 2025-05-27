package module5._2parameters;

public class PayrollCalculator
{

  //add a new static method calculatePay here
  public static void calculatePay( String employee, double hourlyRate, double hoursWorked)
  {
	  double weeklyPay = hourlyRate * hoursWorked;
	  System.out.println(employee + ":" + weeklyPay);
  }



  public static void main(String[] args)
  {
	  calculatePay ( "Fred" , 12.50, 20.0);
      //call calculatePay for employee Fred, hourly rate 12.50 and hours worked 20.0

      calculatePay ( "Amir" , 15.00, 35.0);
	  //call calculatePay for employee Amir, hourly rate 15.0 and hours worked 35.0

  }
}

