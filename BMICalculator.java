import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        int weight = input.nextInt();

        System.out.print("Enter height in inches: ");
        int height = input.nextInt();

        double bmi = (weight * 703.0) / (height * height);

        System.out.printf("Your BMI is: %1f%n", bmi);
    }
}