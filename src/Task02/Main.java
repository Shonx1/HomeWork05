package Task02;

import java.util.Scanner;

public class Main {

	public static void printGr() {
		System.out.print("Greeting ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your name is: ");
		String firstName = input.nextLine();
		printGr();
		System.out.print(firstName);
	}
}