package aulasSenac;
import java.util.Scanner;
public class Tarefa22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = 0;
		double b = 0;
		
		System.out.print("informe as horas trabalhadas: ");
		a = sc.nextDouble();
		
		System.out.print("informe o sal�rio por hora ");
		b= sc.nextDouble ();
		
		if (a>40) {
			System.out.println("Trabalhador ganhar� adicional de 50%");
			System.out.println ("Sal�rio: R$"+((a*b*0.5)+(a*b)));
		}else {
			System.out.println ("Sal�rio: R$"+ (a*b));
		}
	}
}
