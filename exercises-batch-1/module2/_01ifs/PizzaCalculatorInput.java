package module2._01ifs;

import java.util.Scanner;
public class PizzaCalculatorInput {

    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        pizzaSlices = scan.nextInt();
        numPeople = scan.nextInt();
        
        if (numPeople > 0)
        {
        	 slicesPerPerson = pizzaSlices / numPeople;
             leftoverSlices = pizzaSlices % numPeople;
             System.out.println(slicesPerPerson);
             System.out.println(leftoverSlices);
        }
       

    }

}
