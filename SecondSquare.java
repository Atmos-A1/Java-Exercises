import java.util.Scanner;

	public class SecondSquare {
		public static void main (String[]args){
			

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first number: ");
		int number1 = input.nextInt();

		int Cube = number1 * number1 * number1;
		int Square = number1 * number1;

		System.out.printf("The square of the number is: %d%n ", Square);
		System.out.printf("The cube of the number is:   %d%n ", Cube);
		


		}
	}