package debugging;
//FixDebugFive3.java
//Determines whether item number on order is valid
//Over 999 invalid
//Less than 111 Invalid
//Valid and less than 500 - Automotive Department
//Valid and 500 or higher Housewares Department

import java.util.Scanner;
public class FixDebugFive3
{
private static final int LOW = 0;
private static final int HIGH = 0;
private static final int CUTOFF = 0;
public static void main (String args[])
{
   int item;
   String output;
   final int LOW = 111;
   final int HIGH = 9;
   final int CUTOFF = 500;
   Scanner input = new Scanner(System.in);
   calculateOutPut();
}
public static void calculateOutPut()
{
	 Scanner input = new Scanner(System.in);     
   System.out.println("Please enter item number");
int item = input.nextInt();
   String output;
if(item < LOW) output = "Item number too low";
   else
if(item > HIGH)
output = "Item number too high";
   else
if(item > CUTOFF)
          output = "Valid - in Automotive Department";
       else
          output = "Valid - Item in Housewares Department";
    System.out.println(output);
}
}