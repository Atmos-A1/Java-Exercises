import java.util.Scanner;

	public class Rectangle1 {
		public static void main (String[]args){

			Scanner input = new Scanner(System.in);


			System.out.println("Enter the length of the rectangle: ");
			int Length = input.nextInt();

			System.out.println("Enter the width of the rectangle: ");
			int Width = input.nextInt();


			int AreaOfRectangle = Length * Width;

			int PerimeterOfRectangle = 2 * (Length * Width);

			double LengthOfDiagonal = 1.41421 * ((Length * Length) * (Width * Width));


			System.out.printf("The area of the Rectangle is %d%n " , AreaOfRectangle);

			System.out.printf("The Perimeter of the Rectangle is %d%n " , PerimeterOfRectangle);

			System.out.printf("The Length of the Diagonal is %.2f%n ", LengthOfDiagonal);


			}
	}
			

