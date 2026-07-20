import java.util.Scanner;

	public class StandardDeviation{
		public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double number1 = input.nextInt();

		System.out.print("Enter the second number: ");
		double number2 = input.nextDouble();

		System.out.print("Enter the third number: ");
		double number3 = input.nextDouble();

		System.out.print("Enter the fourth number: ");
		double number4 = input.nextDouble();

		System.out.print("Enter the fifth number: ");
		double number5 = input.nextDouble();

		System.out.print("Enter the sixth number: ");
		double number6 = input.nextDouble();

		System.out.print("Enter the seventh number: ");
		double number7 = input.nextDouble();

		System.out.print("Enter the eight number: ");
		double number8 = input.nextDouble();

		System.out.print("Enter the ninth number: ");
		double number9 = input.nextDouble();

		System.out.print("Enter the tenth number: ");
		double number10 = input.nextDouble();


		double Mean = (number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10)/10;

		double difference1 = number1 - Mean;
		double difference2 = number2 - Mean;
		double difference3 = number3 - Mean;
		double difference4 = number4 - Mean;
		double difference5 = number5 - Mean;
		double difference6 = number6 - Mean;
		double difference7 = number7 - Mean;
		double difference8 = number8 - Mean;
		double difference9 = number9 - Mean;
		double difference10 = number10 - Mean;

		double square1 = difference1 * difference1;
		double square2 = difference2 * difference2;
		double square3 = difference3 * difference3;
		double square4 = difference4 * difference4;
		double square5 = difference5 * difference5;
		double square6 = difference6 * difference6;
		double square7 = difference7 * difference7;
		double square8 = difference8 * difference8;
		double square9 = difference9 * difference9;
		double square10 = difference10 * difference10;

		double Variance = (square1 + square2 + square3 + square4 + square5 + square6 + square7 + square8 + square9 + square10) / 10;

		double StandardDeviation = 1.4142 * Variance;

		System.out.printf("The mean of the numbers inputed is: %.2f%n", Mean);

		System.out.printf ("The Variance of the numbers is: %.2f%n", Variance);

		System.out.printf("The Standard Deviation of the numbers: %.2f%n", StandardDeviation);

		}
	}
		
		
