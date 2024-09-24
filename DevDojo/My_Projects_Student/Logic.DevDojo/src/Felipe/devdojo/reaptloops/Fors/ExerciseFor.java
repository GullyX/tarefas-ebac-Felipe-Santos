package Felipe.devdojo.reaptloops.Fors;

public class ExerciseFor {
    public static void main(String[] args) {
        for (int y = 0; y <= 10; y++) {
            System.out.println("Fazendo a tabuado do número: "+ y);
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " X " + y + "= "+ i * y);
            }
        }
    }
}
