package excercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		int dataPlan;
		String result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Horizon Phones, what are you looking for in terms of a package?");
		System.out.println("We have 6 choices, to learn more about them please type in the number of the package you wish to learn about.");
		dataPlan = input.nextInt();
		if(dataPlan == 1)
		{
			result = "Fewer than 500 minutes of talk with no text and data, at $49 a month.";
		}
		else if(dataPlan == 2)
		{
			result = "Fewer than 500 minutes of talk with any text messages, at $55 a month.";
		}
		else if(dataPlan == 3)
		{
			result = "500 or more minutes of talk and no data, with 100 text messages at $61 a month.";
		}
		else if(dataPlan == 4)
		{
			result = "Similar to plan C, however this offers 100 or more text messages at $70 a month.";
		}
		else if(dataPlan == 5)
		{
			result = "For 2 gigabytes of data at $79 a month, plan E is the one for you.";
		}
		else if(dataPlan == 6)
		{
			result = "Similar to plan E, you can get 2 gigabytes or more of data for $87 a month.";
		}
		else
			result = "Please choose a package.";
		displayMessage(result);
		}
	public static void displayMessage(String result) {
		System.out.print(result);
	}
	}
