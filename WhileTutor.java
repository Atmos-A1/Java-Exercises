import java.util.Scanner;

public class WhileTutor{
	public static void main(String[]args){
		

	Scanner input = new Scanner(System.in);

	int largest = 0;
		
	System.out.print("Enter Integer: ");
	int number = input.nextInt();
	largest = number;

	int counter = 0;

	while(counter < 9){
		System.out.print("Enter Integer: ");
		number = input.nextInt();

	if(number > largest){
		largest = number;
		}
	counter++;
	}
		System.out.printf("The largest number is: %d%n", largest);
		}

	}
	