package Felipe.devdojo.conditionalstructures.ifs;

import java.util.Scanner;

public class MandatorySex {
    public static void main(String[] args) {
        Scanner sexAge = new Scanner(System.in);
        System.out.println("Olá iremos dizer se o candico se encaixa no serviço militar obrigatório");
        System.out.println("Primeiramente digite o seu sexo...");
        String optionSex = sexAge.next();


        // Linha para rezevar os sexos
        if (optionSex.equalsIgnoreCase("Masculino") || optionSex.equalsIgnoreCase("Feminino") || optionSex.equalsIgnoreCase("M") || optionSex.equalsIgnoreCase("F")) {
            System.out.println("Agora digite a sua idade...");
            int age = sexAge.nextInt();
            if (optionSex.equalsIgnoreCase("Masculino") || optionSex.equalsIgnoreCase("M") && age >= 18) {
                System.out.println("Alistamento Obrigatório");
            } else if (optionSex.equalsIgnoreCase("Masculino") || optionSex.equalsIgnoreCase("M") && age <= 18) {
                System.out.println("Alistamento não permitido!");
            } else if (optionSex.equalsIgnoreCase("Feminino") || optionSex.equalsIgnoreCase("F") && age >= 18) {
                System.out.println("Alismento permitido, Porém não obrigatório. Deseja se alistar? ");
            } else if (optionSex.equalsIgnoreCase("Feminino") || (optionSex.equalsIgnoreCase("F") && age <= 18)) {
                System.out.println("Alismento não permintido!");
            }
        } else {
            System.out.println("Opção inválida");
        }
    }
}
