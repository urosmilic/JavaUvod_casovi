
import java.util.Scanner;

public class UrosMilic_28_04_2022_zadatak2 {
    public static void main(String[] args) {
        //2)Napraviti program koji služi za prikupljanje proudžbine od korisnika, stavke porudžbine
        //smestiti u niz stringova a cenu u niz decimalnih brojeva. Potom odrediti najjefitniji i
        //najskuplji deo porudžbine. (Ispisati naziv stavke kao i cenu)

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj artikala koje zelite da narucite: ");
        int n = s.nextInt();

        String [] nizNaziv = new String [n];
        double [] nizCena = new double[n];

        double max = 0;
        double min = Double.MAX_VALUE;
        int pmin = 0;
        int pmax = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite naziv artikla: ");
            nizNaziv [i] = s.next();

            System.out.print("Unesite cenu artikla: ");
            nizCena [i] = s.nextDouble();

            if (nizCena [i] > max) {
                max = nizCena [i];
                pmax = i;
            }

            if (nizCena [i] < min) {
                min = nizCena [i];
                pmin = i;
            }

        }
        System.out.println();
        System.out.println("Najskuplji artikal je " + nizNaziv [pmax] + " sa cenom od " + max);
        System.out.println("Najjeftinijii artikal je " + nizNaziv [pmin] + " sa cenom od " + min);
    }
}
