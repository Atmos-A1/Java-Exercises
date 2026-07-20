import java.util.Scanner;

	public class SeperateIntegers1 {
    		public static void main(String[] args) {
        		Scanner input = new Scanner(System.in);

        		System.out.print("Enter a 4 digit number: ");
        		int number1 = input.nextInt();

        		int digit1 = number1 % 10;
        		int number2 = number1 / 10;

       		 	int digit2 = number2 % 10;
        		int number3 = number2 / 10;

        		int digit3 = number3 % 10;
        		int number4 = number3 / 10;

                	int digit4 = number4 % 10;

        		System.out.printf("%d   %d   %d   %d   %d%n", digit4, digit3, digit2, digit1);
    }
}