import java.util.Scanner;


	public class DateCalculator{
		public static void main(String[]args){


	int number = 1;
	String Day = "Sunday";
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	int userInput = input.nextInt();


	while(number >= 1){


		if(userInput % 7 == 2){
			Day = "Monday";
		}
		

		if(userInput  % 7 == 3){
			Day = "Tuesday";
		}
		

		if(userInput  % 7 == 4){
			Day = "Wednesday";
		}
		


		if(userInput  % 7 == 5){
			Day = "Thursday";
		}
		

		if(userInput  % 7 == 6){
			Day = "Friday";
		}
		
		
		if(userInput  % 7 == 1){
			Day = "Saturday";
		}		
		
	
		else {
			Day = "Sunday";
		}

		System.out.print("The Day of the week is " + Day);

		}		
		number++;
		}
	}
		
		
			
	