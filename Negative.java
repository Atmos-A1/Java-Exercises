import java.util.Scanner;

	public class Negative {
    	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negativeNumbers = 0;
        int positiveNumbers = 0;
        int zeros = 0;

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        System.out.print("Enter fourth number: ");
        int number4 = input.nextInt();

        System.out.print("Enter fifth number: ");
        int number5 = input.nextInt();

        if (number1 < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (number1 > 0) {
            positiveNumbers = positiveNumbers + 1;
        }
        if (number1 == 0) {
            zeros = zeros + 1;
        }

        if (number2 < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (number2 > 0) {
            positiveNumbers = positiveNumbers + 1;
        }
        if (number2 == 0) {
            zeros = zeros + 1;
        }

        if (number3 < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (number3 > 0) {
            positiveNumbers = positiveNumbers + 1;
        }
        if (number3 == 0) {
            zeros = zeros + 1;
        }

        if (number4 < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (number4 > 0) {
            positiveNumbers = positiveNumbers + 1;
        }
        if (number4 == 0) {
            zeros = zeros + 1;
        }

        if (number5 < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (number5 > 0) {
            positiveNumbers = positiveNumbers + 1;
        }
        if (number5 == 0) {
            zeros = zeros + 1;
        }

        System.out.printf("Negative numbers: %d%n", negativeNumbers);
        System.out.printf("Positive numbers: %d%n", positiveNumbers);
        System.out.printf("Zeros: %d%n", zeros);
    }
}