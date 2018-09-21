package gameZone;

import java.util.Scanner;
import java.util.Random;

public class randomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userGuess;
		int computerSecret;
		int quit;
		
		String result = null;
		String result2 = null;
		computerSecret = (int)(Math.random() * 10 + 1);
		
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("Pick a number, any number as long as it's no higher than 10 >> ");
		userGuess = input.nextInt();	
		
		if(userGuess < computerSecret) 
		{
			result = "The number is higher.";
		}
		else if(userGuess > computerSecret)
		{
			result = "The number is lower.";
		}
		else if(userGuess == computerSecret) 
		{
			result = "You win!";
		}
		displayMessage(result);
		System.out.println("Do you want to quit? 1 for yes, 2 for no. ");
		quit = input.nextInt();
			}while(1 != quit);
		if(quit == 1) {
			result2 = "Goodbye!";
		}
		else 
			result2 = "Let's continue playing!";
		displayMessage(result2);
	}

	public static void displayMessage(String result) 
	{
		System.out.println(result);
	}
	public static void displayMessage2(String result2) {
		System.out.println(result2);
	}
}
