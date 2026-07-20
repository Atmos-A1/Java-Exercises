import java.util.Scanner;
public class Squares {
	public static void main (String[]args) {
		Scanner input = new Scanner( System.in );

		System.out.print("Enter First Integer:  ");
		int number1 = input.nextInt();

		System.out.print("Enter Second Integer:  ");
		int number2 = input.nextInt();

		int square1 = number1 * number1;
		int square2 = number2 * number2;
		int sumOfsquares = square1 + square2;
		int differenceofsquares = square1 - square2;

		System.out.println("The square of " + number1 + " is " + square1);
        	System.out.println("The square of " + number2 + " is " + square2);
		System.out.printf("The sum of the two squares is %d\n ", sumOfsquares);
		System.out.printf("The difference of two squares is  %d\n ", differenceofsquares);

	}
}
