import java.util.Scanner;

public class Question1{
	public static void main (String[]args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: "); 
		int num1 = input.nextInt();

		System.out.println("Enter Second Number: ");
		int num2 = input.nextInt();

		int cube1 = num1 * num1 * num1;
		int cube2 = num2 * num2 * num2;

		int product = cube1 * cube2;
		
		int largercube;
		int smallercube;

		largercube = cube1;
		smallercube = cube2;

		if (cube2 > cube1){
			largercube = cube2;
			smallercube = cube1;
			}

		int division = largercube % smallercube;

		System.out.printf("Cube of %d is: %d%n", num1 , cube1);
		System.out.printf("Cube of %d is: %d%n", num2 , cube2);
		System.out.printf("The product of the cubes is: %d%n", product);
		System.out.printf("The division of the two cubes is: " , division );

		}
}



		