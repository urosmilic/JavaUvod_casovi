import java.util.Scanner;

public class Java_vezba_8 {
    public static void main(String[] args) {

        //Zadatak 8 - Napisati niz od 10 brojeva koji ce se sabirati do 100, kada predje 100 treba ispisati za koliko je presao
        //Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
        //Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"

        Scanner s = new Scanner(System.in);
        int suma = 0;
        int broj = 0;
        int konacno = 0;

        for (int i = 1; i<= 10; i++) {
            System.out.println("Unesite " + i + ". broj: ");
            broj = s.nextInt();
            suma+= broj;

            if (suma > 100){
                System.out.println("Presli ste granicu za "+ (suma - 100));
                break;
            }


        }





    }
}
