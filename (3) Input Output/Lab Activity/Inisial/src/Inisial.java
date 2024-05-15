// [1] Import class Scanner
import java.util.Scanner;

public class Inisial
{
    public static void main(String[] args)
    {
        // [2] Deklarasikan variabel untuk menyimpan nama depan dan nama belakang
        String nama_depan, nama_belakang;

        // [3] Buat object scanner
        Scanner scanner = new Scanner(System.in);

        // [4] Minta nama depan dengan prompt "Masukkan nama depan: "
        System.out.print("Masukkan nama depan: ");
        nama_depan = scanner.next();


        // [5] Minta nama depan dengan prompt "Masukkan nama belakang: "
        System.out.print("Masukkan nama belakang: ");
        nama_belakang = scanner.next();



        // [7] Tampilkan inisial dengan memanggil suatu method yang dimiliki oleh String
        System.out.println("Inisial: " + nama_depan.charAt(0) + nama_belakang.charAt(0));

    }
}