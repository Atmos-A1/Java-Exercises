public class SpeedinMiles {
	public static void main(String[]args){

		double distanceInKilometres = 14.0;
		
		double TimeInHours = 0.76;
		
		double distanceInMiles = distanceInKilometres * 1.6;

		double Speed = distanceInMiles/TimeInHours;

		System.out.println(distanceInMiles);

		System.out.printf("The Speed of the runner is: %.2f mph", Speed);

		}
	}


