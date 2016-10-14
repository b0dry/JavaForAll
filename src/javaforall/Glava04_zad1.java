package javaforall;

import java.util.Scanner;

public class Glava04_zad1 {

	public static void main(String[] args) {
		// Input tree integers and find biggest
		// Declarations
		int firstNumber, secondNumber, thirdNumber;
		Scanner sc = new Scanner(System.in);
		// Insert of the values
		firstNumber = DL.inputIntegerSafely("Please insert the first integer", sc);
		secondNumber = DL.inputIntegerSafely("Please insert the second integer", sc);
		thirdNumber = DL.inputIntegerSafely("Please insert the third integer", sc);
		// Analyze and return highest
		if (firstNumber > secondNumber) {
			if (firstNumber > thirdNumber) {
				System.out.println("Highest number is: " + firstNumber);
			} else if (thirdNumber > secondNumber) {
				System.out.println("Highest number is: " + thirdNumber);

			}
		} else if (secondNumber > thirdNumber) {
			System.out.println("Highest number is: " + secondNumber);
		} else {
			System.out.println("Highest number is: " + thirdNumber);
		}

		sc.close();
	}

}
