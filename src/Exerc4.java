import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
			double n1 = sc.nextInt();
			double n2 = sc.nextInt();
			
			if(n2==0) {
				System.out.println("divisão impossível");
			} else {
				double media = (n1/n2);
				System.out.printf("%.1f%n", media);
			}
			
		}
		
	}

}
