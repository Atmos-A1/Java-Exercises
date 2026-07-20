/*IMPORT Scanner

	Initialize number = 1
	Initialize smallest = 0;
	
	
	While number <= 5
	GET 5 Inputs from User
	Store UserInput
	
	If UserInput < smallest
		largest = UserInput

	increment by 1

	End

*/



import java.util.Scanner;

	public class SmallestNumber{
		public static void main(String[]args){

	Scanner input = new Scanner(System.in);	
	

	System.out.print("Enter a number: ");
	int smallest = input.nextInt();
	
	int number = 1;


	while(number <= 4){
	
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();

		if(userInput < smallest){
			smallest = userInput;
		}
	number++;

	}
	System.out.print("This is the smallest number: " + smallest);


		}
	}

	
	
























		