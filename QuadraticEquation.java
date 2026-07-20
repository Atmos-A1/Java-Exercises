import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the values of a, b, c, from the equation: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Calculate the discriminant (the value under the square root)
        double underroot = (b * b) - (4 * a * c);

        if (underroot > 0) {
          
            double sqrtVal = Math.sqrt(underroot);
            double r1 = (-b + sqrtVal) / (2 * a);
            double r2 = (-b - sqrtVal) / (2 * a);
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        } 
        else if (underroot == 0) {
           
            double r = -b / (2 * a);
            System.out.println("The equation has one root: " + r);
        } 
        else {
         
            System.out.println("The equation has no real roots");
        }


    }
}