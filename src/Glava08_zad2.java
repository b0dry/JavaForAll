import java.util.Scanner;

public class Glava08_zad2 {

	public static void main(String[] args) {
		// TODO Enter two numbers and display their sum
		float one, two;
		Scanner sc = new Scanner(System.in);
		one = sc.nextFloat();
		two = sc.nextFloat();
		System.out.println("Average of numbers is: " + DL.average(one, two));
		sc.close();
	}

}
