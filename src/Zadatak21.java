
import java.util.Scanner;

public class Zadatak21 {
    public static void main(String[] args) {

        //Program koji racuna minimum od n ucitanih celih brojeva, gde je n > 0 dati prirodan broj.

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = s.nextInt();
        int i = 1;

        while (broj <= 0){
            System.out.print("Unesite broj veci od nule: ");
            i++;
        }

        int min = broj;

        while (broj > 0) {
            if (min > broj) {
                min = broj;
            }
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
        }

        System.out.print("Najmanji broj je " + min);















    }
}
