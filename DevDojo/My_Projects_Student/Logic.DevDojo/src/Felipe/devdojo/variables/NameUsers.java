package Felipe.devdojo.variables;

import java.util.Scanner;

public class NameUsers {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Digte o nome de usúario... ");
        String userName = user.next();

        if (userName == null || userName.equals(" ")) {
            System.out.println("Campo Obrigatório");
        } else if (userName.equals("admin") || userName.equals("administrador ")) {
            System.out.println("Usuário inválido");
        } else {
            System.out.println(userName + " Cadrastado com sucesso");
        }


    }

}
