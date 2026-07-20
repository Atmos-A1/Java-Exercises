import java.util.Scanner;

	public class BMI{
		public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in Kilograms: ");
		double Weight = input.nextDouble();

		System.out.print("Enter height in Metres: ");
		double Height = input.nextDouble();

		double BMI = Weight / (Height * Height);
		
		System.out.printf("Your BMI is : %.2f " , BMI);

		}
	}