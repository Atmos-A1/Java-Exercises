import java.util.Scanner;

	public class UntilZeroIsInputed{
		public static void main(String[]args){


	Scanner input = new Scanner(System.in);


	int number = 1;

			while(number >= 1){

			System.out.print("Enter a number: ");
			int userNumber = input.nextInt();

				if (userNumber == 0){
				System.out.println("You have terminated the application");
				break;
				}

			}

		}
	}
	
	

