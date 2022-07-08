import java.util.Scanner;

public class Java_vezba_3 {
    public static void main(String[] args) {
////Zadatak 3 - Uneti dvocifren broj i prikazati prvu i drugu cifru

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dvocifren broj");
        int broj = s.nextInt();

        int ostatak2 = broj % 10;   //72 / 10 = 7    ostatak 2

        broj = broj / 10;           //72 / 10 =  7 int

        int ostatak1 = broj % 10;   // 7 / 10 = 0   ostatak 7

        System.out.println("Prva cifra je " + ostatak1 + ", dok je druga cifra " + ostatak2);















    }
}
