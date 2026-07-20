public class SumDivisibleByThree{
	public static void main(String[]args){

	int sum = 0;
	int i = 1;

	while(i <= 30){
		if(i % 3==0){
			sum = sum + i;
		}
	i++;
	}

	System.out.printf("The sum of numbers divisible by 3 between 1 and 30 is: %d", sum);

		}
	}

	