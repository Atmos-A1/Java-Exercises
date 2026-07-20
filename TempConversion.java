import java.util.Scanner;

	public class TempConversion {
		public static void main(String[]args){
			

		Scanner input = new Scanner(System.in);

		System.out.println("Enter temperature in Kelvin: ");
		double KelvinTemp = input.nextDouble();


		double Celcius = KelvinTemp - 273;
		double Fahrenheit = ((KelvinTemp -273.15) * (9/5) + 32);


		System.out.printf("The temperature in Kelvin is: %.2f%n" , KelvinTemp);
		System.out.printf("The temperature in Celcius is: %.2f%n" , Celcius);
		System.out.printf("The temperature in Fahrenheit is: %.2f%n" , Fahrenheit);


		}
	}
		