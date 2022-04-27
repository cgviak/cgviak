//tarefa 10
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int x = 0; //valor do carro
        
        System.out.println ("Qual é o preço de fábrica do carro?");
        x= sc.nextInt ();
        
        double y = x* 0.28; //percentual do distribuidor
        System.out.println ("percentual do distribuidor: " + y);
        
        double z = x*0.45; //impostos
        System.out.println ("tributação: " + z);
        
        System.out.println ("Valor total do carro: " + (x+y+z));
    }
}
