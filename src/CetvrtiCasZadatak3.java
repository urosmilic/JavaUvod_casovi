import java.util.Scanner;

public class CetvrtiCasZadatak3 {
    public static void main(String[] args) {

        //Zadatak 3 - Prikazati sve dvocifrene brojeve deljive sa 3 - Koristiti FOR
        //Zadatak 4 - Prikazati aritmeticku sredinu od 1 do N - Koristiti WHILE
        //Zadatak 5 - Korisnik unosi brojeve preko skenera i potrebno je racunati sumu
        // dok korisnik ne unese negativan broj - Koristiti DO WHILE

        /*for (int i = 10; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }*/
//---------------------------------------------------------------------------------------------------------------------
        /*Scanner s = new Scanner (System.in);
        System.out.println("Unesite vrednost N: ");
        int n = s.nextInt();
        int i = 1;
        int suma = 0;
        double artSredina = 1;

        while(i < n) {
            suma = suma + i;
            i++;
            artSredina = 1.0 * (suma) / (n-1);
        }
        System.out.println("Aritmeticka sredina iznosi: " + artSredina);*/

        //---------------------------------------------------------------------------------------------------------------------

        //Zadatak 6 - Nacrtajte trougao sa N redova

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj redova");

        int n = s.nextInt();
        String zvezdica = "*";
        String red;
        for (int i =1; i <= n; i++) {

            System.out.println(zvezdica);

        }



        System.out.println("Kraj programa.");




    }
}
