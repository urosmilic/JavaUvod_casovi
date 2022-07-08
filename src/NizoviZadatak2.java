import java.util.Scanner;

public class NizoviZadatak2 {
    public static void main(String[] args) {

/*
        Zadatak2: Napisati program koji racuna  aritmeticku sumu svih elemenata niza,
        od prvog elementa niza do n gde je n poslednji element niza ... u prevodu niz[0] + niz[1} + niz[2] + ... + niz[n]

        napisati program koji prvo samo stampa elemente niza
        onda smisliti kako da racunamo sumu
*/

        int [] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        int n = niz.length;
        int suma = 0;
        while (i < n) {
            System.out.println(niz[i]);
            suma += niz[i];
            System.out.println("Suma u " + i + " krugu iznosi: "+ suma);
            i++;
        };
        System.out.println("Ukupna suma: "+ suma);


    }
}
