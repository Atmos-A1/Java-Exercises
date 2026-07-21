import java.util.Scanner; 

public class DecimalDivisionMethod{

        public static double decimaldiv(double a, double b){

            double divide = a / b;
        
            return divide;

        }


    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first and second number: ");

    int number1 = input.nextInt();

    int number2 = input.nextInt();

    double division = decimaldiv(number1, number2);

    System.out.println(division);
    
    }

    }
