/*Pseudocode.
1. Take input from the user stating the subtotal and rate in the same statement.
2. Create a variable to store the calculation of gratuity: subtotal * (rate/100)
3. Create another variable that stores the sum of the gratuity and sub total, which returns the total.
4. Print the output for the user. */


import java.util.Scanner;
	public class Gratuity{
		public static void main(String[]args){


		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of your sub total and rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();

		double gratuity = subtotal * (rate / 100);

		double total = subtotal + gratuity;

		
		System.out.printf("The gratuity and total is: $ %.2f and $ %.2f%n", gratuity, total);

	}
}