
	import org.junit.jupiter.api.Test;

	import static org.junit.jupiter.api.Assertions.*;

public class LogisticsTest{

	@Test 

	public void testIfPaymentIsCorrectWhenPercentOfDeliveriesMadeIsLessThan50(){

		double result = Logistics.calculateCommissionOnPackageDelivered(40, 100);

		double actual = 11400.0;

		assertEquals(result, actual);
	}

	@Test 

	public void testIfPaymentIsCorrectWhenPercentOfDeliveriesMadeIsMoreThan50andLessThan60(){

		double result = Logistics.calculateCommissionOnPackageDelivered(52, 100);

		double actual = 15400.0;

		assertEquals(result, actual);
	}

	@Test 

	public void testIfPaymentIsCorrectWhenPercentOfDeliveriesMadeIs60OrMoreButLessThan70(){

		double result = Logistics.calculateCommissionOnPackageDelivered(69, 100);

		double actual = 22250.0;

		assertEquals(result, actual);
	}

	@Test 

	public void testIfPaymentIsCorrectWhenPercentOfDeliveriesMadeIs70PercentOrMore(){

		double result = Logistics.calculateCommissionOnPackageDelivered(70, 100);

		double actual = 40000.0;
		
		assertEquals(result, actual);
	}


}
