import java.util.Scanner;

public class LargestNumberMethod{

    public static int largestNumber(int a, int b){

    int largest = a;

    if(largest < b){
        largest = b;
    }
    else{
        largest = a;
    }

    return largest;
    }

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first and second number: ");

    int number1 = input.nextInt();

    int number2 = input.nextInt();

    int largest1 = largestNumber(number1, number2);

    System.out.println(largest1);

     }

    }
