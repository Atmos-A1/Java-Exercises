import java.util.Scanner;

public class SmallestWhileTutor{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

		int smallest = 0;
		System.out.print("Enter your integer: ");
		int number = input.nextInt();

		smallest = number;
		int counter = 0;

		while(counter < 9){
			System.out.print("Enter Integer: ");
		
			number = input.nextInt();
		
				if(number < smallest){
				smallest = number;
			}

			counter++;
		}

		System.out.printf("The largest number is %d%n", smallest);

	}
}
