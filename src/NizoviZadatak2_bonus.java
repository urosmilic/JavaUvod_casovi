import java.util.Scanner;

public class NizoviZadatak2_bonus {
    public static void main(String[] args) {

        //*bonus napravite da se elementi niza i duzina niza ucitava preko skenera

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int a = s.nextInt();

        int [] niz2 = new int[a];
        int b = 0;
        int suma = 0;

        while (b < a) {
            System.out.println("Unesite element niza: ");
            niz2 [b] = s.nextInt();
            suma += niz2[b];
            b++;
        }
        System.out.println("Suma elemenata niza iznosi: " + suma);

        //**testirajte program tako da napisete ocekivaniRezultat == stvariRezultat sa barem 3 test case-a




    }
}
