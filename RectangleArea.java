package RectangleArea;

/*
 * The superclass, RectangleArea, has the declared variables, side1, side2, and area, that are used to calculate the area of a rectangle
 * inside the constructor and return their values.
 * Also, it has the main method that has the implementations of displaying the name of a rectangle, its area, and its perimeter
 * and creating the subclass object.
 * 
 * Inside the constructor, I assigned the parameters side1 and side2 to instance variables, which have the same name, using "this"
 * to tell the computer that on the left side are the instance variables.
 */

public class RectangleArea {
	
	
	private double side1, side2, area;  // Instance variables
	
	public double getSide1() {   // Getter
		return side1;   // Return the value of side1 in order to be used in the subclass.
	}
	
	
	public double getSide2() {    // Getter
		return side2;   //Return the value of side2 in order to be used in the subclass.
	}
	
	public RectangleArea(double side1, double side2) {  // Constructor 
		this.side1=side1;      // Instance variable = Parameter.
		this.side2=side2;      // Instance variable = Parameter.
		area = side1 * side2;  // Instance variable = parameter * Parameter.
	}
	
	public double getArea() {  //  Getter.
		return area;    // Return the value of the area.
	}
	
	
	public static void main(String[] args) {
		Perimeter rec = new Perimeter(5, 6);   // Create an object 
		rec.setName("Rectangle A");   // Set the name variable in the subclass.
		
		// Display the rectangle name, its area, and its perimeter.
		System.out.println("The area of " + rec.getName() + " is: " + 
		rec.getArea() + " , and its perimeter is: " + rec.getRecPerimeer());
	}

}
