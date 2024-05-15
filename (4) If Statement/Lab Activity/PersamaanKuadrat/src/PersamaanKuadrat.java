// import class scanner
import java.util.Scanner;

/*
    Program ini meminta pengguna memasukkan nilai a, b, dan c, lalu 
    menghitung akar x1 dan x2 dari persamaan kuadrat ax^2 + bx + c = 0.
*/
public class PersamaanKuadrat
{
    public static void main(String[] args)
    {
        // [2] Deklarasikan a, b, c untuk menyimpan input pengguna
        double a, b, c;

        // Deklarasikan x1 dan x2 untuk menyimpan akar persamaan kuadrat
        // dan d untuk menyimpan nilai diskriminan.
        double x1, x2, d;

        // Buat object scanner dan referensikan ke variabel keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt pengguna untuk mendapatkan nilai a
        System.out.print("Masukkan nilai a: ");
        a = keyboard.nextDouble();

        // Prompt pengguna untuk mendapatkan nilai b
        System.out.print("Masukkan nilai b: ");
        b = keyboard.nextDouble();

        // Prompt pengguna untuk mendapatkan nilai c
        System.out.print("Masukkan nilai c: ");
        c = keyboard.nextDouble();

        // Hitung nilai diskriminan
        d = (Math.pow(b, 2)) - (4*a*c);
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);

        // Struktur keputusan: jika d < 0, tampilkan "Akar-akar dari persamaan kuadrat adalah imajiner."
        // jika tidak, tampilkan akar-akar.
        if (d < 0) {
            System.out.println("Akar-akar dari persamaan kuadrat adalah imajiner.");
        } else {
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }


    }
}