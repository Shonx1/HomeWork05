package Task07;

import java.util.Scanner;

public class Main {


	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter b : ");
		int b = input.nextInt();
		System.out.print("b factorial is: " + factorial(b));
	}
}