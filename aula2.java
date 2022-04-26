import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n1 = 0; //num de eleitores
        int n2 = 0; // branco
        int n3 = 0; // nulo
        
      System.out.print("número de eleitores: ");
      n1 = sc.nextInt ();
      
      System.out.print("votos em branco: ");
      n2= sc.nextInt ();
      
      System.out.print ("votos nulos: ");
      n3= sc.nextInt ();
      
      int n4 = n2*100/n1;
    
      int n6 = n3*100/n1;
     
      int n7 = n1-n2;
      int n8 = n7-n3;
      int n9 = n8/n1;
      System.out.println ("porcentagem de votos em branco: " + n4 + "%");
      System.out.println ("porcentagem de votos nulos: " + n6 + "%");
      System.out.println ("porcentagem de votos válidos: " + n9 + "%");
    }
}
