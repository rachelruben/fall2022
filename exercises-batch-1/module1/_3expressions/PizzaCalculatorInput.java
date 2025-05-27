package module1._3expressions;

import java.util.Scanner;
public class PizzaCalculatorInput {

    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        //add code to initialize pizzaSlices and numPeople from user input 
        System.out.println("How many pizza slices?");
        pizzaSlices = scan.nextInt();
        
        System.out.println("How many people?");
        numPeople = scan.nextInt();
        
        slicesPerPerson = pizzaSlices / numPeople;
        leftoverSlices = pizzaSlices % numPeople;
        System.out.println(slicesPerPerson);
        System.out.println(leftoverSlices);
        
        
        //add code to compute and print slicesPerPerson and leftoverSlices
        
       
    		   

    }

}
