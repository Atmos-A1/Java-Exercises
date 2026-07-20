import java.util.Scanner;

	public class FindLargest {
		public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		int largestNumber = 0;
		int counter = 1;


		while(counter <= 10){
			System.out.printf("Enter number: %d%n", counter);
			int number = input.nextInt();

		if (number > largestNumber) {
			largestNumber = number;

		}

			counter++;

		}

		System.out.printf("The largest number is %d%n", largestNumber);


			}
}