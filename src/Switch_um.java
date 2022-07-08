import java.util.Scanner;

public class Switch_um {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //unesite neki broj 1 ili 2 da bismo videli za koji klub navijate u Beogradu

        System.out.println("Unesite ime kluba: ");
        String klub = s.nextLine();
        klub = klub.toLowerCase();

        switch (klub) {
            case "crvena zvezda":
                System.out.println(1);
                break;

            case "partizan":
                System.out.println(2);
                break;

            default:
                System.out.println("Ne navijate ni za jedan od najvećih klubova iz Beograda");
                break;
        }










    }
}
