package rockpaperscissors;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int cycleRock = 1;
		
		int cyclePaper = 2;
	
		int cycleScissors = 3;
		
		System.out.println("How many rounds would you like to play?");
		
		int roundChosen = in.nextInt();
		int round = 0;
		int RPSresult = 0;
		int randomWins = 0;
		int cycleWins = 0;
		int tie = 0;
		
		int cyclePlayer = 0;
		
		while(round <= roundChosen)
		{ // first turn
			round++;
			System.out.println("\nRound " + round + ":");
			// cycle move
			if(cyclePlayer == 0)
			{
				System.out.println("Cycle Player: Rock");
			}
			else if(cyclePlayer == 1)
			{
				System.out.println("Cycle Player: Paper");
			}
			else
			{
				System.out.println("Cycle Player: Scissors");
			}
			// random move
			double randomRPS = Math.random();
			if(randomRPS < (1.0/3.0))
			{
				RPSresult = 0;
			}
			else if(randomRPS < (2.0/3.0))
			{
				RPSresult = 1;
			}
			else
			{
				RPSresult = 2;
			}
			
			if(RPSresult == 0)
			{
				System.out.println("Random Player: Rock");
			}
			else if(RPSresult == 1)
			{
				System.out.println("Random Player: Paper");
			}
			else
			{
				System.out.println("Random Player: Scissors");
			}
			// results
			if(cyclePlayer == 0 && RPSresult == 2)
			{
				System.out.println("Rock Beats Scissors! Cycle Player Wins!");
				cycleWins++;
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
			}
			else if(cyclePlayer == 1 && RPSresult == 0)
			{
				System.out.println("Paper Beats Rock! Cycle Player Wins!");
				cycleWins++;
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
			}
			else if(cyclePlayer == 2 && RPSresult == 1)
			{
				System.out.println("Scissors Beats Paper! Cycle Player Wins!");
				cycleWins++;
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
			}
			else if(cyclePlayer == 0 && RPSresult == 2)
			{
				System.out.println("Rock Beats Scissors! Cycle Player Wins!");
				cycleWins++;
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
			}
			else if(cyclePlayer == 1 && RPSresult == 0)
			{
				System.out.println("Paper Beats Rock! Cycle Player Wins!");
				cycleWins++;
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
			}
			else if(cyclePlayer == 2 && RPSresult == 1)
			{
				System.out.println("Scissors Beats Paper! Cycle Player Wins!");
				cycleWins++;
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
			}
			else if(cyclePlayer == 2 && RPSresult == 0)
			{ 
				System.out.println("Rock Beats Scissors! Random Player Wins!");
				randomWins++;
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
			}
			else if(cyclePlayer == 0 && RPSresult == 1)
			{ 
				System.out.println("Paper Beats Rock! Random Player Wins!");
				randomWins++;
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
			}
			else if(cyclePlayer == 1 && RPSresult == 2)
			{ 
				System.out.println("Scissors Beats Paper! Random Player Wins!");
				randomWins++;
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
			}
			else
			{
				System.out.println("It is a tie!");
				System.out.println("Cycle Wins: " + cycleWins + "! Random Wins: " + randomWins);
				tie++;
			}
			if(cyclePlayer == 2)
				{
				cyclePlayer = 0;
				}
			else
			{
				cyclePlayer++;
			}
		}
		
	double cycleFraction = ((cycleWins * 10.0) / 10.0) / ((roundChosen * 10.0) / 10.0);
	System.out.println("\nTotal Cycle Wins: " + cycleWins + " (" + cycleFraction + ")");
	
	double randomFraction = ((randomWins * 10.0) / 10.0) / ((roundChosen * 10.0) / 10.0);
	System.out.println("Total Random Wins: " + randomWins + " (" + randomFraction + ")");
		 
	if(cycleWins > randomWins)
	{
		System.out.println("Cycle Player Wins!");
	}
	else if(cycleWins < randomWins)
	{
		System.out.println("Random Player Wins!");
	}
	else
	{
		System.out.println("It is a tie!");
	}
	}
}


