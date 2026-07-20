/*Import Scanner
GET userPassword 	
SET number = 1
	WHILE Number >= 1
	Ask User for password
	Store in userTyped Password

		If userTypedPassword != userPassword
			Print Incorrect Password
		Else 
			Print CorrectPassword

*/



import java.util.Scanner;
	
	public class PasswordChecker{
		public static void main(String[]args){

			int number = 1;

			Scanner input = new Scanner(System.in);	
			
			System.out.println("Enter your password: ");
			String userPassword = input.next();

			
			while(number >= 1){
			
				System.out.println("Enter your password again for 2FA: ");
				String userTypedPassword = input.next();
			
					if (userPassword.equals(userTypedPassword)){
						System.out.print("Two factor authentication Successful!");
						break;
				}
				else{
					System.out.println("Two factor authentication failed, wait for 1 minute and try again");
					
				}
				
			}
			number++;
		}
	}
			