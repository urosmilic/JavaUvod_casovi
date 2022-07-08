import java.util.Scanner;

public class Java_vezba_4 {
    public static void main(String[] args) {
//Zadatak 4 - Unositi brojeve sve dok se ne unesu dva ista broja za redom,
// nakon toga prikazati sumu svih prethodno unetih brojeva

        Scanner s = new Scanner(System.in);
        int broj = 1;
        int suma = 0;
        int broj2 = 0;
        boolean provera = true;

        while (true) {
            System.out.println("Unesite ceo broj: ");
            broj = s.nextInt();
            if (broj2 == broj) {
                provera = true;
                break;
            }

            suma += broj;

            broj2 = broj;

        }

        if (provera = true) {
            suma += broj;
        }

        System.out.println("Suma je " + suma);






    }
}
