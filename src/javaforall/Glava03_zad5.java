package javaforall;

import java.util.Scanner;

public class Glava03_zad5 {

	public static void main(String[] args) {

		// Declarations
		int firstNumber, secondNumber, result;
		Scanner sc = new Scanner(System.in);

		// Entering input parameters
		firstNumber = DL.inputIntegerSafely("Please insert the first integer", sc);
		System.out.println();
		secondNumber = DL.inputIntegerSafely("Please insert the second integer", sc);
		// Calculating result
		result = firstNumber ^ secondNumber;
		result = ~result;
		// Displaying the results
		System.out.println(String.format("%42s", "First integer represented as binary is ")
				+ String.format("%32s", Integer.toBinaryString(firstNumber)).replace(" ", "0"));
		System.out.println(String.format("%42s", "Second integer represented as binary is ")
				+ String.format("%32s", Integer.toBinaryString(secondNumber)).replace(" ", "0"));
		System.out.println(String.format("%42s","Result represented as binary is ") 
				+ Integer.toBinaryString(result));
		System.out.println(String.format("%42s","First integer value is ") + firstNumber);
		System.out.println(String.format("%42s","Second integer value is ") + secondNumber);
		System.out.println(String.format("%42s","Result integer value is ") + result);
		sc.close();
	}

}