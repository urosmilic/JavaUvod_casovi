import java.util.Scanner;

public class IdeDoWhile {
    public static void main(String[] args) {
        // Korisnik unosi brojeve preko skenera i potrebno je racunati sumu dok
        // korisnik ne unese negativan broj- Koristiti DO WHILE

        Scanner s = new Scanner(System.in);
        int suma = 0;
        int broj;
        do {
            System.out.println("Unesite neki broj: ");
            broj = s.nextInt();
            suma += broj;

        } while (broj >= 0);

        System.out.println("Suma iznosi " + (suma - broj) );


    }
}
