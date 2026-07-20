public class WhileSumNumbers1_50{
	public static void main(String[]args){


		int number = 1;
		int total = 0;

		while(number <= 50){
			total = total + number;
			
			System.out.print(total + " ");
		number++;
		}
	}
}