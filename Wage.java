import java.util.Scanner;

	public class Wage{
		public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of hours worked: ");
		double hours = input.nextDouble();

		System.out.print("Enter the hourly rate: ");
		double hourlyRate = input.nextDouble();

		System.out.print("Enter the bonus: ");
		double bonus = input.nextDouble();

		System.out.print("Enter the tax rate: ");
		double taxRate = input.nextDouble();

		double GrossPay = (hours * hourlyRate) + bonus;

		double taxAmount = (taxRate / 100) * GrossPay;

		double NetPay = GrossPay - taxAmount;


		System.out.printf("Your gross pay is: %.2f%n" , GrossPay);
		System.out.printf("Your taxable amount removed is: %.2f%n", taxAmount);
		System.out.printf("Your NetPay is: %.2f%n", NetPay);

		}
	}
