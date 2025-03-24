
//Write a method that takes an integer N and prints numbers from 1 to N. Call the method using the class name.

public class Loopusingmethod {
	public static void main(String[] args) {
		loop(10);
	}
	
	public static void loop(int n) {
		for(int i = 1; i<=n; i++) {
			System.out.println(i);
		}
	}
}
