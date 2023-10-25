package Tugaspraktikum3_;
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mat = new Matematika2();

        System.out.println("Hasil dari Tambah  = " + mat.tambah(20, 10));
        System.out.println("Hasil dari Kurang  = " + mat.kurang(10, 5));
        System.out.println("Hasil dari Kali    = " + mat.kali(10, 3));
        System.out.println("Hasil dari Bagi    = " + mat.bagi(21, 2));
        System.out.println("Hasil dari Modulus = " + mat.modulus(21, 2));
    }
}

