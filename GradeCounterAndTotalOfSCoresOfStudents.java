import java.util.Scanner;

public class GradeCounterAndTotalOfSCoresOfStudents{
		public static void main(String[]args){


	Scanner input = new Scanner(System.in);

	System.out.printf("Enter number of Students: ");
	int numberOfStudents = input.nextInt();


	int gradeCountA = 0;
	int gradeCountB = 0;
	int gradeCountC = 0;
	int gradeCountD = 0;
	int gradeCountF = 0;
	int invalidGradeCount = 0;
	
	String remark;

	int total = 0;

	for(int numberOfStudent = 1;  numberOfStudent <= numberOfStudents; numberOfStudent++){
	
		System.out.printf("Enter the name of the student:  ");
		String nameOfStudent = input.next();

		System.out.println();
		
		System.out.printf("The score of %s is :  ", nameOfStudent);

		int scoreOfStudent = input.nextInt();

		System.out.println();

		if( scoreOfStudent >= 80){
			remark = "A";
		}
	
		else if (scoreOfStudent >= 70){
			remark = "B";
		}

		else if (scoreOfStudent >= 60){
			remark = "C";
		}

		else if (scoreOfStudent >= 50){
			remark = "D";
		}
		else{
			remark = "F";
		}

		total = total + scoreOfStudent;
		total++;
			

		switch(remark){

		case "A" : gradeCountA++; break;
		case "B" : gradeCountB++; break;
		case "C" : gradeCountC++; break;
		case "D" : gradeCountD++; break;
		case "F" : gradeCountF++; break;
		default : invalidGradeCount++; break;
		
				}
		}

		System.out.println();

		System.out.println("-------Total Grades of the Students-------");
			
			System.out.printf("The number of grade A: %d%n", gradeCountA);
			System.out.println();
			System.out.printf("The number of grade B: %d%n", gradeCountB);
			System.out.println();
			System.out.printf("The number of grade C: %d%n", gradeCountC);
			System.out.println();
			System.out.printf("The number of grade D: %d%n", gradeCountD);
			System.out.println();
			System.out.printf("The number of grade F: %d%n", gradeCountF);
			System.out.println();
			System.out.printf("The nunmber of invalid inputs: %d%n", invalidGradeCount);
			System.out.printf("The total of the scores is: %d%n", total);
			System.out.println();

	}
}
	