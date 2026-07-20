import java.util.Scanner;

		public class CircleArithmetic{
			public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius of the circle: ");
		double Radius = input.nextDouble();


		double PI = 3.14;

		double area = PI * (Radius * Radius);

		double perimeter = 2 * PI * Radius;



		System.out.printf("The Perimeter of your circle is: %.2f%n", perimeter);
		System.out.printf("The area of your circle is: %.2f%n", area);


			}
		}