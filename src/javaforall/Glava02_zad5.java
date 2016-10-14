package javaforall;

import java.util.Scanner;

public class Glava02_zad5 {

	public static void main(String[] args) {
		char answer;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter integer");
			DL.isDevider(sc.nextInt(), 7);
			System.out.println("Do you want to try another one? n for no; any other is yes");
			answer = sc.next().charAt(0);
		} while (answer != 'n');

		sc.close();

	}
}
