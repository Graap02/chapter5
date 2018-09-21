package excercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
	
		int condoChoice;
		String result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Summerdale Condo!");
		System.out.println("We would love your company! Please choose from our three condo choices for more info! ");
		condoChoice = input.nextInt();
		if(condoChoice == 1) 
		{
			result = "The Park view, $150,000 for a lovely vision of the beautiful park!";
		}
		else if(condoChoice == 2) 
		{
			result = "The Golf Course view, $170,000, for those who have a high 'drive'! ";
		}
		else if(condoChoice == 3) 
		{
			result = "The Lake view, $210,000, a great glimpse of the calming waters, a true sight to see!";
		}
		else  
			result = "This is not a condo, please choose a condo.";
		displayMessage(result);
		}
	public static void displayMessage(String result) 
	{
		System.out.print(result);
	}
}
