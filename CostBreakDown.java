import java.util.Scanner;
	
		public class CostBreakDown{
			public static void main (String[]args){

				Scanner input = new Scanner (System.in);


				System.out.println("Enter your destination: ");
				String userDestination = input.next();
				
				System.out.println("Enter your number of friends accompanying you on the journey: ");
				double numberOfFriends = input.nextDouble();

				System.out.println("Enter the distance: ");
				double totalDistance = input.nextInt();


				System.out.println("Enter the price of Fuel: ");
				double priceOfFuel = input.nextInt();

				System.out.println("Enter the mileage of your car: ");
				double mileageOfcar = input.nextInt();

				

				double fuelNeeded = totalDistance/mileageOfcar;


				double totalCost = fuelNeeded * priceOfFuel;

				double SplitCost = totalCost / numberOfFriends;


				System.out.printf(" Your destination is %s%n ", userDestination);
				

				System.out.printf(" The amount of fuel needed to go to %s is %.2f%n litres", userDestination, fuelNeeded);
				

				System.out.printf("The total cost of your journey is %.2f naira. ", totalCost);

				
				System.out.printf("The Split cost of the journey to %s is %.2f naira if shared equally amonst your %.2f friends", userDestination, SplitCost, numberOfFriends);


					}
		}
					


				