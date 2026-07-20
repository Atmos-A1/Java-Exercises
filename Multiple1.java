import java.util.Scanner;

public class Multipe1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int triple2 = number2 * number2 * number2;
        int double1 = number1 * number1;

        if (triple2 % double1 == 0) {
            System.out.printf("%d is a multiple of %d%n", triple2, double1);
        }

        if (triple2 % double1 != 0) {
            System.out.printf("%d is not a multiple of %d%n", triple2, double1);
        }
    }
}