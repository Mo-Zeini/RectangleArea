package RectangleArea;

/*
 * The subclass, Perimeter, has the constructor that calls the constructor in the superclass using "super()."
 * Also, it calculates the perimeter by getting the values of the sides that were declared in the superclass using “super.”
 * Furthermore, it has the setter method that sets the name of a rectangle.
 * Inside it, I assigned its parameter to the instance variable, which has the same name, using "this."
 * Finally, it returns the values of the perimeter and the name variables.
 */

public class Perimeter extends RectangleArea {
	
	private String name;   // Instance variable.
	private double recPerimeer;   // Instance variable.
	
	
	// Constructor
	public Perimeter(double side1, double side2) {
		super(side1, side2);   // Call the constructor in the super class.
		
		// Calculate the perimeter using the instance variable of the sides in the super class.
		recPerimeer = (super.getSide1() * 2) + (super.getSide2() * 2);
	}

	
	public void setName(String name) {  // Setter
		this.name = name;  // Instance variable = Parameter.
	}
	
	public String getName() {  // Getter
		return name;
	}
	
	public double getRecPerimeer() {  // Getter
		return recPerimeer;    // Return the value of the perimeter.
	}
}
