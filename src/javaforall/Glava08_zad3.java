package javaforall;

public class Glava08_zad3 {

	public static void main(String[] args) {
		// TODO Create a method that will generate an array from two diferent
		int[] arr1 = { 5, 4, 3, 2, 1, 23, 2323, 23233, 4545, 656, 778, 8996, 34456, 34343 };
		int[] arr2 = { 5, 4, 3, 2, 1, 23, 2323 };
		int[] arr = DL.concatArrays(arr1, arr2);
		for (int anArr : arr) {
			System.out.print(anArr);
			System.out.print("; ");
		}
		System.out.println();
		long result;
		for (int counter = -5; counter <= 15; counter++) {
			result = DL.fibonacci(counter);
			if (result != 0)
				System.out.printf("Fibonacci of %d is: %d\n", counter, result);			
			else 
				System.out.printf("Fibonacci of %d is invalid request\n", counter);			
		}
	}
}
