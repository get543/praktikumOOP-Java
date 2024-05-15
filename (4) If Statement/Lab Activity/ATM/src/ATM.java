// import class Scanner
import java.util.Scanner;

/*
    Program ini mensimulasikan ATM.
    Pengguna diberikan kesempatan tiga kali untuk memasukkan PIN yang benar.
    (PIN yang benar diasumsikan 1234). Jika setelah tiga kali PIN yang
    dimasukkan masih salah, program menampilkan pesan Kartu ATM terblokir.
*/
public class ATM
{
    public static void main(String[] args)
    {
        // Untuk menyimpan PIN yang dimasukkan pengguna
        int inputPIN;

        // Buat object Scanner
        Scanner keyboard = new Scanner(System.in);

        // Konstanta PIN yang benar
        int validPIN = 1234;

        // Minta pengguna memasukkan PIN dan simpan PIN yang dimasukkan
        // dalam variabel inputPIN.
        System.out.print("Masukkan PIN Anda: ");
        inputPIN = keyboard.nextInt();


        // Uji apakah PIN yang dimasukkan benar. Jika benar, tampilkan pesan
        // "PIN yang Anda masukkan benar.". Jika tidak, minta PIN kembali sampai tiga kali.
        // Jika pada percobaan ketiga, pengguna masih memasukkan PIN yang salah,
        // tampilkan pesan "Kartu ATM Anda terblokir.".
        if (inputPIN == validPIN) {
            System.out.println("PIN yang Anda masukkan benar.");
        } else {
            System.out.println("PIN yang Anda masukkan salah.");
            System.out.print("Masukkan kembali PIN Anda: ");
            inputPIN = keyboard.nextInt();

            if (inputPIN == validPIN) {
                System.out.println("PIN yang Anda masukkan benar.");
            } else {
                System.out.println("PIN yang Anda masukkan salah.");
                System.out.print("Masukkan kembali PIN Anda: ");
                inputPIN = keyboard.nextInt();

                if (inputPIN == validPIN) {
                    System.out.println("PIN yang Anda masukkan benar.");
                } else {
                    System.out.println("PIN yang Anda masukkan salah.");
                    System.out.println("Kartu ATM Anda terblokir.");
                }
            }
        }

    }
}
