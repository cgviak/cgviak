package aulasSenac;
import java.util.Scanner;
public class Tarefa21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = 0;
		int b = 0;
		System.out.println ("hor�rio de in�cio: ");
		a = sc.nextInt ();
		
		System.out.println ("hor�rio de conclus�o: ");
		b = sc.nextInt ();
		
		System.out.println ("tempo de jogo: "+(b-a)+" horas");
		
		if ((b-a)>24) {
			System.out.println ("jogo durou mais que o tempo m�ximo!");
		}
	}
}
