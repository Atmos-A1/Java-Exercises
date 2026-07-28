public class ArrayKata{
	public static int maximumIn(int[] numbers){

		int largest = numbers[0];

		for(int number = 1; number <= 4; number++){

			if(numbers[number] > largest){
				largest = numbers[number];
			}

		}

		return largest;
	}


	public static int minimumIn(int[] numbers){

		int smallest = numbers[0];

		for(int number = 1; number <= 4; number++){

			if(numbers[number] < smallest){
				smallest = numbers[number];
			}
		}
		return smallest;
	}

	public static int sumOf(int[] numbers){

		int sum = 0;

		for(int number = 0; number <= 4; number++){
			sum = sum + numbers[number];
		}

		return sum;
	}

	public static int sumOfEvenNumbersIn(int[] numbers){

		int evenSum = 0;

		for(int number = 0; number <= 4; number++){
			if(numbers[number] % 2 == 0){
				evenSum = evenSum + numbers[number];
			}
		}

		return evenSum;
	}

	public static int sumOfOddNumbersIn(int[] numbers){

		int oddSum = 0;

		for(int number = 0; number <= 4; number++){
			if(numbers[number] % 2 != 0){
				oddSum = oddSum + numbers[number];
			}
		}

		return oddSum;
	}


	public static int[] maximumAndMinimumOf(int[] numbers){
		int[] maxMin = new int[2];

		maxMin[0] = maximumIn(numbers);

		maxMin[1] = minimumIn(numbers);

		return maxMin;
	}

	public static int noOfOddNumbersIn(int[] numbers){
		int oddNo = 0;

		for(int number = 0; number <= 4; number++){
			if(numbers[number] % 2 != 0){
				oddNo = oddNo + 1;
			}
		}

		return oddNo;
	}

	public static int noOfEvenNumbersIn(int[] numbers){
		int evenNo = 0;

		for(int number = 0; number <= 4; number++){
			if(numbers[number] % 2 == 0){
				evenNo = evenNo + 1;
			}
		}

		return evenNo;
	}

	
}