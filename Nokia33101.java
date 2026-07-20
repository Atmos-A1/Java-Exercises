import java.util.Scanner;

public class Nokia33101{
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

	Press 11 for Clock

	Press 12 for Profiles

	Press 13 for SIM Services

	Press 99 to exit Nokia

""";

		System.out.println(menuOptions);

		int menuOptionsChoice;

		do{

		menuOptionsChoice = inputCollector.nextInt();
		 
		switch(menuOptionsChoice){

		case 1 : System.out.println("PhoneBook"); 

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

	Press 99 to go back

	""";

		System.out.println(phoneBookOptions);

		int phoneBookOptionsDirectory;

		do{

		phoneBookOptionsDirectory = inputCollector.nextInt();

		switch(phoneBookOptionsDirectory){

		case 1 : System.out.println("Search"); break;
	
		case 2 : System.out.println("Service Numbers"); break;

		case 3 : System.out.println("Add Name"); break;

		case 4 : System.out.println("Erase"); break;
		
		case 5 : System.out.println("Edit"); break;

		case 6 : System.out.println("Assign Tone"); break;

		case 7 : System.out.println("Send Business Card"); break;

											case 8 : System.out.println("Options"); 
		
														String optionsMenu = """


														Press 1 for Type of View

														Press 2 to Display Memory Status

														Press 99 to Go Back

														""";

														System.out.println(optionsMenu);

														int optionsDirectory;
														
															do{

														optionsDirectory = inputCollector.nextInt();

														switch(optionsDirectory) {

															case 1 : System.out.println("The Type of View is: 3 x 3 grid"); break;

															case 2 : System.out.println("The amout of Memory used is 350kb"); break;

															case 99 : System.out.println("Going back"); break;

															default: System.out.println("Press a valid Key"); break;

															}

															break;

															} while (optionsDirectory != 99);


		case 9 : System.out.println("Speed Dials"); break;

		case 0 : System.out.println("Voice Tags"); break;

		case 99 : System.out.println("Go Back"); break;

		default: System.out.println("Press a valid Key"); break;

		}
		
		break;

		} while (phoneBookOptionsDirectory != 99);

		
		
		
		case 2 : System.out.println("Messages"); 

			String MessageMenu = """

	Press 1 for Write Messages

	Press 2 for Inbox

	Press 3 for Outbox

	Press 4 for Picture Messages 

	Press 5 for Templates

	Press 6 for Smileys

	Press 7 for Message Settings

	Press 8 for Information Services

	Press 9 for Voice MailBox number

	Press 0 for Service Command Editor

	Press 99 to Return to Main Menu

""";

		System.out.println(MessageMenu);

		int messageMenuDirectory;

