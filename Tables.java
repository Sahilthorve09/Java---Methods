
//Write a method that takes an integer and prints its multiplication table up to 10. Call the method using the class name.

public class Tables {
	public static void main(String[] args) {
		Mult(5);
	}
	
	public static void Mult(int n) {
		System.out.println("Table of "+ n +" is: ");
		for(int i = 1; i<=10; i++) {
			System.out.println(i*n);
		}
	}
}
