package module1._3expressions;

public class DogAgeChallenge
{
   public static void main(String[] args)
   {
      // Fill in values for these variables
      int currentYear = 2022;
      int birthYear = 2003;
      int dogBirthYear = 2016;

      // Write a formula to calculate your age
      // from the currentYear and your birthYear variables
      int age = currentYear - birthYear;
      System.out.println("You are: " + age);
      

      // Write a formula to calculate your dog's age
      // from the currentYear and dogBirthYear variables
      int dogAge = currentYear - dogBirthYear;
      System.out.println("Your dog is: " + dogAge);

      // Calculate the age of your dog in dogYears (7 times your dog's age in human years)
      int dogYearsAge = dogAge * 7;
      System.out.println("In dog years, your dog is: " + dogYearsAge);
      

      // Print out your age, your dog's age, and your dog's age in dog years. Make sure you print out text too so that the user knows what is being printed out.


   }
}
