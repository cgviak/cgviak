//tarefa 12
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        float c = 0; //celsius
        
        System.out.println ("Qual a temperatura em Celsius? ");
        c = sc.nextInt();
        
        System.out.println ("Em Farenheit: " +(((c*9)/5)+32));
        System.out.println ("Em Kelvin: " + (c+273));
    }
}
