import java.util.Scanner;

	public class Average {
		public static void main (String[]args){
			

		Scanner input = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int FirstNumber = input.nextInt();

		System.out.println("Enter Second Number: ");
		int SecondNumber = input.nextInt();

		System.out.println("Enter Third Number: ");
		int ThirdNumber = input.nextInt();

		int Total = FirstNumber + SecondNumber + ThirdNumber ;
		int Average = (Total)/3;

		System.out.println("The average of the 3 numbers is: " + Average);
		
		System.out.println("The total of the 3 numbers is: " + Total);

			}
	}
		
