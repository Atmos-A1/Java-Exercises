import java.util.Scanner;

public class Question6 {
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter an Integer: ");
	int number1 = input.nextInt();

	if (number1 % 7 == 0) {
	System.out.println("It is divisible by seven");
	}

	if (number1 % 7 != 0){
	System.out.println("It isn't divisible by seven");
	}

		}
	}