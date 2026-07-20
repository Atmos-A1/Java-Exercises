import java.util.Scanner;

public class CircleCalculations{
    public static void main(String[] args) {

	Scanner input = new Scanner (System.in);

	System.out.println("Enter the Radius: ");
	int radius = input.nextInt();

	float pi = 3.1459f;
	double circumference = 2 * pi * radius;
	double area = pi * (radius * radius);
	int diameter = radius * 2;


	System.out.printf("The radius of the circle is %d. The Circumference, Area and Diameter are as follows: %f, %f, %d%n", radius, circumference, area, diameter);

	
	}
}