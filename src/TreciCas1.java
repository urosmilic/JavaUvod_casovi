import java.util.Scanner;

public class TreciCas1 {
    public static void main(String[] args) {

        System.out.println("Unesi broj veci od 10");
        Scanner sc = new Scanner(System.in);

        int broj = sc.nextInt();

        if (broj >= 10) {
            System.out.println("Broj je veci od 10");
        }

        System.out.println("Kraj programa");

    }
}