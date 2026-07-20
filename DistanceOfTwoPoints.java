/*Collect inputs from the user for x1, x2, y1 and y2
Create a variable that stores the square of x2 - x1 and a different variable that stores square of y2 - y1
Add the different squares together and store in a variable.
Use the Math.pow method to square root the sum of the squares.
Return that value for the user.*/


import java.util.Scanner;
	public class DistanceOfTwoPoints{
		public static void main(String[]args){

	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the values of x1, x2, y1 and y2: ");
	double x1 = input.nextDouble();
	double x2 = input.nextDouble();
	double y1 = input.nextDouble();
	double y2 = input.nextDouble();


	double SquareOfX = (x2 - x1) * (x2 - x1);
	double SquareOfY = (y2 -y1) * (y2 - y1);

	double SumOfSquares = SquareOfX + SquareOfY;
	
	double SquareRootOfSum = Math.pow(SumOfSquares, 0.5);

	System.out.printf("The distance between the two points is %.2f ", SquareRootOfSum);

		}
	}
	
