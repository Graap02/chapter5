package excercises;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int x;
		String result;
		System.out.print("Please enter a number >> ");
		x = input.nextInt();
	
	if(0 == x%2) 
	{
		result = "even";
	}
	else
		result = "odd";
	displayMessage(result);
	}
	public static void displayMessage(String result) {
		System.out.print(result);
	}
	
}	
	
	
		
	


