package aulasSenac;
import java.util.Scanner;
public class Tarefa18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = 0;
		int b = 0;
		
		System.out.println ("Digite um n�mero: ");
		a = sc.nextInt ();
		
		System.out.println ("Digite outro n�mero: ");
		b = sc.nextInt ();
		
		if (b>a) {
			System.out.println ("O maior n�mero �: "+ b);
		} else {
			System.out.println ("O maior n�mero �: "+ a);
		}


	}

}
