package aulasSenac;
import java.util.Scanner;
public class Tarefa18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = 0;
		int b = 0;
		
		System.out.println ("Digite o ano de nascimento: ");
		a = sc.nextInt ();
		
		System.out.println ("Digite o ano atual: ");
		b = sc.nextInt ();
		
		if ((b-a)>=16) {
			System.out.println ("Eleitor apto a votar.");
		} else {
			System.out.println ("Eleitor muito jovem, Inapto a votar");
		}


	}

}
