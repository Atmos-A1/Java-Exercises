import java.util.Scanner;

public class Division {
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter an Integer: ");
	int number1 = input.nextInt();

	if (number1 % 3 == 0) {
	System.out.println("It is divisible by three");
	}

	if (number1 % 3 != 0){
	System.out.println("It isn't divisible by zero");
	}

		}
	}