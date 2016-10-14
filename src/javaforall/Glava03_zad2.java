package javaforall;

public class Glava03_zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 231;
		System.out.println("Original number in  Binary:   " + Integer.toBinaryString(i));
		System.out.println("Number we are searching is: " + Integer.toBinaryString(772));
		i = i >> 6;
		i = i << 5;
		i = ~i;
		i = i << 1;
		i = ~i;
		i = i << 2;
		System.out.println("Result is:                  " + Integer.toBinaryString(i) + " Or in decimal: " + i);

	}

}