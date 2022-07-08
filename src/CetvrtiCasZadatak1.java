import java.util.Scanner;

public class CetvrtiCasZadatak1 {
    public static void main(String[] args) {

        //Zadatak 1 - Preko skenera uneti tri broja. Prvi broj ce odredjivati funkciju druga dva broja.
        // Ako se unese broj 1 onda druga dva moraju da se saberu, ako se unese 2 onda se od drugog oduzima treci,
        // ako se unese 3 onda se mnoze, ako se unese 4 onda se dele

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj (1-4): ");
        int broj1 = s.nextInt();

        System.out.println("Unesite drugi broj: ");
        double broj2 = s.nextDouble();

        System.out.println("Unesite treci broj: ");
        double broj3 = s.nextDouble();

        switch (broj1) {
            case 1:
                System.out.println("Zbir drugog i treceg broja iznosi " + (broj2 + broj3));
                break;
            case 2:
                System.out.println("Razlika drugog i treceg broja iznosi " + (broj2 - broj3));
                break;
            case 3:
                System.out.println("Proizvod drugog i treceg broja iznosi " + (broj2 * broj3));
                break;
            case 4:
                System.out.println("Kolicnik drugog i treceg broja iznosi " + (broj2 / broj3));
                break;
            default:
                System.out.println("Niste ispravno uneli prvi broj!");

        }

    }
}
