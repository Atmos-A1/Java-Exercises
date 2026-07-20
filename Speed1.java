import java.util.Scanner;


	public class Speed1{
		public static void main(String[]args){


		Scanner input = new Scanner(System.in);

		System.out.print("Enter distance in Kilometres: ");
		double Kilometres = input.nextDouble();


		System.out.print("Enter the number of hours: ");
		double Hours = input.nextDouble();

		System.out.print("Enter the number of minutes:");
		double Minutes = input.nextDouble();

		
		double totalHours = Hours + ((Minutes * 60) / 3600);

		double Speed = Kilometres/totalHours;


		System.out.printf("Your speed is: %.2f km/h", Speed);

		}
	}

			