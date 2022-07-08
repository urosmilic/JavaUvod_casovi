import java.util.Scanner;

public class SestiCas_obnova_gradiva_2 {
    public static void main(String[] args) {

        //Ponovi zadatak FizzBuzz ALI umesto od 1 do 100 koristite niz koji cete ucitati u program

        int [] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int i= 0; i < niz.length; i++) {

            if(niz[i] % 3 == 0 && niz[i] % 5 ==0) {
                System.out.println("fizzbuzz " + niz[i]);
            } else if (niz[i] % 3 == 0) {
                System.out.println("fizz " + niz[i]);
            } else if (niz[i] % 5 ==0) {
                System.out.println("buzz " + niz[i]);
            } else {
                System.out.println(niz[i]);
            }
        }



    }
}
