package Aula4;
import java.util.*;
public class Tarefa31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			double a;
			double b;
			double c;
			
			System.out.print("Lado 1: ");
			a = sc.nextDouble ();
			System.out.print("Lado 2: ");
			b = sc.nextDouble ();
			System.out.print("Lado 3: ");
			c = sc.nextDouble ();
			
			if (((a+b)<c) || ((b+c)<a) || ((c+a)<b)){
				System.out.print("Impossível ser um triângulo.");
			} else { 
				System.out.print ("É um Triângulo.");
			}
}
}