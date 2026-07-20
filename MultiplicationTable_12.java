public class MultiplicationTable_12{
	public static void main(String[]args){


		
		int constant = 12;
		int number = 0;
		int multiple = 0;

		while(number <12){
			number++;
			multiple = constant * number;
			

		
			System.out.printf("The multiplication of %d and %d is %d%n", constant, number, multiple);
		}
		
	}
}