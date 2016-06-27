package Task04;

import java.util.Scanner;

public class Main {

	static void oddEven(int a) {
		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number - ");
		int num = input.nextInt();
		oddEven(num);
	}

}