import java.util.Scanner;

public class DL {

	static boolean isItPossibleTriangle(double a, double b, double c) {
		if (a + b > c && b + c > a && c + a > b) {
			System.out.println("Triangle is possible");
			return true;
		} else
			System.out.println("Triangle is NOT possible");
		return false;
	}

	static boolean isDevider(int number, int devider) {
		if (number % devider == 0) {
			System.out.println(number + " is divided by " + devider);
			return true;
		} else
			System.out.println(number + " cannot be devided by " + devider);
		return false;
	}

	static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		} else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}

	static int inputIntegerSafely(String message, Scanner sc) {
		// Entering the number and checking if it's not bigger than integer
		// Scanner sc = new Scanner(System.in);
		double input;
		do {
			System.out.println(message);
			input = sc.nextDouble();
		} while (!(-2147483648 <= input && input <= 2147483647));
		// sc.close();
		return (int) input;
	}

	static int bitNumber(String message, Scanner sc) {
		int xBit;
		// Entering the bit position and checking if it's between 1 and 32
		do {
			xBit = inputIntegerSafely(message, sc) - 1;
		} while (xBit < 0 || xBit > 31);
		return xBit;
	}

	static int findIntArrayMaxValue(int[] arr) {
		int result = Integer.MIN_VALUE;

		// Find highest integer
		if (arr.length > 0) {
			for (int anArr : arr) {
				if (result < anArr)
					result = anArr;
			}
		}
		// Display result
		System.out.println("The highest number in the array is: " + result);
		return result;

	}

	static float[] fillArrayOfFloat(float[] arr, Scanner sc) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter float number: ");
			arr[i] = sc.nextFloat();
		}
		return arr;
	}

	static float findFloatArraySum(float[] arr) {
		float result = 0;
		for (float anArr : arr) {
			result = result + anArr;
		}
		System.out.println("The result is: " + result);
		return result;
	}

	static boolean verifySmallLatinNotExistsInArray(char[] arr) {
		// Verify existence of char from a to z small caps;
		// return true if not exist
		boolean result = true;
		for (int a : arr) {
			if (arr[a] >= 'a' && arr[a] <= 'z') {
				System.out.println("Letter: " + arr[a] + " is latin small letter");
				result = false;
				break;
			}
		}
		// Displaying results
		if (result) {
			System.out.println("There is no latin small letters");
		} else {
			System.out.println("There is at least one latin small letters inside the Array");
		}
		return result;
	}

	static char[] stringIntoCharArray(String str) {
		char[] arr;
		arr = new char[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			// System.out.print(arr[i]);
		}
		return arr;
	}

	static boolean isItMatrix(int[][] arr) {
		// Verifying if array is matrix
		for (int[] anArr : arr) {
			if (arr.length != anArr.length) {
				System.out.println("The array is not square/matrix");
				return false;
			}
		}
		return true;
	}

	static int mostCommonMemberInMatrix(int[][] arr) {
		int counter;
		int newCounter = 0;
		int result = 0;
		int currentNumber;

		if (isItMatrix(arr)) {
			// Put cell 0:0 into variable
			// Creating cycle for lines
			for (int row = 0; row < arr.length; row++) {
				// Creating cycle for columns
				for (int column = 0; column < arr[row].length; column++) {
					// Inner cycle of iterations in order to check current taken
					// number against the rest
					currentNumber = arr[row][column];
					counter = 0;
					for (int r = row; r < arr.length; r++) {
						// Creating cycle for columns
						for (int c = column; c < arr[r].length; c++) {
							if (currentNumber == arr[r][c]) {
								counter++;
							}
						}
					}

					// Verification for number of appearing
					if (counter > newCounter) {
						result = currentNumber;
						newCounter = counter;
					}
				}
			}
		}
		return result;
	}

	static float average(float one, float two) {
		return (one + two) / 2;
	}

//	static int[][] arrayWithZeros(int x, int y) {
//		int[][] arr = new int[x][y];
//		for (int i = 0; i < x; i++) {
//			for (int a = 0; a < y; a++) {
//				arr[i][a] = 0;
//			}
//		}
//		return arr;
//	}

	static int[] concatArrays(int[] arr1, int[] arr2) {
		int[] arr = new int[(arr1.length + arr2.length)];
		System.arraycopy(arr1, 0, arr, 0, arr1.length);
		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
//		for (int i = 0; i < arr2.length; i++)
//			arr[i + arr1.length] = arr[i];

		return arr;
	}

	// Returns N number of Fibonacci order
	static long fibonacci(long number) {
		if (number <= 0)
			return 0;
		else if (number <= 1)
			return number;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

	static void intArrayBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean hasASwap = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					hasASwap = true;
				}
			}
			if (!hasASwap) {
				break;
			}
		}
	}

	static void intArraySelectionSort(int num[]) {
		int start = 0;
		int end = num.length - 1;
		for (int sortedCount = start; sortedCount < num.length; sortedCount++) {
			int maxIndex = start;
			int minIndex = start;
			for (int index = start; index <= end; index++) {
				if (num[index] > num[maxIndex]) {
					maxIndex = index;
				}
				if (num[index] < num[minIndex]) {
					minIndex = index;
				}
			}
			
			int temp = num[maxIndex];
			num[maxIndex] = num[start];
			num[start] = temp;
			
			if (minIndex == end) {
				minIndex = maxIndex;
			}
			
			temp = num[minIndex];
			num[minIndex] = num[end];
			num[end] = temp;
			
			end--;
			start++;
		}
	}
}
