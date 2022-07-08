public class Java_vezba_1 {
    public static void main(String[] args) {
        //Zadatak 1) Napraviti niz koji ce sadrzati nazive gradove i treba odstampati sve gradove osim grada "Prag"

        String [] niz = {"Beograd", "Barselona", "Liverpool", "Prag", "Kijev"};

        for (int i = 0; i< niz.length; i++ ) {
            if (!niz[i].equals("Prag")) {        // (!a. equals(b)) format kod stringova
                System.out.println(niz[i]);
            } else {
                break;   //ovo radimo ako hocemo da odstampamo sve do Praga
            }
        }














    }
}
