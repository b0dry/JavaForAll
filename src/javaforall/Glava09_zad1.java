package javaforall;

import java.util.Scanner;

public class Glava09_zad1 {

	public static void main(String[] args) {
		// TODO Enter 2 words with up to 20 letters
		// TODO Create new words as you exchange the first 5 symbols between
		// them
		int switchIndex = 6;
		int maxWordLength = 20;
		StringBuilder firstWord = new StringBuilder();
		StringBuilder secondWord = new StringBuilder();
		StringBuilder result = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);

		firstWord = enterWord(switchIndex, maxWordLength, sc);
		secondWord = enterWord(switchIndex, maxWordLength, sc);
		result = switchFirstNLetters(firstWord, secondWord, 4);
		System.out.println(result.length() + " " + result);

		sc.close();

	}

	// Methods
	// Enter word
	static StringBuilder enterWord(int minLenght, int maxLenght, Scanner sc) {
		StringBuilder word = new StringBuilder();
		String input;
		do {
			System.out.println();
			System.out.print("Enter word between " + minLenght + " and " + maxLenght + " symbols: ");
			input = sc.next();
		} while (!(input.length() >= minLenght && input.length() <= maxLenght));
		word.append(input);
		System.out.println(word);
		return word;
	}

	// Exchange first 5 chars
	static StringBuilder switchFirstNLetters(StringBuilder one, StringBuilder two, int tillIndex) {
		StringBuilder oneTwo = new StringBuilder();
		StringBuilder twoOne = new StringBuilder();
		if (one.length() >= two.length()) {
			oneTwo.append(two.subSequence(0, tillIndex));
			oneTwo.append(one.subSequence(tillIndex, one.length()));
			return oneTwo;
		} else {
			twoOne.append(one.subSequence(0, tillIndex));
			twoOne.append(two.subSequence(tillIndex, two.length()));
			return twoOne;
		}
	}
}
