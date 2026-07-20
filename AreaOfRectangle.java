import java.util.Scanner;

	public class AreaOfRectangle{
		public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length: ");
		int Length = input.nextInt();

		System.out.println("Enter the Width: ");
		int Width = input.nextInt();

		int Area = 2 * (Length + Width);
		
		System.out.printf("The Area of the Rectangle is: %d ", Area);

		

		}
	}