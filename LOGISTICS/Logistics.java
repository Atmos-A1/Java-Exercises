public class Logistics{

	public static double calculateCommissionOnPackageDelivered(double numberOfDeliveriesMade, double numberOfDeliveriesToBeMade){

		double commissionRate = numberOfDeliveriesMade / numberOfDeliveriesToBeMade * 100;

		double commissionPay = 0;

		double BASEPAY = 5000;

		if(commissionRate < 50){


			commissionPay = numberOfDeliveriesMade * 160 + BASEPAY;

		}

		else if(commissionRate >= 50 && commissionRate <= 59){


			commissionPay = numberOfDeliveriesMade * 200 + BASEPAY;

		}

		else if(commissionRate >= 60 && commissionRate <= 69){


			commissionPay = numberOfDeliveriesMade * 250 + BASEPAY;

		}

		else{

			commissionPay = numberOfDeliveriesMade * 500 + BASEPAY;

		}


		return commissionPay;

	}

}