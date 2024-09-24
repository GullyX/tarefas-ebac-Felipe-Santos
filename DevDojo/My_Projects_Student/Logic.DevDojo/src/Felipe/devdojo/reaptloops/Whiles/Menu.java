package Felipe.devdojo.reaptloops.Whiles;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner board = new Scanner(System.in);
        System.out.println("1. Calcular imposto... \n" +
                "2. Deposistar sálario\n" + "3. Sair\n" + "Digite o número desejado...\n");

        int optionInt = board.nextInt();
        while (optionInt > 4) {
          switch(optionInt){
              case '1':
                  System.out.println("Calculando imposto...");
          }
        }
    }
}
