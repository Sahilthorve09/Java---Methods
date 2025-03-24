
//Write a method that takes two integers as parameters and prints their sum. Call the method using the class name.

public class Operationusingmethod {
	public static void main(String[] args) {

		Add(23, 22);
		Sub(20, 10);

	}

	public static void Add(int a, int b) {
		int c = a + b;
		System.out.println("Sum is : " + c);
	}

	public static void Sub(int p, int q) {
		int r = p - q;
		System.out.println("Subtraction is : " + r);
	}
}
