import java.util.Scanner;

	public class SimultaneousEquation{

		public static void main(String[]args){

			
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the coefficient of x in the first equation: ");
		double firstCoefficientX = input.nextDouble();


		System.out.print("Enter the coefficient of y in the first equation: ");
		double firstCoefficientY = input.nextDouble();

		System.out.print("Enter the coefficient of x in the second equation: ");
		double secondCoefficientX = input.nextDouble();

		System.out.print("Enter the coefficient of y in the second equation: ");
		double secondCoefficientY = input.nextDouble();

		System.out.print("Enter the constant of the first equation: ");
		double constant1 = input.nextDouble();

		System.out.print("Enter the constant of the second equation: ");
		double constant2 = input.nextDouble();


		double answerOfFirstnumerator = (constant1 * secondCoefficientY) - (firstCoefficientY * constant2);
		double answerofFirstDenominator = (firstCoefficientX * secondCoefficientY) - (firstCoefficientY * secondCoefficientX);

		double answerOfSecondnumerator = (firstCoefficientX * constant2) - (constant1 * secondCoefficientX);
		double answerOfSecondDenominator = (firstCoefficientX * secondCoefficientY) - (firstCoefficientY * secondCoefficientX );

		double ValueofX = answerOfFirstnumerator/answerofFirstDenominator;
		
		double ValueofY = answerOfSecondnumerator / answerOfSecondDenominator;

		System.out.printf("The value of X is: %.2f ", ValueofX);
		
		System.out.printf("The value of Y is: %.2f%n", ValueofY);

		}
	}



		