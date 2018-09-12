import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci il valore della prova scritta");
            int writeTest = scanner.nextInt(); // -8  8

            if (writeTest < -8 || writeTest > 8) {
                System.out.println("Il valore deve essere compreso tra -8 e 8");
                continue;
            }

            System.out.println("Inserisci il valore della prova orale");
            int oralTest = scanner.nextInt();

            if (oralTest < 0 || oralTest > 24) {
                System.out.println("Il valore deve essere compreso tra 0 e 24");
                continue;
            }

            int sum = writeTest + oralTest;

            if ((writeTest <= 0 && (sum > 18 || oralTest < 18))
                    || (writeTest > 0 && sum < 18)
                    ) {
                System.out.println("Lo studente è bocciato");
            } else if (sum == 31 || sum == 32) {
                System.out.println("Promosso con lode");
            } else {
                System.out.println("Promosso con " + sum);
            }

            System.out.println("Se vuoi calcolare un altra operazione premi 0");
            int response = scanner.nextInt();
            if (response != 0) {
                break;
            }

        }// chiusura while true

    }
}
