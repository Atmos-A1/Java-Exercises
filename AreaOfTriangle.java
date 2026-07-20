import java.util.Scanner;

	public class AreaOfTriangle{
		public static void main(String[]args){

	

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the values of x1, y1, x2, y2, x3, y3 in that order: ");

	double x1= input.nextDouble();
	double y1 = input.nextDouble();
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double x3 = input.nextDouble();
	double y3 = input.nextDouble();


	 double firstSide = ((x2 -x1) * (x2 -x1)) + ((y2 - y1) * (y2 - y1));
	 double secondSide = ((x3 -x2) * (x3 -x2)) + ((y3 - y2) * (y3 - y2));
  	 double thirdSide = ((x3 -x1) * (x3 -x1)) + ((y3 - y1) * (y3 - y1));

	double side1 = Math.pow(firstSide, 0.5);
	double side2 = Math.pow(secondSide, 0.5);
	double side3 = Math.pow(thirdSide, 0.5);



	double semiPerimeter = (side1 + side2 + side3)/2;
	
	double initialArea = (semiPerimeter * (semiPerimeter - side1)) * (semiPerimeter - side2) * (semiPerimeter - side3);
	
	double finalArea = Math.pow(initialArea, 0.5);

	System.out.printf("The area of the Triangle is: %.2f", finalArea);

		}
	}



/*Take input from the user for x1, x2, x3, y1, y2 and y3
To find the sides, we subtract the x2 from x1, square it and add it to the difference of y2 from y1 and square it.
Squareroot the values gotten here
For the second side, subtract x3 from x2, square it and add it to the difference of y2 from y3 and square it too. 
Squarerrot the values gotten here
For the third side, it'll be the difference of x3 and x1 squared added to the difference of y3 and y1 squared.
Squareroot this values and store it
Add the sides together,  store it in a variable called semiPerimeter
Store the semiPerimeter multiplied by the (semiPerimeter - side1)
Store the difference between semiPerimeter and side2 
Store the difference of semiPerimeter and side3
Multiply all of them and find the square root and store it in area*/




