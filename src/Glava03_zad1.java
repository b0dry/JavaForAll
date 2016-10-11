
public class Glava03_zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		i = ~i;
		i = i << 1;
		i = ~i;
		System.out.println("Result is: " + Integer.toBinaryString(i) + " Or in decimal: " + i);

	}

}