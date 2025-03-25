import java.util.*;
class printAge
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the student Age :-");
		int age1=s.nextInt();
		System.out.println("Student age is :- " +age1);
		int age2 = age1+1;
		System.out.println("Increased student age is :- " +age2);
	}
}