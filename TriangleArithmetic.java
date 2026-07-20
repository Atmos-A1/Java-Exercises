import java.util.Scanner;

public class TriangleArithmetic{
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first side of the triangle: ");
		double firstSide = input.nextDouble();

		System.out.print("Enter the second side of the triangle: ");
		double secondSide = input.nextDouble();

		System.out.print("Enter the third side of the triangle: ");
		double thirdSide = input.nextDouble();

		System.out.print("Enter the height of the triangle: ");
		double height = input.nextDouble();


		double area = (0.5 * (thirdSide)) * height;
		double Perimeter = firstSide + secondSide + thirdSide;


		System.out.printf("The area of the triangle is: %.2f ", area);

		System.out.printf("The Perimeter of the triangle is: %.2f%n", Perimeter);

		}
	}
		
		
		
		
		