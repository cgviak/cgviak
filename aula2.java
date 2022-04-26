import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int x = 0; //salario mensal
        int y = 0; // reajuste
        
        System.out.println ("Defina o salário mensal do funcionário: ");
        x = sc.nextInt ();
        
        System.out.println ("Defina o reajuste previsto (porcentagem): ");
        y = sc.nextInt ();
        
        int z = y/100;
        int a = z*x;
        int b = a+x;
        
        System.out.println ("Novo salario: " + b);
    }
}
