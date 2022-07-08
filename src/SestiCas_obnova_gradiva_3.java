public class SestiCas_obnova_gradiva_3 {
    public static void main(String[] args) {

        //Napravite niz koji ima elemente od 1 do 100 ukljucujuci 100 ali NE PESKE. int[] niz = {1, 2,... 100} // NE OVAKO

        int [] niz = new int[100];

        for (int i= 0; i < 100; i++) {

            niz[i] = i+1;
        }
        System.out.println("Prvi element niza nosi vrednost " + niz[0]);

        System.out.println("Poslednji element niza nosi vrednost " + niz[99]);

    }
}
