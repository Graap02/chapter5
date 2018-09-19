package practice;

import java.util.Scanner;

public class DoorGame 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			int doorChoice;
			int bookChoice;
			String result;
			Scanner input = new Scanner(System.in);
			System.out.print("Welcome to the amazing door choice game!");
			System.out.print(" With your host, Steve Harvey!");
			System.out.print(" Pick a door, any door. \n1- for door One\n2- for door Two\n3- for door Three ");
			doorChoice = input.nextInt();
			
			if(doorChoice == 1)
			{
				System.out.println("Door 1, good choice my friend. Choose among the following chests.");
				System.out.println("1- For chest one\n2- for chest two");
				int chestChoice = input.nextInt();
				if(chestChoice == 1 ) {
					result = "a pile of gold!";
				}
				else if (chestChoice == 2) {
					result = "nothing but scraps and rags for you today.";
				}
				else
					result = "a path strayed from the world, and now only death's cold embrace can reach you.";
			}
			else if (doorChoice == 2) 
			{
				result = "a donkey...cool I guess?";
			}
			else if (doorChoice == 3) 
			{
				result = "a long fast food line with slow cashier, oh boy. This is gonna take a while.";
			}
			else if(doorChoice == 999)
			{
				System.out.print("You enter a room, that has an odd aura within it. There is only a table, with three books on it, "
						+ "which one will you take? ");
				bookChoice = input.nextInt();
				if(bookChoice == 1) {
					result = "a book on the fine arts of magic, and what it has to offer.";
				}
				else if(bookChoice == 2) {
					result = "a book with the most unsettling page, and gain only the knowledge on how it feels to fear the light.";
				}
				else if(bookChoice == 3) {
					result = "a book filled with the words of a magnificent tale, however you don't speak Japanese "
							+ "so you can't read it";
				}
				else
					result = "all three of them, as your indecisevness led to greediness.";
			}
				else result = "nothing because this wasn't a choice, you fool";
			displayMessage(result);
	}
	
	public static void displayMessage(String result) 
	{
		System.out.println("You won " + result);
	}
}
