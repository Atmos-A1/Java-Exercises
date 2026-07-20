import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();
        
        int sum = number1 + number2 + number3;
        int average = sum / 3;  // 
        int product = number1 * number2 * number3;
        
        // Find smallest
        int smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        
        // Find largest
        int largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        
        System.out.println("*");
	System.out.println("***");
System.out.println("*****");
System.out.println("****");
System.out.println("**");

System.out.print(" * ");
System.out.print("***");
System.out.print("*****");
System.out.print("****");
System.out.println("**");



	System.out.printf(" ****%n ******%n*******%n ******%n ****%n");
    }
}