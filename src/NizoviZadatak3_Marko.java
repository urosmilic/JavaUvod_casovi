
import java.util.Scanner;

public class NizoviZadatak3_Marko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");

        String ime = "Milos";
        int duzinaNiza = scanner.nextInt();
        int[] korisnikovNiz = new int[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.printf("%s unosi broj na %d poziciji: ", ime, i);
            korisnikovNiz[i] = scanner.nextInt();
        }

        int suma = 1;
        for (int i = 0; i < duzinaNiza; i++) {
            if (i % 2 != 0 && korisnikovNiz[i] % 2 == 0) {
                suma *= korisnikovNiz[i];
            }
        }

        System.out.println("Geometrijska suma je " + suma);

    }
}