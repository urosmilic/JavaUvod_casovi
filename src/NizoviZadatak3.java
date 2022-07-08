import java.util.Scanner;

public class NizoviZadatak3 {
    public static void main(String[] args) {

        //Napisati program koji izracunava geometrijsku sumu parnih brojeva na neparnim indeksima:
        // niz[0] * niz[1] * ... * niz[n] (edited)

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int n = s.nextInt();
        int [] niz = new int[n];
        int i = 0;
        int suma = 1;

        while (i < n) {
            System.out.println("Unesite neki broj");
            niz [i] = s.nextInt();
            System.out.println("i iznosi " + i);

            if (i % 2 != 0 && niz[i] % 2 == 0) {
                suma *= niz[i];

            }

            i++;

        }
        System.out.println("Geometrijska suma iznosi: " + suma);









    }
}
