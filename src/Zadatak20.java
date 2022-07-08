import java.util.Scanner;

public class Zadatak20 {
    public static void main(String[] args) {
//Zadatak 4 - Unositi brojeve sve dok se ne unesu dva ista broja za redom,
// nakon toga prikazati sumu svih prethodno unetih brojeva
        Scanner s = new Scanner(System.in);

        int nultiBroj = 0;
        int suma = nultiBroj;

        for (int i = 0; i > -1; i++) {

            System.out.println("Unesite broj: ");

            int broj1 = s.nextInt();

            suma = suma + broj1;

            if (broj1 != nultiBroj) {
                nultiBroj = broj1;
            }
            else {
                break;
            }
        }
        System.out.println("Suma unetih broja je " + suma);














    }
}