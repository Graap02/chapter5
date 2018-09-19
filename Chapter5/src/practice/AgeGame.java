package practice;

import java.util.Scanner;

public class AgeGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int usersAge;
		Scanner input = new Scanner(System.in);
		String result;
		System.out.println("Please enter your age to be insulted");
		usersAge = input.nextInt();
		
		if(usersAge <= 12)
		{
			result = "You are a child! Leave, for this place is not fit for children!";
		}
		else if(usersAge >= 13 && usersAge <= 18)
		{
			result = "You're almost an adult and your life looks like THAT? You've got issues, big time pal.";
		}
		else if(usersAge >= 19 && usersAge <= 25)
		{
			result = "How's the McDonalds drive through looking? 4 straight years of this, you really are pathetic.";
		}
		else if(usersAge >= 26 && usersAge <= 30)
		{
			result = "Have you even seen a girls'/boys' bedroom that ISN'T related to you?";
		}
		else if(usersAge >= 31 && usersAge <= 40)
		{
			result = "I bet you enjoy trying to make your nieces and nephews play golf.";
		}
		else if(usersAge >= 41 && usersAge <= 50)
		{
			result = "Alright buddy, sure ya run a business. Guarantee you're still running the Target bagging aisle.";
		displayMessage(result);
		}
		//0-12
		//13-18
		//19-25
		//26-30
		//31-40
		//41-50
		//51-60
		//61-death
	}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}
}
