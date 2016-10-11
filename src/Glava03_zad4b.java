import java.util.Scanner;

public class Glava03_zad4b {

	public static void main(String[] args) {

		// Finding value of any specific bit of of any integer
		Scanner sc = new Scanner(System.in);
		int xBit;
		String continueAnswer;
		int number;

		// Entering the number and checking if it's not bigger than integer
		number = DL.inputIntegerSafely("Enter integer number for analyzing", sc);
		do {
			// Inputting the bit position and checking if it's between 1 and 32
			xBit = DL.bitNumber("Which bit do you want to check? (positive numbers only)", sc);

			System.out.println("The binary representation of the number is: " + Integer.toBinaryString(number));

			// Displaying the result
			if ((1 << xBit & number) != 0) {
				System.out.println("Bit " + (xBit + 1) + " is: 1");
			} else {
				System.out.println("Bit " + (xBit + 1) + " is: 0");
			}

			// Question for another check
			System.out.println("Do you want to check another position");
			continueAnswer = sc.next();
			if (continueAnswer.charAt(0) == 'n' || continueAnswer.charAt(0) == 'N')
				break;
		} while (true);

		sc.close();
	}

}