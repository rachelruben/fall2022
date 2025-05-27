package module2._10exercises;

public class Test2
{
    public static void main(String[] args)
    {
        int guess = 10;
        int answer = 9;
        if (guess < answer)
            System.out.println("Your guess is too low");
        else if (guess == answer)
            System.out.println("You are right!");
        else
            System.out.println("Your guess is too high");
    }
}

