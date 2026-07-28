public class Kata{
	public static boolean isEven(int a){
		if(a % 2 == 0){
			return true;
		}

		return false;
	}

	public static int subtract(int a, int b){

		int difference;

		if(b > a){
			difference = b - a;
		}
		else{
			difference = a - b;
		}
		return difference;
	}

	public static float divide(float a, float b){
		float quotient = a/b;

		if(b != 0){
			return quotient;
		}
		else{
			return 0;
			
		}
	}

	public static int square(int a){
		int number = a * a;

		return number;
	}

	public static boolean squareOf(int a){
		double number = Math.pow(a,0.5);

		double product = number * number;

		if(product == a){
			return true;
		}
		return false;
	}

}
