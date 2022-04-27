//tarefa 13
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        float a = 0; //prova 1
        float b = 0; //prova 2
        float c = 0; //prova 3
        System.out.println ("Qual a nota da prova 1? ");
        a = sc.nextInt();
        
        System.out.println ("Qual a nota da prova 2? ");
        b = sc.nextInt();
        
        System.out.println ("Qual a nota da prova 3? ");
        c = sc.nextInt();
        
        System.out.println ("Média final: " + (((a*2)+(b*3)+(c*5))/10));
    }
}
