import java.util.*;
class CircumferenceOfCircle
{
	public static void main(String args[])
	{
		double area;
		double circumference;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the radius of circle :-  ");
		double r=s.nextDouble();

		area = Math.PI * r*r;
        circumference = 2*Math.PI *r;

		System.out.println("Enter the area of circle :-  " +area);
		System.out.println("The Circumference of circle  :-  " + circumference);

	}
}
