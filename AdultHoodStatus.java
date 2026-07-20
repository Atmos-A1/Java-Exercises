//START
//import Scanner
//GEt INPUT for the variables Name and Age
//If Age greater than equal to 18
//Print Name is an Adult
//Else Print She is a Child
//END

import java.util.Scanner;

public class AdultHoodStatus{
	public static void main(String[]args){


		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name and Age:");
		String Name = input.next();
		int Age = input.nextInt();

		if(Age >= 18){
			System.out.printf( " %s is an adult ", Name);
		}

		else{
			System.out.printf( " %s is a child ", Name);

		}

			}
		}


		