import java.util.Scanner;

	public class NextYear{
		public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your current age: ");
		int currentAge = input.nextInt();

		int newAge = currentAge + 1;
		System.out.printf("You will be %d next year " , newAge);


		}
	}