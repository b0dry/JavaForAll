
public class Glava07_zad3 {

	public static void main(String[] args) {
		// TODO Rotate the matrix +90 degree

		// Declarations
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		// Rotate the matrix
		if (DL.isItMatrix(arr)) {
			for (int row = 0; row < arr.length; row++) {
				for (int column = 0; column < arr[row].length; column++) {
					System.out.print("\t");
					System.out.print(arr[arr.length - column - 1][row]);
				}
				System.out.println("");
			}
		} else {
			System.out.println("The array is not square");
		}
	}
}
