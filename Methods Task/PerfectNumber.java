import java.util.Scanner;

public class PerfectNumber{

    public static boolean isPerfectNumber(int number){

    int sum = 0;

   

    for(int number1 = 1; number1 <= number / 2; number1++){

        if (number % number1 == 0){

        sum = sum + number1;

        }

    }
        if(number == sum){
            return true;

        }

    else {
            return false;
        }
        

    
    }




    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int numberIsPerfect = input.nextInt();

    

    System.out.println(isPerfectNumber(numberIsPerfectgi));
    }

}