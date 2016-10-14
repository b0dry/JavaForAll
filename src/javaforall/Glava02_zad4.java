package javaforall;

import java.util.Scanner;

public class Glava02_zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side");
		int a = sc.nextInt();
		System.out.println("Enter second side");
		int b = sc.nextInt();
		System.out.println("Enter third side");
		int c = sc.nextInt();
		DL.isItPossibleTriangle(a, b, c);
		sc.close();

	}

}
