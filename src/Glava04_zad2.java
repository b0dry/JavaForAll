import java.util.Scanner;

public class Glava04_zad2 {

	public static void main(String[] args) {
		// Input tree integers and find if second integer is between others
		// Declarations
		int firstNumber, secondNumber, thirdNumber;
		Scanner sc = new Scanner(System.in);
		// Insert of the values
		firstNumber = DL.inputIntegerSafely("Please insert the first integer", sc);
		secondNumber = DL.inputIntegerSafely("Please insert the second integer", sc);
		thirdNumber = DL.inputIntegerSafely("Please insert the third integer", sc);
		// Analyze and return highest
		if ((firstNumber < secondNumber && secondNumber < thirdNumber)
				|| firstNumber > secondNumber && secondNumber > thirdNumber) {
			System.out.println("Second is between other numbers");
		} else {
			System.out.println("Second number is outside range or there is equal numbers");
		}

		sc.close();
	}

}
