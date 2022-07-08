import java.util.Scanner;

public class probaNiz3 {
    public static void main(String[] args) {
        //Napisati program koji izracunava geometrijsku sumu parnih brojeva na neparnim indeksima:
        // niz[0] * niz[1] * ... * niz[n] (edited)

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int n = s.nextInt(); //duzina niza
        int broj;
        int suma = 1;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite celi broj na idexu " + i + " : ");
            broj = s.nextInt();
            if (broj %2 == 0 && i%2 !=0) {
                suma *= broj;
            }

        }
        System.out.print("Suma iznosi: " + suma);











    }
}
