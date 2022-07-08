import java.util.Scanner;

public class probaNiz {
    public static void main(String[] args) {

/*
        Zadatak2: Napisati program koji racuna  aritmeticku sumu svih elemenata niza,
        od prvog elementa niza do n gde je n poslednji element niza ... u prevodu niz[0] + niz[1} + niz[2] + ... + niz[n] (edited)

        napisati program koji prvo samo stampa elemente niza
        onda smisliti kako da racunamo sumu
      */

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int n = s.nextInt();
        int [] niz = new int[n];
        int broj = 0;
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite vrednost u niz: ");
            broj = s.nextInt();
            suma += broj;
            System.out.println("Suma: " + suma);
        }
        System.out.println("Ukupna suma" + suma);
        System.out.println("Program je zavrsen!");









    }
}
