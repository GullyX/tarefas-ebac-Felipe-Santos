package Felipe.devdojo.conditionalstructures.ifs;

import java.util.Scanner;

public class AgesUsers {
    public static void main(String[] args) {

        Scanner board = new Scanner(System.in);
        System.out.println("Olá, Digite seu nome aqui...");
        String name = board.next();
        System.out.println("Agora digite sua idade...");
        int user = board.nextInt();

        if (user < 11) {
            System.out.println("O " + name + " se encaixa na categoria infantil!");
        } else if (user > 11 && user <= 15) {
            System.out.println("O "+name+" se encaixa na categoria Juvenil!");
        } else if (user > 15 && user <= 19) {
            System.out.println("O "+ name +" se encaixa na categoria pré adulto!");
        } else {
            System.out.println("O "+name +" se encaixa na categoria adulto!");
        }
    }
}

