package Felipe.devdojo.conditionalstructures.switchcase;

import java.util.Scanner;

public class ClassRoomOneDaysOfTheWeeks {
    public static void main(String[] args) {
        Scanner board = new Scanner(System.in);
        System.out.println("Digite um número para representar um dia da semana...");
        int day = board.nextInt();
        switch (day) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");

        }

        System.out.println("Fim do programa.");
    }
}



