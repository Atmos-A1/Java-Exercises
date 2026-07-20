import java.util.Scanner;

public class FahrenheitConverter {
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the degree in Celsius: ");
	double Celsius = input.nextDouble();

	

	double Fahrenheit = (Celsius * (1.8)) + 32;
	
	System.out.printf("The temperature in Fahrenheit is: %.2f ", Fahrenheit);

		}
	}
	

	

	