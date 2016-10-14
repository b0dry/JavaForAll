package javaforall;

import java.util.Scanner;

public class Glava09_zad3 {

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

		sc.close();

		int scndWLPosition = 0;
		int frstWLPosition = 0;
		boolean isThereMach = false;

		for (int i = 0; i < firstWord.length(); i++) {
			for (int j = 0; j < secondWord.length(); j++) {
				if (firstWord.charAt(i) == secondWord.charAt(j)) {
					isThereMach = true;
					scndWLPosition = j;
					frstWLPosition = i;
					break;
				}
			}
			if (isThereMach)
				break;
		}

		System.out.println("");
		System.out.println(frstWLPosition);
		System.out.println(scndWLPosition);

		for (int i = 0; i < secondWord.length(); i++) {

			if (i == scndWLPosition) {
				System.out.println(firstWord);
			} else {
				for (int offset = 0; offset < frstWLPosition; offset++) {
					System.out.print(" ");
				}
				System.out.println(secondWord.charAt(i));
			}
		}

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

}
