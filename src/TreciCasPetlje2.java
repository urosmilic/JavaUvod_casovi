import java.util.Scanner;

public class TreciCasPetlje2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Unesite " + i + ". broj. Ako unesete broj 0 program ce se zatvoriti.");
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
        }

        System.out.println("Kraj programa");

    }
}
