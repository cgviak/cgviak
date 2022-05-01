package Aula4;
import java.util.*;
public class Tarefa33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			int a; 
			int b;
					
			System.out.println ("Digite o número 1: ");
			a = sc.nextInt ();
			
			System.out.println ("Digite o número 2: ");
			b = sc.nextInt ();
			
			if (a>b) {
				System.out.print(a+">"+b);
			} else if (b>a) {
				System.out.print(b+">"+a);
			} else {
				System.out.print(b+"="+a);
			}
	}
}