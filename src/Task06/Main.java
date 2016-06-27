package Task06;

import java.util.Scanner;

public class Main {

	static void printArray(String[] b) {
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many names do you want to write ? ");
		int n = input.nextInt();
		String[] name = new String[n];
		System.out.print("Enter " + n + " names ");
		for (int i = 0; i < name.length; i++) {
			name[i] = input.nextLine();
		}
		System.out.print("Backwards: ");
		printArray(name);
	}

}