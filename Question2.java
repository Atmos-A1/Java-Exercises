import java.util.Scanner;

public class Question2{
	public static void main (String[]args){

		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter first number: "); 
		int num1 = input.nextInt();
		
		int comp = 500;
		int cube1 = num1 * num1 * num1;

		if (num1 > comp){
			System.out.printf("%d is greater than %d%n", num1, comp);
		}

		if (num1 < comp){
			System.out.printf("%d is less than %d%n", num1, comp);
			}

		if (num1 == comp){
			System.out.printf("%d is equal to %d%n", num1, comp);
			}

		if (cube1 == comp){
			System.out.printf("%d is equal to %d%n", cube1, comp);
		}

		if (cube1 > comp){
			System.out.printf(" %d is greater than %d%n", cube1, comp);
			}

		if (cube1 < comp){
			System.out.printf("%d is less than %d%n", cube1, comp);
			}

		}
	}


		
