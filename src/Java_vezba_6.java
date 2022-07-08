import java.util.Scanner;

public class Java_vezba_6 {
    public static void main(String[] args) {
//Zadatak 6 - Napraviti jednocifreni niz (od 1 do 9), zatim potrebno je napraviti drugi niz
//koji ce sadrzati prva tri parna broja prvog niza

        int [] niz1 = {1,2,3,4,5,6,7,8,9};
        int [] niz2 = new int [3];
        int i;
        int j = 0;

        for (i = 0; i< niz1.length; i++) {
            if (niz1[i] % 2 == 0 && j<=2) {
                niz2[j] = niz1[i];
                j++;
            }
        }

        System.out.println( niz2[0] + " " + niz2[1]+ " " + niz2[2]);










    }
}
