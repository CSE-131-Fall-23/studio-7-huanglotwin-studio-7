package studio7;

public class Rectangle {
	private int length;
	private int width;

	//This is the constructor! It assigns a value to each private variable in the class. 
	public Rectangle(int theLength, int theWidth) {

		length = theLength;
		width = theWidth;
	}

	//These are methods!
	public static int Area(int length, int width) {
		int area = length * width; 
		return area; 
	}
	public static int Parameter(int length, int width) {
		int parameter = 2*length + 2*width; 
		return parameter; 
	}

	public static boolean isSquare(int length, int width) {
		if(length == width) {
			return true;
		}
		else {
			return false; 
		}
	}
	public String toString() {
		return (this.length + "+" + this.width); 
	}


	//public static void Print()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(4, 5); 
		System.out.print(rectangle1);
	}
}