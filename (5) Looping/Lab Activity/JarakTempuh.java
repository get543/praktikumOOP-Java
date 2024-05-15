/*
    Program ini menghitung jarak tempuh per jamnya
    dari sebuah kendaraan dengan kecepatan dan waktu
    tempuh didapatkan dari input pengguna.
*/

import java.util.Scanner;

public class JarakTempuh
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int kecepatan;
        int waktu;

        do {
            System.out.print("Masukkan kecepatan kendaraan (km/jam): ");
            kecepatan = keyboard.nextInt();

            if (kecepatan < 0)
                System.out.println("Kecepatan tidak bisa negatif. Masukkan kembali kecepatan.");
        } while (kecepatan < 0);

        do {
            System.out.print("Masukkan waktu tempuh (jam): ");
            waktu = keyboard.nextInt();

            if (waktu < 1)
                System.out.println("Waktu tempuh harus lebih besar dari atau sama dengan 1 jam. Masukkan kembali waktu tempuh.");
        } while (waktu < 1);

        System.out.println("Waktu (jam)\tJarak (km)");
        for (int i = 1; i <= waktu; i++) {
            int jarak = kecepatan * i;
            System.out.printf("%-11d\t%6d\n", i, jarak);
        }
    }
}
