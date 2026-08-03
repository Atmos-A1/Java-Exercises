public class PizzaWahala{

	public static int getNumberOfSlicesPerBox(String nameOfPizzaBox){

		int slicesPerBox = 0;

		switch(nameOfPizzaBox){

		case "Sapa size":

			slicesPerBox = 4;

			break;

		case "Small Money":

			slicesPerBox = 6;

			break;

		case "Big boys":

			slicesPerBox = 8;

			break;

		case "Odogwu":

			slicesPerBox = 12;

			break;

		default:

			System.out.println("Enter a correct name: ");

			break;

		}

	return slicesPerBox;
	}

	public static int getPriceOfBox(String nameOfPizzaBox){

		int priceOfBox = 0;

		switch(nameOfPizzaBox){

		case "Sapa size":

			priceOfBox = 2500;

			break;

		case "Small Money":

			priceOfBox = 2900;

			break;

		case "Big boys":

			priceOfBox = 4000;

			break;

		case "Odogwu":

			priceOfBox = 5200;

			break;

		default:

			System.out.println("Invalid Input");	

		}

		return priceOfBox;
	}


	public static int calculateNumberOfBoxes(int numberOfPeople, int numberOfSlicesInPizzaBox){

		int numberOfBoxes = 0;

		int remainingSlices = numberOfPeople % numberOfSlicesInPizzaBox;

		if(remainingSlices != 0){

			numberOfBoxes = numberOfPeople / numberOfSlicesInPizzaBox + 1;
		}

		else{

			numberOfBoxes = numberOfPeople / numberOfSlicesInPizzaBox;
		}

		return numberOfBoxes;
	}

	public static int calculatePriceOfAllBoxes(int numberOfPeople, int numberOfSlicesInPizzaBox){

		int priceOfBoxes = 0;

		int numberOfBoxes = calculateNumberOfBoxes(numberOfPeople, numberOfSlicesInPizzaBox);

		if(numberOfSlicesInPizzaBox == 4){

			priceOfBoxes = numberOfBoxes * 2500;

		}

		else if (numberOfSlicesInPizzaBox == 6) {

			priceOfBoxes = numberOfBoxes * 2900;
			
		}

		else if(numberOfSlicesInPizzaBox == 8){

			priceOfBoxes = numberOfBoxes * 4000;

		}

		else if(numberOfSlicesInPizzaBox == 12){

			priceOfBoxes = numberOfBoxes * 5200;
		}

		else{

			System.out.println("Enter a valid number between 4,6,8,12");

		}

		return priceOfBoxes;
	}
}