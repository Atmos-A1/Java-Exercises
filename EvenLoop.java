public class EvenLoop{
	public static void main(String[]args){

	int x = 1;
	int counter = 0;

	while ( x % 2 == 0 && x <= 100){
		System.out.println(x);
		x = x + 1;
	}
	counter++;

	System.out.println("These re the values that are even from 1 - 100");

		}
	}
	