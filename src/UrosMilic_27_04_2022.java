
import java.util.Scanner;

public class UrosMilic_27_04_2022
{
    public static void main(String[] args)
    {

        //Program koji ucitava prirodne brojeve sve dok ne bude unesen broj 0,
        //i odredjuje koliko je ucitanih brojeva parno, a koliko neparno.

        Scanner s = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Program ce izbrojati koliko ste uneli parnih a koliko neparnih brojeva. Nakon unosa brojeva, unesite nulu kako bi se program izvrsio.");

        while (a==0) {

            System.out.print("Unesite neki realan broj: ");
            int x = s.nextInt();


            if (x == 0) {
                break;
            }

            if (x % 2 == 0){
                b++;
            } else {
                c++;
            }

        }

        System.out.println("Ukupno parnih brojeva " + b);
        System.out.println("Ukupno neparnih brojeva " + c);

    }
}