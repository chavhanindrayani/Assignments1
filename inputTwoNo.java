import java.util.*;
class inputTwoNo
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int number1;
		int number2;

		System.out.println("Enter the number1 :-");
		number1=s.nextInt();
		System.out.println("Enter the number2 :-");
		number2=s.nextInt();

		int sum = number1 + number2;
		System.out.println("print the sum of two numbers :- " + sum);

	}
}