package javaforall;

import java.util.Scanner;

public class Glava02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// byte score = sc.nextByte();
		// int age = sc.nextInt();
		// long egn = sc.nextLong();
		double liters = sc.nextDouble();
		// float money = sc.nextFloat();
		// boolean isLate = sc.nextBoolean();
		// char letter = sc.next().charAt(0);
		// int noDefaultValue;
		// System.out.println("score: " + score);
		System.out.println("Frontage is: " + liters * liters * Math.PI);
		// System.out.println("EGN: " + egn);
		// System.out.println("Litters: " + liters);
		// System.out.println("Money: " + money);
		// System.out.println("isLate: " + isLate);
		// System.out.println("Letter: " + letter);
		// noDefaultValue = sc.nextInt();
		// System.out.println("no Default value int: " + noDefaultValue);
		sc.close();
		for (int i = 1; i < 6; i++) {
			System.out.println("Square of: " + i + "is: " + i * i);
		}
	}

}
