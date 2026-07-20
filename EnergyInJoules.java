/*Collect user input for amount of water in kilograms, the initial temperature and final temperature
Create a variable to store the formula for calculating the energy consumed.
Print the value for the user*/

import java.util.Scanner;
	public class EnergyInJoules{
		public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the weight in kilograms, initial temperature, final temperature: ");
	
	double WeightInKilograms = input.nextDouble();
	double initialTemperature = input.nextDouble();
	double finalTemperature = input.nextDouble();

	double Energy = WeightInKilograms * (finalTemperature - initialTemperature) * 4184;

	System.out.printf("The Energy needed to heat %.2f kg of water from %.2f Celcius to %.2f Celcius is %.2f joules", WeightInKilograms, initialTemperature, finalTemperature, Energy );


		}
	}