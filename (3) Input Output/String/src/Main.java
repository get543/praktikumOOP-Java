public class Main {
    public static void main(String[] args) {
        String namaDepan = "Budi";
        String namaBelakang = "Susilo";
        String namaLengkap = namaDepan + namaBelakang;
        System.out.println(namaLengkap);

        String sapa = "Selamat pagi, ";
        String nama = "Budi Susilo";
        System.out.println(sapa + nama + "!");

//        String nama = "Budi Susilo";
        int panjangString = nama.length();
        System.out.println(nama + " mempunyai panjang " + panjangString + " karakter.");


//        Escape sequence
        System.out.println("\tKopi\t");
        System.out.println("\nYes\n");
        System.out.println("C:\\iiugjkh");
        System.out.println("\tKopi\t");
    }
}