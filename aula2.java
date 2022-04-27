import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int x = 0; //salario mensal
        int y = 0; // reajuste
        
        System.out.println ("Defina o salário mensal do funcionário: ");
        x = sc.nextInt ();
        
        System.out.println ("Defina o Novo Salário: ");
        y = sc.nextInt ();

        //valor obtido x 100 / Valor total
        System.out.println ("Reajuste Percentual: " + (((y*100)/x)-100));
    }
}
