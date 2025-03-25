import java.util.*;
class FahrenheitToCelsius
{
	public static void main(String args[])
	{
		float Fahrenheit;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Fahrenheit Tempecture :-  " );
		Fahrenheit=s.nextFloat();

		float celusius = (Fahrenheit - 32) / 5 * 9;

		System.out.println("Fahrenheit to convert Celsius :-  " +celusius );

	}
}