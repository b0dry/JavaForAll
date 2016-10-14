package javaforall;

public class Glava06_zad3 {

	public static void main(String[] args) {
		// TODO Compare mirror copy of array1 is equal to array2

		// Declarations
		int[] arr2 = { 5, 4, 3, 2, 1 };
		int[] arr1 = { 1, 2, 3, 4, 5 };
		boolean result = true;
		
		// Compare array length
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[arr1.length - i - 1]) {
					result = false;
				}
			}
		} else
			result = false;

		if (result) {
			System.out.println("Arrays are equal");
		} else
			System.out.println("Arrays are not equal");
	}

}