		do{

		messageMenuDirectory = inputCollector.nextInt();

			switch(messageMenuDirectory){

				case 1 : System.out.println("Write Message"); break;

				case 2 :  System.out.println("Inbox");	break;

				case 3 :  System.out.println("Picture Messages"); break;

				case 4 :  System.out.println("Picture Messages"); break;

				case 5 :  System.out.println("Templates"); break;

				case 6 :   System.out.println("Smileys"); break;

				case 7 :  System.out.println("Message Settings"); 

					String MessageSettingsMenu = """

			Press 1 for the Set1 Menu

			Press 2 for Common Menu

			Press 99 to go back

	""";
					System.out.println(MessageSettingsMenu);

					int MessageSettingsMenuChoice;
	
					do{
	
					MessageSettingsMenuChoice = inputCollector.nextInt();

							switch(MessageSettingsMenuChoice){
							
							case 1: System.out.println("Set1 Menu");
								
								String Set1Menu = """
							
							Press 1 for  Message Center Number
					
							Press 2 for Message sent as
			
							Press 3 for Message Validity
		
							Press 99 to Go Back to Message Menu

							

				""";

												System.out.println(Set1Menu);
		
												int Set1MenuChoice;

												do{
					
												Set1MenuChoice = inputCollector.nextInt();

													switch(Set1MenuChoice){

														case 1 : System.out.println("Message Center number"); break;

														case 2 : System.out.println("Message"); break;

														case 3 :  System.out.println("Message Validity"); break;
		
														case 99 : System.out.println("Go back to message menu"); break;

														default: System.out.println("Press a valid Key"); break;

														}

														break;
			
														} while (Set1MenuChoice != 99);

				
					

					case 2 : System.out.println("Common Menu");

							String commonMenu = """

					Press 1 for Delivery Reports

					Press 2 for Reply via same centre

					Press 3 for Character Support

					Press 99 to go back

		""";

															System.out.println(commonMenu);

															int commonMenuChoice;

															do{
															commonMenuChoice = inputCollector.nextInt();
				
															switch(commonMenuChoice){

																case 1:  System.out.println("Delivery Reports"); break;
		
																case 2 : System.out.println("Reply via same Centre"); break;

																case 3:  System.out.println("Character Support"); break;

																case 99 : System.out.println("Going back"); break;

																default: System.out.println("Press a valid Key"); break;
																
																}
																break;													
																} while(commonMenuChoice != 99);

																

																

				
				case 99 : System.out.println("Going back"); break;

				default: System.out.println("Type in a valid number"); break;

				}
				break;

				}while(MessageSettingsMenuChoice != 99);
				
				break;												
					
				case 8 :  System.out.println("Info Service"); break;
			
				case 9:  System.out.println("Voice Mailbox Number"); break;

				case 0:  System.out.println("Service Command Editor"); break;

				case 99 : System.out.println("Go Back to the Main Menu"); break;

				default: System.out.println("Press a valid Key"); break;

				}

				break;

				} while(messageMenuDirectory != 99);

				break;

			
				
		case 3 : System.out.println("Chat"); break;


		case 4 : System.out.println("Call Register"); 

		String callRegisterMenu = """

		Press 1 for Missed calls 

		Press 2 for Received Calls

		Press 3 for Dialled Numbers
		
		Press 4 to Erase call Lists

		Press 5 to Show call Duration

		Press 6 to show call Costs

		Press 7 to Call cost Settings

		Press 8 for prepaid credit

		Press 9 to go back

		
	""";


			System.out.println(callRegisterMenu);

			int callRegisterMenuChoice;

			do{

			callRegisterMenuChoice = inputCollector.nextInt();

			switch(callRegisterMenuChoice){

			case 1: System.out.println("Missed Calls"); break;

			case 2 : System.out.println("Received Calls"); break;

			case 3 : System.out.println("Dialled Numbers"); break;

			case 4 : System.out.println("Erase Recent call lists"); break;

			case 5 : System.out.println("Show call duration"); 


				String CallDurationOptions = """

				Press 1 for Last Call Duration

				Press 2 For All Calls Duration

				Press 3 for Received Calls Duration

				Press 4 for Dialled Calls Duration

				Press 5 to Clear Timers

				press 9 to go back

		""";

			System.out.println(CallDurationOptions);

			int callDurationChoices;

			do{

			callDurationChoices = inputCollector.nextInt();

			 			switch(callDurationChoices){

						case 1: System.out.println("Your Last call was 300 seconds"); break;
			
						case 2 :  System.out.println("Your calls have been 200 hours long"); break;

						case 3:  System.out.println("The calls you've received are 4 hours long"); break;

						case 4 :  System.out.println("Dialled Calls Duration: 15 minutes, Try dey call people"); break;

						case 5: System.out.println("Clear all timers"); break;

						case 9: System.out.println("Going back"); break;

						default: System.out.print("Enter an actual number"); break;

						}
						
						break;

						} while(callDurationChoices != 9);
		

			case 6: System.out.println("Show call costs");


					String ShowCallCost = """


			Press 1 for Last call Costs

			Press 2 for All call Costs 

			Press 3 to Clear Counters

			Press 99 to go back to previous menu


""";


						System.out.println(ShowCallCost);

						int showCallCostOptions;

						do{

						showCallCostOptions = inputCollector.nextInt();

						
							switch(showCallCostOptions){

							case 1 : System.out.println("Your last call cost 700 naira"); break;

							case 2 : System.out.println("Ask your network provider"); break;

							case 3 : System.out.println("COUNTER CLEARED!!!"); break;
						
							case 99 : System.out.println("Going back to the previous menu");							

							default: System.out.println("Press a valid Key"); break;

							}

							break;

							} while(showCallCostOptions != 99);
			
							break;

			case 7: System.out.println("Call cost settings");

	
			String CallCost = """


			Press 1 for Call cost Limit

			Press 2 for Show costs

			Press 99 to go back

""";

					System.out.println(CallCost);

					int callCostOptions;

					do{				

					callCostOptions = inputCollector.nextInt();

						switch(callCostOptions){

							case 1: System.out.println("Set call cost limit at 2000 naira per month"); break;

							case 2: System.out.println("The cost is ### naira"); break;

							case 99 : System.out.println("Going back"); break;

							default: System.out.println("Press a valid Key"); break;

							}

							break;

							} while(callCostOptions != 99);

							break;

			case 8: System.out.println("Prepaid Credit");

			case 9: System.out.println("Going back to main menu"); break;

			default: System.out.println("Press a valid Key"); break;


							}
 							break;

							} while(callRegisterMenuChoice != 9);

