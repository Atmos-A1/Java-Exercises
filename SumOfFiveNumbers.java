import java.util.Scanner;


	public class SumOfFiveNumbers{
		public static void main(String[]args){


		Scanner input = new Scanner(System.in);

		int number = 1;
		int total = 0;
	
		while(number <= 5){

			System.out.print("Enter a number: ");
			int userNumber = input.nextInt();

			total = total + userNumber;
			number++;
		}
		System.out.print("The total of the numbers inputed is: " + total);

	}

}
			
		
		