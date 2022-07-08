import java.util.Scanner;

public class TreciCasZadatak3 {
    public static void main(String[] args) {

        //Zadatak 3 - Imamo dve kockice ispred nas (plava i crvena), preko skenera treba uneti koju kockicu bacamo i koji broj smo dobili.
        // Ako bacimo plavu kockicu i dobijemo 1, onda dobijamo 1 poen, ako dobijemo 2 onda dobijamo 2 poena, ako dobijemo 3,4,5 ili 6 onda dobijamo 10 poena.
        // Crvena kockica ima ista pravila kao i plava samo sto donosi duplo vise poena.

        Scanner s = new Scanner(System.in);

        System.out.println("Izaberite kockicu (crvena ili plava): ");
        String kocka = s.next();

        System.out.println("Koji broj ste bacili (1-6): ");
        int broj = s.nextInt();

        if (kocka.equals("plava") && broj == 1) {
            System.out.println("Dobili ste 1 poen");
        } else if (kocka.equals("plava") && broj == 2) {
            System.out.println("Dobili ste 2 poena");
        } else if (kocka.equals("plava") && ( broj == 3 || broj == 4 || broj == 5 || broj == 6)) {
            System.out.println("Dobili ste 10 poena");
        } else if (kocka.equals("crvena") && broj == 1) {
            System.out.println("Dobili ste 2 poena");
        } else if (kocka.equals("crvena") && broj == 2) {
            System.out.println("Dobili ste 4 poena");
        } else if (kocka.equals("crvena") && ( broj == 3 || broj == 4 || broj == 5 || broj == 6)) {
            System.out.println("Dobili ste 20 poena");
        } else {
            System.out.println("Uneli ste pogresnu boju kockice ili broj");
        }

    }
}
