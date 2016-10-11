import java.util.Scanner;

public class Glava06_zad1 {

	public static void main(String[] args) {
		// TODO Input X float numbers from the console, store it into array and
		// display their sum

		// Declarations
		Scanner sc = new Scanner(System.in);
		float[] arr = new float[DL.inputIntegerSafely("Declair array lenght", sc)];
 
		DL.fillArrayOfFloat(arr, sc);
		DL.findFloatArraySum(arr);
		sc.close();
	}
}
