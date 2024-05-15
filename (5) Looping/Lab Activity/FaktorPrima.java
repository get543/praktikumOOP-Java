/*
    Program ini meminta pengguna untuk memasukkan sebuah bilangan asli
    lalu mencetak faktor-faktor prima dari bilangan asli tersebut.
*/

import java.util.Scanner;

public class FaktorPrima
{
    // Tulis method main
    public static void main(String[] args)
    {
        // Buat object Scanner lalu prompt pengguna dan simpan
        // input pengguna ke variabel n.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan asli: ");
        int n = keyboard.nextInt();

        // Loop while untuk mencari faktor-faktor prima dari n
        // dengan metode pembagian berulang.
        for (int i = 2; i <= n; i++)
        {
            while (n % i == 0)
            {
                System.out.println(i);
                n /= i;
            }
        }
    }
}
