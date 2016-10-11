import java.util.Scanner;

public class Glava05_zad5 {

	public static void main(String[] args) {
		// TODO Generate matrix with p lines and q columns where number in the matrix defines it's position.
		
		//Declarations
		int p, q;
		Scanner sc = new Scanner(System.in);
		p = DL.inputIntegerSafely("Enter an integer for the number of lines", sc);
		q = DL.inputIntegerSafely("Enter an integer for the number of columns", sc);
		for (int i = 1;i <= p; i++){
			for (int a = 1; a <= q; a++){
				System.out.print(" " + i + a );
				System.out.print("\t");
			}
			System.out.println("");
		}
		sc.close();
	}

}
