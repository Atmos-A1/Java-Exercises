import java.util.Scanner;

   public class SumTwoNumbersMethod{

    public static int sum(int a, int b){

    int sumOf2 = a + b;

    return sumOf2;

    }

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter two numbers: ");

    int number1 = input.nextInt();

    int number2 = input.nextInt();

    int sumOfTheNumbers = sum(number1, number2);

    System.out.println(sumOfTheNumbers);

    }



}
