import java.util.Scanner;

public class Question3{
	public static void main (String[]args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: "); 
		int num1 = input.nextInt();

		System.out.println("Enter Second Number: ");
		int num2 = input.nextInt();

		System.out.println("Enter Third Number: ");
		int num3 = input.nextInt();

		System.out.println("Enter Fourth Number: ");
		int num4 = input.nextInt();

		int sumOfNumbers = num1 + num2 + num3 + num4;

		int averageOfNumbers = sumOfNumbers/4;

		int productOfNumbers = num1 * num2 * num3 * num4;


		int largest = num1;
		

		if (num2 > largest){
			System.out.printf(" %d is the largest number ", num2);
		}

		if (num3 > largest){
			System.out.printf(" %d is the largest number ", num3);
		}

		if (num4 > largest){
			System.out.printf(" %d is the largest number ", num4);
			}

		int smallest = num1;

		if (num2 < smallest){
			System.out.printf(" %d is the smallest number ", num2);
		}

		if (num3 < smallest){
			System.out.printf(" %d is the smallest number ", num3);
		}

		if (num4 < smallest){
			System.out.printf(" %d is the smallest number ", num4);
			}



		System.out.printf("The sum of the numbers are %d%n ", sumOfNumbers);
		System.out.printf("The average of the numbers are %d%n ", averageOfNumbers);
		System.out.printf("The product of the numbers are %d%n ", productOfNumbers);

		}
	}

		