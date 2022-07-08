import java.util.Scanner;

public class UrosMilic_26_04_2022 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite kalendarsku godinu: ");
        int godina = s.nextInt();

        if (godina % 4 == 0 && (godina % 100 != 0 || godina % 400 == 0)) {

            System.out.println("Godina je prestupna");

        }  else {

            System.out.println("Godina nije prestupna");
        }















    }
}
