// [1] Import class Scanner
import java.util.Scanner;

/*
    Program ini meminta dua angka riil dari pengguna
    lalu menghitung dan menampilkan nilai rata-rata
    dari dua angka tersebut.
*/
public class NilaiRatarata
{
    public static void main(String[] args)
    {
        // [2] Deklarasikan variabel untuk menyimpan angka 1, angka 2, dan rata-rata
        double angka1, angka2, rata_rata;

        // [3] Buat object Scanner
        Scanner scanner = new Scanner(System.in);

        // [4] Prompt pengguna untuk memasukkan angka 1 dan simpan ke variabel
        System.out.print("Masukkan angka pertama: ");
        angka1 = scanner.nextDouble();


        // [5] Prompt pengguna untuk memasukkan angka 2 dan simpan ke variabel
        System.out.print("Masukkan angka kedua: ");
        angka2 = scanner.nextDouble();



        // [6] Hitung rata-rata
        rata_rata = (angka1 + angka2) / (2);



        // [7] Tampilkan rata-rata dengan pembulatan dua desimal
        System.out.printf("Rata-rata = %.2f\n", rata_rata);

    }
}