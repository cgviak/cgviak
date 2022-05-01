package Aula4;
import java.util.*;
public class Tarefa32 {
// pedir para aprender string
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			int a; //resultado t1
			int b; // resultado t2
			String c = new String ();
			String d = new String ();
			
			System.out.println ("Digite o resultado do time 1: ");
			a = sc.nextInt ();
			
			System.out.println ("Digite o resultado do time 2: ");
			b = sc.nextInt ();
			
			if (a>b) {
				System.out.print("Time 1 ganhou!");
			} else if (b>a) {
				System.out.print("Time 2 ganhou!");
			} else {
				System.out.print("Empate!");
			}
	}
}
			
			