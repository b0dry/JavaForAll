package javaforall;

public class Glava07_zad2 {

	public static void main(String[] args) {
		// TODO show diagonals of a matrix
		// if not return the first.

		// Declarations
		int[][] arr = { { 11, 3, 5, 368 }, { 1, 13, 17, 345 }, { 21, 23, 115, 27 }, { 1, 33, 15, 37 } };

		if (DL.isItMatrix(arr)) {
			for (int row = 0; row < arr.length; row++) {
				for (int column = 0; column < arr[row].length; column++) {
					System.out.print("\t");
					if (row == column || row + column + 1 == arr.length) {
						System.out.print(arr[row][column]);
					}

				}
				System.out.println("");
			}
		}
	}
}
