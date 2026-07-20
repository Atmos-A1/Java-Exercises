import java.util.Scanner;

	public class SimpleInterest1{
		public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Principal Amount: ");
		double principalAmount = input.nextDouble();

		System.out.println("Enter the Rate: ");
		double Rate = input.nextDouble();

		System.out.println("Enter the Time: ");
		int Time = input.nextInt();

		double SimpleInterest = (principalAmount * Rate * Time)/100 ;
		double TotalAmount = SimpleInterest + principalAmount;

		System.out.printf("The Simple Interest is : %.2f%n " , SimpleInterest);
		System.out.printf("The total Amount is: %.2f%n", TotalAmount);

		}
	}

		


		

		