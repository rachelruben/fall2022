package assignment2;

import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the Game of Nim :)");
		System.out.println("The goal of this game is to be the player who removes the last stick.");
		System.out.print("Input the initial number of sticks: ");
		int initialSticks = in.nextInt();
		int numSticks = initialSticks;

		int rounds = 0;
		
		while(initialSticks > 0) { //keeps the game going until there are no sticks left		
			//round 0 ; human first
			System.out.println("How many sticks would you like to take (1 or 2)?");
			int takenSticks = in.nextInt();	
			while(takenSticks != 1 && takenSticks != 2) { //can only enter values 1 or 2
				System.out.println("Your input is invalid! How many sticks would you like to take (1 or 2)?");
				takenSticks = in.nextInt();
			}
			while(takenSticks > initialSticks) { //human cannot take more than what is left
				System.out.println("Your input is invalid! It is greater than the number of sticks remaining! How many sticks would you like to take?");
				takenSticks = in.nextInt();
			}
			if(takenSticks == 1) { //if human takes 1 stick
				numSticks = initialSticks - takenSticks;
				
				if(numSticks <= 0) {
					numSticks = 0;
				}
				System.out.println("\nRound " + rounds++ + ": " + initialSticks + " at start, human takes " + takenSticks + ", so " + numSticks + " remain.");
				initialSticks =initialSticks - takenSticks;
				
				if(initialSticks <= 0) {
					initialSticks = 0;
					System.out.println("0 sticks remain! Human Wins! :) Computer Loses!");
				}

			//round 1 ; computer first 
				int randomMove = (int)(Math.random()*2)+1; //can only enter values 1 or 2
				
				if(numSticks == 1) {
					randomMove = 1; //so that the computer cannot take more than what is left
				}
				
				if(initialSticks <= 0) //ends game
				break;
					
				if(takenSticks == 1 && randomMove == 1) {
					numSticks = initialSticks - randomMove;
					
					if(numSticks <= 0) {
						numSticks = 0;
					}
					System.out.println("\nRound " + rounds++ + ": " + initialSticks + " at start, computer takes " + randomMove + ", so " + numSticks + " remain.");
					initialSticks = initialSticks - randomMove;
		
					if(initialSticks <= 0) {
						initialSticks = 0;
						System.out.println("0 sticks remain! Computer Wins! You Lose! :(");
					}
				} else {
					numSticks = initialSticks - randomMove;
					
					if(numSticks <= 0) {
						numSticks = 0;
					}
					System.out.println("\nRound " + rounds++ + ": " + initialSticks + " at start, computer takes " + randomMove + ", so " + numSticks + " remain.");
					initialSticks = initialSticks - randomMove;
					
					if(initialSticks <= 0) {
						initialSticks = 0;
						System.out.println("0 sticks remain! Computer Wins! You Lose! :(");
					}
				}
			} else {
				numSticks = initialSticks - takenSticks;
				
				if(numSticks <= 0) {
					numSticks = 0;
				}
				System.out.println("\nRound " + rounds++ + ": " + initialSticks + " at start, human takes " + takenSticks + ", so " + numSticks + " remain.");
				initialSticks =initialSticks - takenSticks;
				
				if(initialSticks <= 0) {
					initialSticks = 0;
					System.out.println("0 sticks remain! Human Wins! :) Computer Loses!");
				}
				//math random gives between 0 and 0.9..., so int math random gives 0*2+1=1 and 0.9...*2+1=2 ; int always rounds down
				int randomMove = (int)(Math.random()*2)+1; 
				
				if(numSticks == 1) {
					randomMove = 1; //so that the computer cannot take more than what is left
				}
				
				if(initialSticks <= 0) //ends game 
					break;
				
				if(takenSticks == 2 && randomMove == 1) {			
					numSticks = initialSticks - randomMove;
					
					if(numSticks <= 0) {
						numSticks = 0;
					}
					System.out.println("\nRound " + rounds++ + ": " + initialSticks + " at start, computer takes " + randomMove + ", so " + numSticks + " remain.");
					initialSticks = initialSticks - randomMove;
					
					if(initialSticks <= 0) {
						initialSticks = 0;
						System.out.println("0 sticks remain! Computer Wins! You Lose! :(");
					}

				} else {			
					numSticks = initialSticks - randomMove;
					
					if(numSticks <= 0) {
						numSticks = 0;
					}
					System.out.println("\nRound " + rounds++ + ": " + initialSticks + " at start, computer takes " + randomMove + ", so " + numSticks + " remain.");
					initialSticks = initialSticks - randomMove;
				
					if(initialSticks <= 0) {
						initialSticks = 0;
						System.out.println("0 sticks remain! Computer Wins! You Lose! :(");
					}

				}
				
			}
		}
										}
	
				}