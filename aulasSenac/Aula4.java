package aulasSenac;

import java.util.Scanner;

public class Aula4 {

	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		double x = 0;
		System.out.println ("Digite um n�mero: ");
		x = sc.nextDouble ();
		
		if (x>10) {
			System.out.println ("� Maior do que 10!");
		} else {
			System.out.println ("N�o � maior que 10!");
	}
	}
}