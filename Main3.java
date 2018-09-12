import java.util.Scanner;

public class Main3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il valore di *");
        int x = scanner.nextInt();
        /* costuiamo la stringa iniziale */
        String asterix = "";
        for (int i = 0; i< x; i++) {
            asterix = asterix + "*";
        }

        /* stampiamo la figura */
        for (int j=0; j<x; j++) {
            System.out.println(asterix);
            asterix = asterix.substring(0, asterix.length() - 1);
        }


        String sharp = "";
        for (int k=0; k<x; k++) {
            sharp = sharp + "#";
            System.out.println(sharp);
        }
    }
}
