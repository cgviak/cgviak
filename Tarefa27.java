package Aula4;
import java.util.*;
public class Tarefa27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		
		System.out.println ("Escolha um n�mero: ");
		a = sc.nextInt ();
		
		if (a>=1) {
			System.out.println ("N�mero positivo.");
		} else if (a<0) {
			System.out.print ("N�mero negativo.");
		} else {
			System.out.println ("Zero.");
		}
	}

}
