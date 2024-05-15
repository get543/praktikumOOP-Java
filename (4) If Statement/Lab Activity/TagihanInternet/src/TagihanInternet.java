// import class scanner
import java.util.Scanner;

public class TagihanInternet
{
    public static void main(String[] args)
    {
        // Deklarasi konstanta untuk biaya tambahan per jam.
        int biayaTambahan = 0, kelebihanJam;

        // Deklarasi variabel paket, totalTagihan, dan jam
        String paket;
        double totalTagihan = 0.0, jam;

        // Membuat objek scanner untuk membaca input keyboard
        Scanner keyboard = new Scanner(System.in);

        // Meminta input jenis paket dari pengguna dan  
        // tugaskan nilai yang diinput ke dalam variabel paket
        System.out.print("Masukkan paket [A,B,C]: ");
        paket = keyboard.nextLine();

        // Meminta input jam akses dari pengguna dan
        // tugaskan nilai yang diinput ke dalam variabel jam
        System.out.print("Masukkan jam pemakaian: ");
        jam = keyboard.nextDouble();

        // Statement Switch untuk deklarasi besaran total tagihan dan jam akses 
        // kemudian pada masing-masing case berikan statement if  
        // untuk menghitung total tagihan
        switch (paket)
        {
            case "A":
                if ((int) jam > 20) {
                    kelebihanJam = (int) jam - 20;
                    biayaTambahan += 5000 * kelebihanJam;
                }

                totalTagihan = 100000 + biayaTambahan;
                break;

            case "B":
                if ((int) jam > 50) {
                    kelebihanJam = (int) jam - 50;
                    biayaTambahan += 5000 * kelebihanJam;
                }

                totalTagihan = 200000 + biayaTambahan;
                break;

            case "C":
                totalTagihan = 350000;
                break;

            default:
                System.out.println("Salah input! Jenis paket hanya A, B, atau C.");
                System.exit(0);
                break;
        }

        // Menampilkan total tagihan
        System.out.printf("Total tagihan = Rp.%,.2f\n", totalTagihan);
    }
}