import java.util.Locale;
import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; n >= i; i++) {
			System.out.print(i + " ");
			int quad = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			System.out.printf(quad + " ");
			System.out.print(cubo + " ");
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
