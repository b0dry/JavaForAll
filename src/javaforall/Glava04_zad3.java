package javaforall;

import java.util.Scanner;

public class Glava04_zad3 {

	public static void main(String[] args) {
		// Input two variables existed amount of money (float) and healthy status flag (boolean) 
		// Declarations
		float amount;
		boolean amIHealth;
		Scanner sc = new Scanner(System.in);
		// Insert of the values
		System.out.print("Ask your self: ");
		System.out.println("Am I healthy?");
		amIHealth = sc.nextBoolean();
		System.out.println("How much money do I have?");
		amount = sc.nextInt();

		// Calculate result
		if (!amIHealth) {
			if (amount > 10) {
				System.out.println("So I need to by some drugs!");
			} else {
				System.out.println("Drink some tea then!");
			}
		} else {
			if (amount > 10) {
				System.out.println("Watch some movie with friends, cinema wait's you!");
			} else {
				System.out.println("Go, walk your self!");
			}

		}

		sc.close();
	}

}
