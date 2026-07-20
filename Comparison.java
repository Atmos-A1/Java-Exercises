import java.util.Scanner;

public class Comparison{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter First Integer: ");
	int number = input.nextInt();


	int square = number * number;
	
	System.out.printf("Number: %d%n", number);
        System.out.printf("Square: %d%n", square);

	if (number > 100) {
            System.out.printf("%d is greater than 100%n", number);
        }
        if (number == 100) {
            System.out.printf("%d is equal to 100%n", number);
        }
        if (number != 100) {
            System.out.printf("%d is not equal to 100%n", number);
        }
        if (number < 100) {
            System.out.printf("%d is less than 100%n", number);
        }

	if (square > 100) {
            System.out.printf("%d is greater than 100%n", square);
        }
        if (square == 100) {
            System.out.printf("%d is equal to 100%n", square);
        }
        if (square != 100) {
            System.out.printf("%d is not equal to 100%n", square);
        }
        if (square < 100) {
            System.out.printf("%d is less than 100%n", square);
	}
}
}
