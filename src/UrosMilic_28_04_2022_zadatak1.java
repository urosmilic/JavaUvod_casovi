
import java.util.Scanner;

public class UrosMilic_28_04_2022_zadatak1 {
    public static void main(String[] args) {
        //1)Program koji racuna minimum od n ucitanih celih brojeva, gde je n > 0 dati prirodan broj.

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int n = s.nextInt();

        System.out.println();

        int [] niz = new int[n];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj u niz: ");
            niz[i] = s.nextInt();

            if (niz[i] > 0 && niz[i] < min) {
                min = niz[i];
            }
        }

        System.out.println();

        if (min != Integer.MAX_VALUE) {
            System.out.print("Minimum iznosi: " + min);
        } else {
            System.out.print("Niste uneli niti jedan prirodan broj!");
        }
    }
}