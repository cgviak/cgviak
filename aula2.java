import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
        int n1 = 0;
        System.out.println("defina o valor da base: ");
        n1 = sc.nextInt ();
        
        int n2 = 0;
        System.out.println("defina o valor da altura: ");
        n2 = sc.nextInt ();
        
        System.out.println ("valor da área:");
        System.out.print (n1*n2);
        
        int n3 = 0;
        System.out.println("defina o valor da circumferência: ");
        n3= sc.nextInt ();
        
        System.out.print ("valor da circumferência: ");
        System.out.print (3.14*n3*n3);
	}
}
