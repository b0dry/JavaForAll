import java.util.Scanner;

public class Glava03_zad4a {

	public static void main(String[] args) {

		// Find the 5th bit of entered number
		int xBit;
		char answer;
		Scanner sc = new Scanner(System.in);

		do {

			String initialString = Integer.toBinaryString(DL.inputIntegerSafely("Please enter an integer", sc));
			String reversedString = DL.reverseString(initialString);
			xBit = DL.bitNumber("Which bit do you want to check? (positive numbers only)", sc);
			System.out.println("Original string is: " + initialString);

			// Displaying the result
			if (initialString.length() >= xBit) {
				System.out.println("Bit " + (xBit + 1) + " of the number is: " + reversedString.charAt(xBit));
			} else {
				System.out.println("Bit " + (xBit + 1) + " of the number is 0");
			}

			// Question for another check
			System.out.println("Do you want to check another position");
			answer = sc.next().charAt(0);

		} while (answer != 'n' || answer != 'N');

		sc.close();
	}
}