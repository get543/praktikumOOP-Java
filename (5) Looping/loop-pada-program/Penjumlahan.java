import java.util.Scanner;

/*
    Program ini meminta pengguna memasukkan dua angka integer lalu
    menjumlahkan kedua angka yang dimasukkan.
    Kemudian program menanyakan pengguna apakah ingin memasukkan 
    2 angka lainnya. Jika ya, program mengulang dan jika tidak,
    program berhenti. 
*/
public class Penjumlahan
{
    public static void main(String[] args)
    {
        int angka1, angka2, jumlah;
        char pilihan;

        Scanner keyboard = new Scanner(System.in);

        do
        {
            // Tuliskan statement-statement di bawah comment ini
            // sehingga program melakukan hal-hal yang diminta.
            System.out.print("Masukkan angka 1: ");
            angka1 = keyboard.nextInt();

            System.out.print("Masukkan angka 2: ");
            angka2 = keyboard.nextInt();

            jumlah = angka1 + angka2;

            System.out.println("Jumlah = " + jumlah);

            System.out.print("Apakah Anda ingin melakukan ini kembali (Y atau N)? ");
            pilihan = keyboard.next().charAt(0);

            System.out.print("\n");
        } while (pilihan == 'Y');
    }
}
