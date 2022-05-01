package Aula4;
import java.util.*;
public class Tarefa30 {
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
		System.out.print("Os dois maiores números são: ");
		
		if ((a>b) && (a>c) && (b>c)) {
			System.out.print(a+" e "+b);
		} else if ((a>b) && (a>c) && (c>b)) {
			System.out.print(a+" e "+c);
		} else if ((b>a) && (b>c) && (a>c)) {
			System.out.print(a+" e "+b);
		} else if ((b>a) && (b>c) && (c>a)) {
			System.out.print(b+" e "+c);
		} else if ((c>a) && (c>b) && (b>a)) {
			System.out.print(c+" e "+b);
		} else {
			System.out.print (c+" e "+a);
		}

	}

}
