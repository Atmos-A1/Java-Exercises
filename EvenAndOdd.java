import java.util.Scanner;

	public class EvenAndOdd {
		public static void main (String[]args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int randomNumber = input.nextInt();

		if (randomNumber % 2 == 0){
			System.out.println("This number is an even number");
		}
		
		else{
			System.out.println("This is an odd number");
		
		}



		}
	}