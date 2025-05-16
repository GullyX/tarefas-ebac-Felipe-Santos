 import java.util.Scanner;  public class MEDIA2 {

     public static void main(String args[]) {
         Scanner s = new Scanner(System.in);
         System.out.println("Vamos calcular sua média, digite sua nota de 1 a 10 abaixo ");
         System.out.print("Digite sua primeira nota: ");
         int nota = s.nextInt();
         System.out.print("Digite sua segunda nota: ");
         int nota2 = s.nextInt();
         System.out.print("Digite sua terceira nota: ");
         int nota3 = s.nextInt();
         System.out.print("Digite sua quarta nota: ");
         int nota4 = s.nextInt();

         int mediamain = nota + nota2 + nota3 + nota4;
         mediamain = mediamain / 4;

         if (mediamain >= 7) {
             System.out.println("Você foi aprovado com a nota:" + mediamain);
         } else if (mediamain >= 5) {
             System.out.println("Você esta de recuperação com a nota:" + mediamain);
         } else{ System.out.println("Você foi reprovado com a nota:" + mediamain);}

     }
 }
