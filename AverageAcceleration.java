/*Collect inputs from user to store the initial velocity, final velocity and time in seconds
Create a variable that stores the calculation of the average velocity
Return the value inputed by the user.*/

import java.util.Scanner;
	public class AverageAcceleration{
		public static void main(String[]args){


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the values for the initial velocity, final velocity and time:  ");
		double initialVelocity = input.nextDouble();
		double finalVelocity = input.nextDouble();
		double time = input.nextDouble();


		double avgAcceleration = (finalVelocity - initialVelocity)/time;

		System.out.printf("The average acceleration is %.2f m/s ", avgAcceleration);


		}
	}