import java.util.Scanner;

public class SmallestNumberMethod{

    public static int smallestNumber(int a, int b){

    int smallest = a;

    if(smallest < b){
        smallest = a;
    }
    else{
        smallest = b;
    }

    return smallest;
    }

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first and second number: ");

    int number1 = input.nextInt();

    int number2 = input.nextInt();

    int smallest1 = smallestNumber(number1, number2);

    System.out.printf("The smallest number is: %d%n", smallest1);

     }

    }
