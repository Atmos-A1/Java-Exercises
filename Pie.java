public class Pie{
	public static void main(String[]args){

	double fraction1 = 1.0 - ((double)(1.0/3.0)) + ((double)(1.0/5.0)) - ((double)(1.0/7.0)) + ((double)(1.0/9.0)) + ((double)(1.0/11.0));
	double fraction2 = 1.0 - ((double)(1.0/3.0)) + ((double)(1.0/5.0)) - ((double)(1.0/7.0)) + ((double)(1.0/9.0)) + ((double)(1.0/11.0)) + ((double)(1.0/13.0));


	double Fraction1 = fraction1 * 4;
	double Fraction2 = fraction2 * 4;

	System.out.println(Fraction1);
	System.out.print(Fraction2);

	}
}
