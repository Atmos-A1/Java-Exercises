import java.util.Scanner;

public class EqualityMethod{

    public static boolean numberEquality(int a, int b){
    
    boolean equality = true;

    if(a == b){
        return equality = true;
    }

    else{
        return equality = false;        
        }

     }

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter two numbers: ");

    int number1 = input.nextInt();
    
    int number2 = input.nextInt();

    boolean compareNumbers = numberEquality(number1, number2);

    System.out.println(compareNumbers);

       }
    
}
