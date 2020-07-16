// Code reviewed by @professorgordon
/* Nick Nussenzveig CSIS-1400 */
import java.util.Scanner;
public class Week4Assignment {
	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   	double length;
		   	double height;
		   	double width;
		   	
		   System.out.println("This program will accept a length, width and height of a box, \nand then it will report the surface area and volume of it.\n");
		   System.out.print("	Enter the box length : ");
		   	length = input.nextDouble();
		   System.out.print("	Enter the box height : ");
		   	height = input.nextDouble();
		   System.out.print("	Enter the box width: ");
		    width = input.nextDouble();
		   System.out.println();
		   System.out.printf("The surface area of your rectangle is: %,5.2f%n",surfaceArea(length,height,width));
		   System.out.printf("The volume of your rectangle is: %,5.2f%n",volume(length,height,width));
		   input.close(); 
		}
	private static double surfaceArea(double length, double height, double width) {
	    return (length*width*2)+(length*height*2)+(height*width*2);
	   
	}
	private static double volume(double length, double height, double width) {
		return (length*width*height);
}
}
