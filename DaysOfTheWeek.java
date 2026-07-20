import java.util.Scanner;

public class DaysOfTheWeek{
	public static void main(String[]args){

	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int UserInput = input.nextInt();	

	int number = 1;

	int Monday = 1;
	int Tuesday = 2;
	int Wednesday = 3;
	int Thursday = 4;
	int Friday = 5;
	int Saturday = 6;
	int Sunday = 0;


	

		if(UserInput % 7 == 1){
			System.out.print("The Day is Monday");
		}

		if(UserInput % 7 == 2){
			System.out.print("The Day would be Tuesday");

		}
		
		if(UserInput % 7 == 3){
			System.out.print("The Day would be Wednesday");
		}


		if(UserInput % 7 == 4){
			System.out.print("The Day would be Thursday");
		}

		if(UserInput % 7 == 5){
			System.out.print("The Day would be Friday");
		}
		
		if(UserInput % 7 == 6){
			System.out.print("The Day would be Saturday");
		}
		
		if(UserInput % 7 == 0){
			System.out.print("The Day would be Sunday");
		}

		}
	}

	



