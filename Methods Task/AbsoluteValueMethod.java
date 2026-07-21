import java.util.Scanner;

public class AbsoluteValueMethod{

public static int absoluteValue(int number){

        int absoluteValue;

        if (number > 0){
            absoluteValue = number;
            return absoluteValue;
        }

        else{
            absoluteValue = number * -1;

            return absoluteValue;

            }
}

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number1 = input.nextInt();

        int numberAbsolute = absoluteValue(number1);

        System.out.println(numberAbsolute);
    }



}
