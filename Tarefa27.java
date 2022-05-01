package Aula4;
import java.util.*;
public class Tarefa27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		
		System.out.println ("Escolha um número: ");
		a = sc.nextInt ();
		
		if (a>=1) {
			System.out.println ("Número positivo.");
		} else if (a<0) {
			System.out.print ("Número negativo.");
		} else {
			System.out.println ("Zero.");
		}
	}

}
