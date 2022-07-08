import java.util.Scanner;

public class Java_vezba_7 {
    public static void main(String[] args) {
        //Zadatak 7 - Napraviti niz i prikazati njegov najveci i najmanji clan

        int [] niz = {1,2,3,4,5,6,3,0};
        int max = niz[0];
        int min = niz[0];

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
            if (niz[i] < min) {
                min = niz[i];
            }

        }

        System.out.println("Najveci clan je: " + max);
        System.out.println("Najmanji clan je: " + min);



















    }
}
