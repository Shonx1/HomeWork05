package Task03;

import java.util.Scanner;

public class Main {

	static int threeParam(int number1, int number2, int number3) {
		int result = number1 * number2 * number3;
		System.out.println("The result is: " + result);
		return result;
	}

	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			Scanner input = new Scanner(System.in);
			System.out.print("Number 1: ");
			int a = input.nextInt();
			System.out.print("Number 2: ");
			int b = input.nextInt();
			System.out.print("Number 3: ");
			int c = input.nextInt();
			threeParam(a, b, c);
		}
	}
}