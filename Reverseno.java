
//Write a method that takes an integer / prints its reverse. Call the method using the class name.

public class Reverseno {
	public static void main(String[] args) {
		reversenoMethod(10, 1);
	}
	public static void reversenoMethod(int i, int n) {
		for(i = i; i>=n; i--) {
			System.out.println(i);
		}
	}
}
