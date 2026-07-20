import java.util.Scanner;

	public class SimpleInterest{
		public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Principal Amount: ");
		double principalAmount = input.nextDouble();

		System.out.println("Enter the Rate: ");
		double Rate = input.nextDouble();

		System.out.println("Enter the Time: ");
		int Time = input.nextInt();

		double SimpleInterest = (principalAmount * Rate * Time)/100 ;

		System.out.printf("The Simple Interest is : %.2f%n " , SimpleInterest);

		}
	}

		


		

		