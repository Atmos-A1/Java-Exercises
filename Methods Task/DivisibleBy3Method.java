import java.util.Scanner;

public class DivisibleBy3Method{

    public static boolean divide3(int number){

    if (number % 3 == 0){
         return true;
        }

    else {
        return false;
        }

       
    }


    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number1 = input.nextInt();

    boolean divideBy3 = divide3(number1);

    System.out.println(divideBy3);

        }
    

    }
