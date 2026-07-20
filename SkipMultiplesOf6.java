/*SET Number = 1

	while number less than or equal to 100
		If number divisible by 6 is not zero

			Print number

*/

public class SkipMultiplesOf6{

	public static void main(String[]args){

	int number = 1;

	while(number <= 100){
	
		if(number % 6 != 0){
			System.out.print(number);

		}

		number++;
	}

	}
}
	

	