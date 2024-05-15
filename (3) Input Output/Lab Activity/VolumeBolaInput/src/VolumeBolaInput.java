// [1] Import class Scanner
import java.util.Scanner;

/*
    Program ini menghitung volume bola dengan jari-jari
    dari input pengguna.
*/
public class VolumeBolaInput
{
    public static void main(String[] args)
    {
        // [2] Deklarasikan variabel untuk menyimpan jari-jari dan volume
        double jari_jari, volume;

        // [3] Buat object Scanner
        Scanner scanner = new Scanner(System.in);

        // [4] Prompt user untuk memasukkan jari-jari dengan
        // prompt "Masukkan jari-jari (m): "
        System.out.print("Masukkan jari-jari (m): ");
        jari_jari = scanner.nextDouble();


        // [5] Hitung volume bola
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jari_jari, 3);


        // [6] Tampilkan volume bola dengan presisi dua tempat desimal
        System.out.printf("Volume bola = %.2f m3.\n", volume);

    }
}
