/*IMPORT Scanner

	Initialize number = 1
	Initialize largest = 0;
	
	
	While number <= 5
	GET 5 Inputs from User
	Store UserInput
	
	If UserInput > largest
		largest = UserInput

	increment by 1

	End

*/



import java.util.Scanner;

	public class LargestNumber{
		public static void main(String[]args){

	Scanner input = new Scanner(System.in);	
	

	int number = 1;
	int largest = 0;


	while(number <= 5){
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();

	if(userInput > largest){
		largest = userInput;
	}

	number++;
	}
	System.out.print("The largest number is: " + largest);

		}

	}





















		