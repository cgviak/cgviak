//aula 5 02/05/2022 switch case
package aulasSenac;
import java.util.*;
public class Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		byte dia;
		byte mes;
		
		System.out.print("Determine o dia: ");
		dia = sc.nextByte ();
		
		System.out.print("Determine o m�s: ");
		mes = sc.nextByte ();
		System.out.print("Seu signo �: ");
		
		switch (mes) {
		case 1:
			if (dia<=19) {
				System.out.print("Capric�rnio.");
			} else {
				System.out.print("Aqu�rio.");
			}
			break;
		case 2:
			if (dia<=18) {
				System.out.print("Aqu�rio.");
			} else {
				System.out.print("Peixes.");
			}
			break;
		case 3:
			if (dia<=20) {
				System.out.print("Peixes.");
			} else {
				System.out.print("�ries.");
			}
			break;
		case 4:
			if (dia<=20) {
				System.out.print("�ries.");
			} else {
				System.out.print("Touro.");
			}
			break;
		case 5:
			if (dia<=20) {
				System.out.print("Touro.");
			} else {
				System.out.print("G�meos.");
			}
			break;
		case 6:
			if (dia<=20) {
				System.out.print("G�meos.");
			} else {
				System.out.print("C�ncer.");
			}
			break;
		case 7:
			if (dia<=22) {
				System.out.print("C�ncer.");
			} else {
				System.out.print("Le�o.");
			}
			break;
		case 8:
			if (dia<=22) {
				System.out.print("Le�o.");
			} else {
				System.out.print("Virgem.");
			}
			break;
		case 9:
			if (dia<=22) {
				System.out.print("Virgem.");
			} else {
				System.out.print("Libra.");
			}
			break;
		case 10:
			if (dia<=22) {
				System.out.print("Libra.");
			} else {
				System.out.print("Escorpi�o.");
			}
			break;
		case 11:
			if (dia<=21) {
				System.out.print("Escorpi�o.");
			} else {
				System.out.print ("Sagit�rio.");
			}
			break;
		case 12:
			if (dia<=22) {
				System.out.print("Sagit�rio.");
			} else {
				System.out.print("Capric�rnio.");
			}
			break;
		default:
			System.out.print("valor inv�lido.");
		}
		}
}