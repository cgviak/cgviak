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
        System.out.print("Qual o mês? Em Número: ");
        n2 = sc.nextInt();
 
        int n3= 0;
        System.out.print("Qual o dia? ");
        n3 = sc.nextInt();

        System.out.println("Sua data de nascimento é: "+n3+"/"+n2+"/"+n1);
        System.out.println ("Sua idade: "+ (2022-n1));
         //tarefa 7
        System.out.println("Sua idade em meses: "+ ((2022-n1)*12));
        System.out.print("Sua idade em dias: "+ ((2022-n1)*12*30-n3));
  }
}

//atividades : aprender System.out.print e somar 2 números
