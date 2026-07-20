 import java.util.Scanner;

public class Nokia3311{
	public static void main(String...args){

	Scanner inputCollector = new Scanner(System.in);


	String menuOptions = """

	Welcome NewUser to Nokia

	Press 1 for PhoneBook

	Press 2 for Messages

	Press 3 for Chat

	Press 4 for Call Register

	Press 5 for Tones

	Press 6 for Settings

	Press 7 for CallDivert

	Press 8 for Games

	Press 9 for Calculator

	Press 0 for Reminders

	Press * for Clock

	Press ** for Profiles

	Press # for SIM Services

""";

		System.out.println(menuOptions);

		String menuOptionsChoice = inputCollector.nextLine();
		 
		boolean insideMainMenuChoice = true;
		
		while(insideMainMenuChoice){

		switch(menuOptionsChoice){

		case "1" : System.out.println("PhoneBook"); 

		String phoneBookOptions =  """

	Press 1 for Search

	Press 2 for Service Numbers

	Press 3 to Add a Name

	Press 4 to Erase

	Press 5 to Edit

	Press 6 to Assign Tone

	Press 7 to Send a Business Card

	Press 8 for More Options

	Press 9 for Speed Dials

	Press 0 for Voice Tags

	Press a to go back

	""";

		System.out.println(phoneBookOptions);

		String phoneBookOptionsDirectory = inputCollector.nextLine();

		switch(phoneBookOptionsDirectory){

		case "1" : System.out.println("Search"); break;
	
		case "2" : System.out.println("Service Numbers"); break;

		case "3" : System.out.println("Add Name"); break;

		case "4" : System.out.println("Erase"); break;
		
		case "5" : System.out.println("Edit"); break;

		case "6" : System.out.println("Assign Tone"); break;

		case "7" : System.out.println("Send Business Card"); break;

		case "8" : System.out.println("Options"); 
		
			String optionsMenu = """


				Press 1 for Type of View

				Press 2 to Display Memory Status


				""";

					System.out.println(optionsMenu);

					String optionsDirectory = inputCollector.nextLine();

					switch(optionsDirectory) {

		case "1" : System.out.println("The Type of View is: 3 x 3 grid"); break;

		case "2" : System.out.println("The amout of Memory used is 350kb"); break;

		default: System.out.println("Press a valid Key"); break;

		}

		break;


		case "9" : System.out.println("Speed Dials"); break;

		case "0" : System.out.println("Voice Tags"); break;

		case "a" : 
			insideMainMenuChoice = false; 
				break;

		default: System.out.println("Press a valid Key"); break;


		}
		
			
		break;
				}	
			}
		}

	}