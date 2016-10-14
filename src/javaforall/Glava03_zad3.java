package javaforall;

import java.util.Scanner;

public class Glava03_zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int result = 0;

		System.out.println("Original number in  Binary: " +  
				String.format("%32s", Integer.toBinaryString(i)).replaceAll(" ", "0"));
		String resultString = Integer.toBinaryString(i);

		for (int a = 0; a < resultString.length(); a++) {
			if (resultString.charAt(a) == '1')
				result++;
		}

		if (result == 1) {
			System.out.println("Bit with 1 is occured once in this number");
		} else {
			System.out.println("Bits with 1 occured " + result + " times in this number");
		}

		sc.close();
	}

}