import java.util.Scanner;

public class Glava05_zad1to4 {

	public static void main(String[] args) {
		// TODO Print all integers between -10 and 10
		for (int i = -10; i <= 10; i++)
			System.out.print(i + ", ");
		System.out.println("");
		// TODO Print all odd numbers between 1 and 40
		for (int i = 1; i <= 40; i++)
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		System.out.println("");
		// TODO Sum of integers between 1 and the input number
		System.out.println("Enter Number for making a sum between 1 and the number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer number");
		double number = DL.inputIntegerSafely("Please enter an integer number", sc);
		double result = 0;
		if (number >= 1) {
			for (int i = 1; i <= number; i++) {
				result = result + (double) i;
			}
		} else {
			for (int i = 1; i >= number; i--) {
				result = result + (double) i;
			}
		}
		System.out.println("SUM of the numbers between 1 and " + number + " is: " + result);

		// TODO Enter an integer and find if it's simple number
		System.out.println("Please enter another integer number!");
		isItPrimeInteger(DL.inputIntegerSafely("Please enter an integer number", sc));
		sc.close();
	}
	static boolean isItPrimeInteger (int number) {
		boolean flag = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("The number is not prime. It devides at least to: " + i);
				flag = false;
			}
		}
		if (flag) {
			System.out.println("The number is prime!");
		}
		return flag;
	}
}
