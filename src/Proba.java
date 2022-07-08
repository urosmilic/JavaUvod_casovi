import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);


        //Zadatak 4 - Prikazati aritmeticku sredinu od 1 do N - Koristiti WHILE

        /*System.out.println("Unesite vrednost n: ");
        int n = s.nextInt();
        int i = 1;
        double suma = 0;

        while (i <= n) {

            suma += i;
            System.out.println("Suma iznosi: " + suma);
            i++;

        }

        System.out.println("Ukupna suma iznosi" + suma);
        double artSredina = suma / n;

        System.out.println("Aritmeticka sredina iznosi: " + artSredina);*/

        //Zadatak 5 - Korisnik unosi brojeve preko skenera i potrebno je racunati sumu dok korisnik ne unese negativan broj- Koristiti DO WHILE



        int a;
        int suma = 0;
        do {
            System.out.println("Unesite neki broj a: ");
            a = s.nextInt();
            suma = suma + a;
            System.out.println("Suma " + suma);

        } while (a >= 0);

        suma = suma - a;
        System.out.println("Konacna suma " + suma);







































    }
}
