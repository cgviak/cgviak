package Aula4;
import java.util.*;
public class Tarefa28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a;
		double b;
		double c;
		
		System.out.print("N�mero 1: ");
		a = sc.nextDouble ();
		
		System.out.print("N�mero 2: ");
		b = sc.nextDouble ();
		
		System.out.print("N�mero 3: ");
		c = sc.nextDouble ();
		
		System.out.print ("O maior n�mero �: ");
		if ( (a>b) && (a>c)) {
			System.out.print(a);
		}else if ( (b>a) && (b>c)) {
			System.out.print(b);
		}else {
			System.out.print(c);
		}
	}

}
