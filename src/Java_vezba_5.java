public class Java_vezba_5 {
    public static void main(String[] args) {
//Zadatak 5 - Napraviti dva niza i prikazati koji niz ima vise clanova, a koji niz ima vecu sumu

        int [] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] niz2 = {1, 2, 3, 4, 5, 100};
        int suma1 = 0;
        int suma2 = 0;


        if (niz1.length > niz2.length) {
            System.out.println("Prvi niz je duži.");
        } else {
            System.out.println("Drugi niz je duži.");
        }

        for (int i = 0; i < niz1.length; i++) {
            suma1 += niz1[i];
        }

        for (int i = 0; i < niz2.length; i++) {
            suma2 += niz2[i];
        }

        if (suma1 > suma2) {
            System.out.println("Prvi niz ima vecu sumu.");
        } else {
            System.out.println("Drugi niz ima vecu sumu.");
        }







    }
}
