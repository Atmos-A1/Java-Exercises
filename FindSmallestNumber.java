import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

 	int smallestNumber = 0;

        System.out.print("Enter number: ");
        int number = input.nextInt();
	smallestNumber = number;


        int counter = 1;

        while (counter <= 9) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number < smallestNumber) {
                smallestNumber = number;
            }

            counter++;
        }

        System.out.printf("The smallest number is %d%n", smallestNumber);
       
    }
}