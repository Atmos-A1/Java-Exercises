public class Divisible_by_3_and_5{
	public static void main(String[]args){

	for(int number = 1; number <= 1000000000; number++){
		if(number % 3 == 0 && number % 5 == 0){
			System.out.printf("The numbers divisible by 3 and 5 between 1 and 1 billion are:  %d ", number);
		}
	}

		}
}