							break;

	


         	case 5 : System.out.println("Tones");



		String ToneOptions = """

   		Press 1 for Ringing Tone

		Press 2 to Increase Ringing Volume

		Press 3 to activate Incoming Alerts

		Press 4 to Compose your ring tone

		Press 5 to Message Alert Tones

		Press 6 to activate KeyPad tones

		Press 7 to set Warning and Game tones

		Press 8 to set Vibrating alerts

		Press 9 to activate a screen saver
	
		Press 99 to go back


""";

		System.out.println(ToneOptions);

		int toneOptionsMenu;

		do{

		toneOptionsMenu = inputCollector.nextInt();


				switch(toneOptionsMenu){


				case 1  : System.out.println("Ring tone has been set to Sunshine"); break;

				case 2 : System.out.println("Ringing Volume has been increased"); break;

				case 3  : System.out.println("Incoming Alert"); break;

				case 4  : System.out.println("You have created your own ringtone"); break;

				case 5  : System.out.println("Message Alert Tone Created"); break;

				case 6  : System.out.println("Key tones have been set"); break;

				case 7 : System.out.println("Warning tones and game tones"); break;

				case 8 : System.out.println("Vibrating Alert"); break;

				case 9  : System.out.println("Screen Saver has been set"); break;

				case 99 : System.out.println("Go back"); break;

				default: System.out.println("Press a valid Key"); break;


							}

							break;

							} while (toneOptionsMenu != 99);

							break;


 		case 6 : System.out.println("Settings"); 


		String SettingsFolder = """

			Press 1 for Call Settings

			Press 2 for Phone Settings

			Press 3 for Security Settings

			Press 4 to Restore Factory Settings

			Press 5 to go back

	""";

			System.out.println(SettingsFolder);

			int SettingsFolderSubMenu;

