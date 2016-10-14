package javaforall;

import java.util.Scanner;

public class Glava06_zad4 {

	public static void main(String[] args) {
		// TODO Check existence of char in array which is a to z small caps;

		// Declarations
		Scanner sc = new Scanner(System.in);

		// Input text
		System.out.println("Enter text: ");

		// Insert text into array
		DL.verifySmallLatinNotExistsInArray(DL.stringIntoCharArray(sc.nextLine()));
		sc.close();
	}
}
