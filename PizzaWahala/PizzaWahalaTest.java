
	import org.junit.jupiter.api.Test;

	import static org.junit.jupiter.api.Assertions.*;


public class PizzaWahalaTest{

	@Test

	public void testThatNameWillGiveYouAmountOfSlicesInBox() {

    int result = PizzaWahala.getNumberOfSlicesPerBox("Odogwu");

    int expected = 12;

    assertEquals(expected, result);
	}

	@Test

	public void testThatIfNameOfBoxIsInputedThePriceWillBeShown(){

		int result = PizzaWahala.getPriceOfBox("Odogwu");

		int expected = 5200;

		assertEquals(expected, result);
	}

	@Test

	public void testThatIfNumberOfPeopleEatingWithTypeOfBox_NumberOfBoxWouldBeCalculated(){

		int result = PizzaWahala.calculateNumberOfBoxes(45, 12);

		int expected = 4;

		assertEquals(expected, result);
	}

	@Test

	public void testThatIfNumberOfPeopleAndSlicePerBoxIsGiven_PriceOfBoxWillBeGenerated(){

		int result = PizzaWahala.calculatePriceOfAllBoxes(45,12);

		int expected = 20800;

		assertEquals(expected, result);
	}

	

}