import java.util.Scanner;

public class DifferenceOfTwoNumbersMethod{

    public static int difference(int a, int b){

    int difference1 = a - b;

    return difference1;
           }

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first and second number: ");

    int numberA = input.nextInt();

    int numberB = input.nextInt();

    int differenceOfNUmbers = difference(numberA, numberB);

    System.out.println(differenceOfNUmbers);

    }

}




