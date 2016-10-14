package javaforall;

import java.util.Scanner;

public class Glava09_zad2 {

	public static void main(String[] args) {
		// TODO Enter 2 words with up to 20 letters
		// TODO Create new words as you exchange the first 5 symbols between
		// them
		int switchIndex = 1;
		int maxWordLength = 100;
		StringBuilder firstWord = new StringBuilder();
		StringBuilder secondWord = new StringBuilder();
		// StringBuilder result = new StringBuilder();

		Scanner sc = new Scanner(System.in);

		firstWord = enterWord(switchIndex, maxWordLength, sc);
		secondWord = enterWord(switchIndex, maxWordLength, sc);

		if (firstWord.length() > secondWord.length()) {
			System.out.println("Първият низ е по-дълъг.");
			System.out.println("Разлика по позиции:");
			for (int i = 0; i < secondWord.length(); i++) {
				if (firstWord.charAt(i) != secondWord.charAt(i)) {
					System.out.println(""+ (i+1) + " " + firstWord.charAt(i) + "-" + secondWord.charAt(i));
				}
			}
		} else if (firstWord.length() < secondWord.length()) {
			System.out.println("Втория низ е по-дълъг.");
			System.out.println("Разлика по позиции:");
			for (int i = 0; i < firstWord.length(); i++) {
				if (firstWord.charAt(i) != secondWord.charAt(i)) {
					System.out.println(""+ (i+1) + " " + firstWord.charAt(i) + "-" + secondWord.charAt(i));
				}
			}
		} else {
			System.out.println("Двата низа са с равна дължина.");
			System.out.println("Разлика по позиции:");
			for (int i = 0; i < firstWord.length(); i++) {
				if (firstWord.charAt(i) != secondWord.charAt(i)) {
					System.out.println(""+ (i+1) + " " + firstWord.charAt(i) + "-" + secondWord.charAt(i));
				}
			}
		}

		sc.close();

	}

	// Methods
	// Enter word
	static StringBuilder enterWord(int minLenght, int maxLenght, Scanner sc) {
		StringBuilder word = new StringBuilder();
		String input;
		do {
			System.out.println();
			System.out.print("Въведете низ с дължина между " + minLenght + " и " + maxLenght + " символа: ");
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
