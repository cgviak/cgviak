package aulasSenac;
import java.util.Scanner;
public class Tarefa16 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		double maca = 0;
		System.out.println ("Digite a quantidade de ma��s a ser comprada: ");
		maca = sc.nextDouble ();
		
		if (maca>=12) {
			System.out.println ("Desconto de atacado! Cada ma�� sai por R$1,00");
			System.out.println ("valor total: R$" + (maca*1));
		} else {
			System.out.println ("Cada ma�� sai por R$1,30");
			System.out.println ("valor total: R$" + (maca*1.3));
		}
	}

}
