import java.util.Scanner;

public class LuasRuangan
{
    public static void main(String[] args)
    {
        /* PENGETESAN UNTUK CLASS YANG SUDAH DI BUAT ISENG AJA */
        double totalLuas;
        Scanner keyboard = new Scanner(System.in);

        // Buat tiga object PersegiPanjang
        PersegiPanjang dapur = new PersegiPanjang();
        PersegiPanjang kamarTidur = new PersegiPanjang();
        PersegiPanjang ruangKerja = new PersegiPanjang();

        // Dapatkan dimensi dari dapur
        System.out.print("Masukkan panjang dapur: ");
        dapur.setPanjang(keyboard.nextDouble());

        System.out.print("Masukkan lebar dapur: ");
        dapur.setLebar(keyboard.nextDouble());

        System.out.print("Masukkan panjang kamar tidur: ");
        kamarTidur.setPanjang(keyboard.nextDouble());

        System.out.print("Masukkan lebar kamar tidur: ");
        kamarTidur.setLebar(keyboard.nextDouble());

        System.out.print("Masukkan panjang ruang kerja: ");
        ruangKerja.setPanjang(keyboard.nextDouble());

        System.out.print("Masukkan lebar ruang kerja: ");
        ruangKerja.setLebar(keyboard.nextDouble());

        // Tampilkan total luas
        totalLuas = dapur.getLuas() + kamarTidur.getLuas() + ruangKerja.getLuas();

        System.out.println("Total luas dari tiga ruang adalah " + totalLuas);


        /* SOAL MODUL NOMOR 3 */
        PersegiPanjang r1 = new PersegiPanjang();
        PersegiPanjang r2 = new PersegiPanjang();

        r1.setPanjang(5.0);
        r2.setPanjang(10.0);
        r1.setLebar(20.0);
        r2.setLebar(15.0);

        System.out.println(r1.getPanjang()); // a
        System.out.println(r1.getLebar()); // b
        System.out.println(r2.getPanjang()); // c
        System.out.println(r2.getLebar()); // d

    }
}
