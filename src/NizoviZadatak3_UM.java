
import java.util.Scanner;

public class NizoviZadatak3_UM
{
    public static void main(String[] args)
    {
        //Napisati program koji izracunava geometrijsku sumu
        //parnih brojeva na neparnim indeksima: niz[0] * niz[1] * ... * niz[n]

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite duzinu niza: ");

        int n = scanner.nextInt();         //duzina niza
        int[] niz = new int[n];           //pravljenje niza

        int suma = 1;

        for (int i = 0; i < n; i++) {

            System.out.print("Unesi broj na " + i + " poziciji: ");

            niz[i] = scanner.nextInt();

            if (i % 2 != 0 && niz[i] % 2 == 0) {
                suma *= niz[i];
            }

            System.out.println("Suma u " + i + " krugu iznosi: " + suma);
            System.out.println();         //oznacava prazan red - radi preglednosti
        }

        System.out.println("Geometrijska suma je " + suma);

    }
}