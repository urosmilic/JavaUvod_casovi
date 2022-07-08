import java.util.Scanner;

public class Java_vezba_2 {
    public static void main(String[] args) {
        //// Zadatak 2 - Napisati program gde korisnik (djak) unosi poslednjih 5 ocena,
        //// ako ima sve petice program vrati poruku "Odlican djak",
        //// ako nema sve petice vraca poruku "Nije odlican djak"

        Scanner s = new Scanner(System.in);
        int ocena;
        int suma = 0;
        boolean tacno = true;

        for ( int i = 1; i <=5; i++) {
            System.out.println("Unesi ocenu: ");
            ocena = s.nextInt();
            if (ocena < 1 || ocena > 5) {
                System.out.println("Pogresno ste uneli ocenu!");
                tacno = false;
                break;
            }
            suma += ocena;
        }

        if (tacno  && suma == 25) {
            System.out.println("Odlican djak!");
        }  else if (tacno) {
            System.out.println("Nije odlican djak!");
        }

        System.out.println("Program je zavrsen!");
    }
}
