import java.util.Scanner;
		
public class NegativeNumberChecker {
	public static void main(String[] args) {

		double total = 0;
		int numberCount = 0;


		System.out.println("Enter a number: (Enter a negative number to stop: )");
        	int number = input.nextInt();


		while(number >= 0){
			if(number > 0){

				total = total + number;
				numberCount++;

		}
		System.out.println("Enter a number: (Enter a negative number to stop: )");
        	number = input.nextInt();

		if (numberCount > 0){
			double average = total / numberCount;
			System.out.println("Average of Positive Numbers: %.2f ", average);

		} else {
			System,out.println("No positive numbers were entered.");

		}



		}
	}



		