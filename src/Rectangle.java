//Steven Liu
import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the width value: ");
		double width = in.nextDouble();
		in.nextLine();
		
		System.out.print("Please enter the length value: ");
		double length = in.nextDouble();
		in.nextLine();
		
		double area = width * length;
		System.out.printf("%-50s %10.2f\n", "The area of the given rectangle is: ", area);
		
		double perimeter = 2 * (width + length);
		System.out.printf("%-50s %10.2f\n","The perimeter of the given rectangle is: ", perimeter);
		
		double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
		System.out.printf("%-50s %10.2f\n", "The diagonal of the given rectangle is: ", diagonal);

	}

}
