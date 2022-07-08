public class Nizovi2_petlje {
    public static void main(String[] args) {

        int [] nizA = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int index = 0;  //i, j....
        while (index < 10) {  // (index < nizA.lenght)
            System.out.println(nizA[index]);
            index++; // brojac se povecava za 1
        }

        System.out.println("Kraj programa");

        for (int i = 0; i < nizA.length; i++) {
            System.out.println(nizA[i]);
        }



    }
}
