package javaforall;

public class Glava07_zad1 {

	public static void main(String[] args) {
		// TODO From the matrix below find the most common integer number.
		// if not return the first.

		// Declarations
		int[][] arr = { { 115, 3, 5, 7, 9 }, { 1, 13, 15, 17, 19 }, { 21, 23, 115, 27, 29 }, { 11, 33, 15, 37, 39 },
				{ 41, 43, 45, 47, 49 } };

		// Print most common number (First by default)
		System.out.println(DL.mostCommonMemberInMatrix(arr));
	}
}
