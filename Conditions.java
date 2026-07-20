public class Conditions{
	public static void main(String[]args){

		int Grade = 75;

		if(Grade >= 80 && Grade <= 100){
			System.out.println("Excellent");
		}

		else if (Grade >= 60 && Grade <= 79){
			System.out.println("Very Good");
		}

		else if ( Grade >= 40 && Grade <= 59){
			System.out.println("Average Score");
		}

		else if (Grade < 40 && Grade >= 0){
			System.out.println("Fail");
		}


		System.out.printf("Your grade is:  %d ", Grade);


		}
	}
