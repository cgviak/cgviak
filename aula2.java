//exercicio 5
import java.util.Scanner; 
public class Main {
public static void main (String[] args) {
 Scanner sc = new Scanner (System.in);
 int n1 = 0;
 System.out.println("escolha um número: ");
 n1 = sc.nextInt ();
 
 System.out.print ("seu antecessor: ");
 System.out.println (n1-1);
 
System.out.print ("seu sucessor: ");
 System.out.println (n1+1);
}
}
