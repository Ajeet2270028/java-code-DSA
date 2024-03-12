// Java Program to Illustrate Copy Constructor

// Class 1
class Complex {

	// Class data members
	private double re, im;

	// Constructor
	public Complex(double re, double im) {
		// this keyword refers to current instance itself
		this.re = re;
		this.im = im;
	}

	void display() {
		System.out.println(re + "\n" + im);
	}
}

// Class 2
// Main class
public class GFG {

	// Main driver method
	public static void main(String[] args) {

		// Creating object of above class
		// inside main() method
		Complex c1 = new Complex(10, 15);
		c1.display();

		// Note: compiler error here
		// Complex c2 = new Complex(c1);
	}
}
