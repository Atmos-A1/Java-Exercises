import java.util.Scanner;

public class ForTutor{
	public static void main(String[]args){
		

	Scanner input = new Scanner(System.in);

	int largest = 0;
		
	System.out.print("Enter Integer: ");
	int number = input.nextInt();
	largest = number;

	for(int counter = 0; counter < 9; counter++){
		System.out.print("Enter Integer: ");
		number = input.nextInt();

			if(number > largest){
				largest = number;
			}
	}
		System.out.printf("The largest number is: ", largest);
	}
}