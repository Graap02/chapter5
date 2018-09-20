package excercises;

import java.util.Scanner;

public class AscendingandDescending {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int low;
		int medium;
		int high;
		Scanner input = new Scanner(System.in);
		System.out.print("Please input an integer >> ");
		num1 = input.nextInt();
		System.out.print("Please input a second integer >> ");
		num2 = input.nextInt();
		System.out.print("Please input a third integer >> ");
		num3 = input.nextInt();
		
		if(num1 <= num2 && num1 <= num3)
		{
			low = num1;
			if(num2 <= num3) {
				medium = num2;
				high = num3;
			}
			else if (num1 >= num2 && num2 <= num3) {
				low = num2;
				if(num1 >= num3)
					medium = num3;
					high = num1;
			}
			else if(num2 >= num3 && num1 >= num3) {
				low = num3;
				if(num1 <= num2)
					medium = num1;
					high = num2;
			}
			else
				System.out.println("you broke it, nice job");
		}
		System.out.println(low + " " + medium + " " + high);
	}
	
}
