import java.util.Scanner;

public class CelciusToFahrenheitMethod{


    public static int FahrenheitConverter(int temperature){

    int temperatureInFahrenheit = temperature * (9/5) + 32;

    return temperatureInFahrenheit;

}
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the degrees in Celcius: ");
    int temperature1 = input.nextInt();


    int tempInFahrenheit = FahrenheitConverter(temperature1);

    System.out.println(tempInFahrenheit);
    }


}
