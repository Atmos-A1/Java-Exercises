import java.util.Scanner;

	public class ElectricityTariff{
		public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of units used in kwh: ");
		double unitsUsed = input.nextDouble();

		System.out.print("Enter the cost of unit per kwh: ");
		double costPerUnit = input.nextDouble();

		double totalCost = unitsUsed * costPerUnit;
		
		System.out.printf("The cost of your electricity is: %.2f naira", totalCost);
		}
	}