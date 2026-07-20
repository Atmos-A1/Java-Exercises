/*Pseudocode
Collect input from the user stating the user should enter a number between 0 and 1000
After this, you then initialize the numbers and set them at zero
If number >= 0 and <= 1000, split the number into 4 parts
To store the number,
divide the number by 10 with the remainder operator. Do this 4 times. 
Then add the 4 digits together
Print the output*/


import java.util.Scanner;
	
	public class SumOfIntegers{
		public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer between 0 and 1000: ");
		int initialNumber = input.nextInt();


		int digit1 = 0; 
		int digit2 = 0; 
		int digit3 = 0; 
		int digit4 = 0;


		if(initialNumber >= 0 && initialNumber <= 1000){
			digit1 = initialNumber % 10;
			int number2 = initialNumber / 10;

			digit2 = number2 % 10;
			int number3 = number2/10;

			digit3 = number3 %10;
			int number4 = number3/ 10;

			digit4 = number4 % 10;
		}
		else{
			System.out.print("Enter a number between 0 and 1000");
		
			return;
		}

	


		int IntegerSum = digit4 + digit3 + digit2 +digit1;

		System.out.printf("The sum of the digits of the number inputed is: %d", IntegerSum);


		}
	}
			