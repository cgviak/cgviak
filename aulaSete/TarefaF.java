package aulaSete;
import java.util.*;
public class TarefaF {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b;
		
		System.out.println ("Digite um n�mero: ");
		a = sc.nextInt ();
		System.out.println ("Ser� elevado �: ");
		b = sc.nextInt ();
		
		System.out.println(Math.pow(a, b));
	}

}
