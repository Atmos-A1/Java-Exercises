/*Pseudocode:
Collect input from user that stores the value of pounds"
Create a variable that converts the number entered in pounds to kilograms, i.e number stored in pounds * 0.454.
Return the answer to the user. */


import java.util.Scanner;

	public class PoundsToKilograms{
		public static void main(String[]args){

	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the weight in pounds: ");
		float pounds = input.nextFloat();


			float Kilograms = 0.454f * pounds;


		System.out.printf("The weight in Kilograms is: %.4f Kilograms", Kilograms);

	}
}