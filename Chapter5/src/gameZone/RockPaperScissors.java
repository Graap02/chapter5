package gameZone;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String rock;
		String paper;
		String scissors;
		String pchoice;
		String result;
		String gameGuess;
		String computerSecret;
		System.out.println("Welcome to the Rock Paper Scissors game!");
		System.out.println("We all know how to play this age old game, so no need for rule explanation!");
		System.out.println("Select your means of battle, whether it be Rock, Paper, or Scissors.");
		pchoice = input.next();
		gameGuess = (Math.random() )
		
		if(pchoice == rock && gameGuess == paper) {
			result = "You lose! Better luck next time friend.";
		}
		else if(pchoice == rock && gameGuess == scissors) {
			result = "You win! Good job, I was rooting for you the whole time.";
		}
		else if(pchoice == rock && gameGuess == rock) 
		{
			result = "You tied, nice one. Neither of you win today.";
		}
		else if(pchoice == paper && gameGuess == rock) 
		{
			result = "You win! Good job, I was rooting for you the whole time.";
		}
		else if(pchoice == paper && gameGuess == paper) 
		{
			result = "You tied, nice one. Neither of you win today.";
		}
		else if(pchoice == paper && gameGuess == scissors) 
		{
			result = "You lose! Better luck next time friend.";
		}
		else if(pchoice == scissors && gameGuess == rock) 
		{
			result = "You lose! Better luck next time friend.";
		}
		else if(pchoice == scissors && gameGuess == paper) 
		{
			result = "You win! Good job, I was rooting for you the whole time.";
		}
		else if(pchoice == scissors && gameGuess == scissors) 
		{
			result = "You tied, nice one. Meither of you win today.";
		}
		else
			result = "That isn't a guess, automatic loss.";
		displayMessage(result);
	}
		public static void displayMessage(String result) 
		{
			System.out.println(result);
		}
}
