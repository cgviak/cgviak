package Aula4;
import java.util.*;
public class Tarefa29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a; 
		int b; 
		int c;
		
		System.out.print("Número 1: ");
		a = sc.nextInt ();
		System.out.print("Número 2: ");
		b = sc.nextInt ();
		System.out.print("Número 3: ");
		c = sc.nextInt ();
		System.out.print("A soma dos dois maiores números é: ");
		
		if ((a>b) && (a>c) && (b>c)) {
			System.out.print(a+b);
		} else if ((a>b) && (a>c) && (c>b)) {
			System.out.print(a+c);
		} else if ((b>a) && (b>c) && (a>c)) {
			System.out.print(a+b);
		} else if ((b>a) && (b>c) && (c>a)) {
			System.out.print(b+c);
		} else if ((c>a) && (c>b) && (b>a)) {
			System.out.print(c+b);
		} else {
			System.out.print (c+a);
		}
	}

}
