package practice;

import java.util.Scanner;

public class DoorGame 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			int doorChoice;
			String result;
			Scanner input = new Scanner(System.in);
			System.out.print("Welcome to the amazing door choice game!");
			System.out.print(" With your host, Steve Harvey!");
			System.out.print(" Pick a door, any door. \n1- for door One\n2- for door Two\n3- for door Three");
			doorChoice = input.nextInt();
			
			if(doorChoice == 1)
			{
						result = "a pile of gold!";
			}
			else if (doorChoice == 2) 
			{
				result = "a donkey...cool I guess?";
			}
			else if (doorChoice == 3) 
			{
				result = "long fast food line with slow cashier, oh boy. This is gonna take a while.";
			}
			else
				result = "nothing because this wasn't a choice, you fool";
			displayMessage(result);
	}
	
	
	public static void displayMessage(String result) 
	{
		System.out.println("You won " + result);
	}
}
