//25 de abril, 2022; aula2 https://www.onlinegdb.com/online_java_compiler

    import java.util.Scanner; //acessa biblioteca para coletar info de usuário
    
public class Main
{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in); //porta para usuário ceder dados
    
        int n1=0; //nova varíavel = 0
        System.out.print("Em que ano você nasceu? ");
        n1 = sc.nextInt(); //deixo vazio para usuário colocar, define novo valor da variável
        
        int n2= 0;
        System.out.print("Qual o mês? Em Número: "); //interessante add condicional, caso seja maior que 12 não aceitar
        n2 = sc.nextInt();
 
        int n3= 0;
        System.out.print("Qual o dia? "); //maior que 31 não aceitar
        n3 = sc.nextInt();

        System.out.print("Sua data de nascimento é: ");
        System.out.println(n3+"/"+n2+"/"+n1);
        
        System.out.print("Sua idade: ");
        System.out.println(2022-n1);
        
        int n4 =(2022-n1); //tarefa 7
        System.out.print("Sua idade em meses: ");
        System.out.println(n4*12);
        
        int n5 = (n4*12*30);
        System.out.print("Sua idade em dias: ");
        System.out.println (n5-n3);
        
  }
}

//atividades : aprender System.out.print e somar 2 números
