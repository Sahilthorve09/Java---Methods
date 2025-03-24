
//Write a method that takes an integer and prints its square. Call the method using the class name.
//Write a method that takes an integer and prints its cube. Call the method using the class name.


public class SquareandCube {
	public static void main(String[] args) {
		square(12);
		cube(3);
	}
	public static void square(int a) {
		System.out.println("Square of: " + a + " ==> " + (a*a) );
	}
	
	public static void cube(int b) {
		System.out.println("Cube of: " + b + " ==> " + b*b*b);
	}
}
