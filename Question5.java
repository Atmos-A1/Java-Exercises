import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();

        System.out.println("Enter Third Number: ");
        int num3 = input.nextInt();

        System.out.println("Enter Fourth Number: ");
        int num4 = input.nextInt();

        System.out.println("Enter Fifth Number: ");
        int num5 = input.nextInt();

        System.out.println("Enter Sixth Number: ");
        int num6 = input.nextInt();

        int largest = num1;

        if (num2 > largest) {
            System.out.printf(" %d is the largest number ", num2);
        }
        if (num3 > largest) {
            System.out.printf(" %d is the largest number ", num3);
        }
        if (num4 > largest) {
            System.out.printf(" %d is the largest number ", num4);
        }
        if (num5 > largest) {
            System.out.printf(" %d is the largest number ", num5);
        }
        if (num6 > largest) {
            System.out.printf(" %d is the largest number ", num6);
        }

        int smallest = num1;

        if (num2 < smallest) {
            System.out.printf(" %d is the smallest number ", num2);
        }
        if (num3 < smallest) {
            System.out.printf(" %d is the smallest number ", num3);
        }
        if (num4 < smallest) {
            System.out.printf(" %d is the smallest number ", num4);
        }
        if (num5 < smallest) {
            System.out.printf(" %d is the smallest number ", num5);
        }
        if (num6 < smallest) {
            System.out.printf(" %d is the smallest number ", num6);
        }
    }
}