			do{

			SettingsFolderSubMenu = inputCollector.nextInt();


					switch(SettingsFolderSubMenu){

					case 1: System.out.print("Call Settings");


						String callSettingsOptions = """

		Press 1 for Automatic Redial

		Press 2 for Speed Dialing

		Press 3 for Call Waiting Options

		Press 4 to see your own number 

		Press 5 to see which phone line is in Use

		Press 6  to see which one get an Automatic Answer

""";
		
			System.out.println(callSettingsOptions);

			int callSetOptionsSelection = inputCollector.nextInt();

							switch(callSetOptionsSelection){

							case 1 : System.out.println("Automatic Redial"); break;
		
							case 2 : System.out.println("Speed Dialing"); break;

							case 3: System.out.println("Print the call waiting options"); break;

							case 4 : System.out.println("Your number is 09023456173"); break;

							case 5 : System.out.println("Your MTN line is in use"); break;

							case 6 : System.out.println("Your callers would hear these words when you don't pick after 5 seconds"); break;

							default : System.out.print("Invalid button pressed"); break;
												}
										break;


					case 2 : System.out.println("Phone Settings");

					String PhoneSettingsFolder = """

			
					Press 1 to select Language

					Press 2 to show the Cell Info Display

					Press 3 to see the Welcome Note

					Press 4 to select a Network 

					Press 5 to turn on the lights 

					Press 6 to confirm SIM service Actions


""";

					System.out.println(PhoneSettingsFolder);


					int SettingsFolderOptions = inputCollector.nextInt();

							switch(SettingsFolderOptions){


									case 1 : System.out.println("The Language selected is English"); break;

									case 2 : System.out.println("The network selected doesn't have MCN technology"); break;

									case 3 : System.out.println("Enter your welcome note"); break;

									case 4 : System.out.println("Network has automatically been set to 9mobile"); break;

									case 5 : System.out.println("Lights don't work in your Location"); break;

									case 6 : System.out.println("All confirmation messages have been hidden"); break;

									default: System.out.println("Press a valid Key"); break;


													}

							break;

	

					case 3 : System.out.println("Security");

							String SecuritySettings = """


			Press 1 for Pin Code Request

			Press 2 for Call Barring Services

			Press 3 for Fixed Dialing

			Press 4 to Set group of People that can call you

			Press 5 to Set Phone Security

			Press 6 to Change Access Codes to the Phone


""";

							System.out.println(SecuritySettings);
		
							int SecuritySettingsOptions = inputCollector.nextInt();

										switch(SecuritySettingsOptions){

											case 1 : System.out.println("Code request pinned"); break;

											case 2 :  System.out.println("Call Barring service activated"); break;
										
											case 3 : System.out.println("Fixed Dialing activated"); break;
		
											case 4 : System.out.println("Closed Group set, number of people: 4"); break;

											case 5 : System.out.println("Set phone security settings"); break;

											case 6 : System.out.println("PIN has successfully been changed"); break;
											
											default: System.out.println("Press a valid Key"); break;
									
										}

											break;
				
								

					case 4 : System.out.println("Restore Factory Settings"); break;

					case 99 : System.out .println("Go back to previous menu");

					default: System.out.println("Press a valid Key"); break;

							}

					break;

							} while (SettingsFolderSubMenu != 5);

							break;

				
		case 7 : System.out.println("Call Divert"); break;

		case 8 : System.out.println("Games"); break;

		case 9 : System.out.println("Calculator"); break;

		case 0: System.out.println("Reminders"); break;

		case 11 : System.out.println("Clock"); 


			String ClockSubMenu = """

	Press 1 to set Alarm Clock

	Press 2 to go to Clock Settings

	Press 3 to go to Date Setting

	Press 4 to set Stopwatch

	Press 5 to start timer

	Press 6 to Auto Update Date and Time


	""";

		System.out.println("ClockSubMenu");

		int ClockSubMenuOptions = inputCollector.nextInt();

		
				switch(ClockSubMenuOptions){

					case 1 : System.out.println("Set Alarm Clock"); break;

					case 2 : System.out.println("Current time on Standby mode will be displayed"); break;

					case 3 : System.out.println("Date has been set"); break;

					case 4 : System.out.println("Set Stopwatch"); break;

					case 5 :  System.out.println("Start timer"); break;

					case 6 : System.out.println("Auto update date and Time"); break;

					default: System.out.println("Press a valid Key"); break;

				}

					break;


		case 12 : System.out.println("Profiles"); break;

		case 13 : System.out.println("SIM Services"); break;

		case 99 : System.out.println("Exit Nokia"); break;

		default: System.out.println("Press a valid Key"); break;


					}

					} while(menuOptionsChoice != 99);

				

			}
		}