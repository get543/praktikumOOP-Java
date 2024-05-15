// [1] Import class Scanner
import java.util.Scanner;

/*
    Program ini menghitung keliling bujur sangkar
    dengan sisi dari input pengguna.
*/
public class KelilingBujurSangkar
{
    public static void main(String[] args)
    {
        // [2] Deklarasikan variabel untuk menyimpan sisi dan keliling
        int sisi;
        int keliling;

        // [3] Buat object Scanner untuk membaca input keyboard
        Scanner scanner = new Scanner(System.in);


        // [4] Prompt pengguna untuk menginput sisi dan tugaskan
        // nilai yang diinput ke variabel sisi
        System.out.print("Masukkan sisi (cm): ");
        sisi = scanner.nextInt();


        // [5] Hitung keliling dari sisi yang diinput pengguna
        keliling = 4 * sisi;



        // [6] Tampilkan keliling bujur sangkar
        System.out.println("Keliling bujur sangkar adalah " + keliling + " cm.");

    }
}
