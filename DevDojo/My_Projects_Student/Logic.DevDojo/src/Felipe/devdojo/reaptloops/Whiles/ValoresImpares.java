package Felipe.devdojo.reaptloops.Whiles;

import java.util.Scanner;

public class ValoresImpares {
    public static void main(String[] args) {
        Scanner board = new Scanner(System.in);
        System.out.println("Digite um número");
        int numbers = board.nextInt();
        int contador = 1;
        while(contador <= numbers){
            System.out.println(contador);
            contador = contador + 2;
        }
    }
}
