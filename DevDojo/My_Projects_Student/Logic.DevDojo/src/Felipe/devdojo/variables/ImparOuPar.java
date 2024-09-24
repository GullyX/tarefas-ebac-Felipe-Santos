package Felipe.devdojo.variables;/*dado um determinado número inteiro, imprima se ele é impar
ou par
 */

public class ImparOuPar {
    public static void main(String[] args) {
        int par = 11;
        int result = par % 2;

        if(result == 0){
            System.out.println("O número digitado é par! | No caso: "+ par);

        }
        else{
            System.out.println("O número digitado é impar! | No caso: "+ par );
        }


    }


}

