import java.util.Scanner;

	public class Name {
		public static void main (String[]args){
			

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = input.next();

		System.out.print("Enter your second name: ");
		String secondName = input.next();

		System.out.printf("Hello, %s %s%n ", firstName, secondName);
		}
	}