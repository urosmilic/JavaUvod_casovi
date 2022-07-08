import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Zadatak 4 - Preko skenera uneti dva broja i odstampati aritmeticku sredinu unetih brojeva

        Scanner s = new Scanner (System.in);

        System.out.println("Unesite neki celi broj");
        int x = s.nextInt();

        System.out.println("Unesite decimalni broj");
        double y = s.nextDouble();

        double z = (x + y) / 2;
        System.out.println("Aritmeticka sredina brojeva x i y iznosi: " + z + ".");




    }
}
