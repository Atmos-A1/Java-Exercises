import java.util.Scanner;

public class RemainderMethod{

    public static int remainder(int a, int b){
    
    int remainder = a % b;

    return remainder;    
    }

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter two numbers: ");

    int number1 = input.nextInt();

    int number2 = input.nextInt();

    int remainder1 = remainder(number1, number2);

    System.out.println(remainder1);

    }


    }
