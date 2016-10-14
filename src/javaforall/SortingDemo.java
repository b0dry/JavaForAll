package javaforall;

import java.util.Arrays;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Примерен масив с числа
		int[] arr = { 6, 82, 12, 1, 4, 59, -32, 61, 68, 12, 3456, 8934, 764537, 5253 };
		DL.intArraySelectionSort(arr);
		DL.intArrayBubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}