import java.util.Scanner;

/*
    Program ini menghitung PresentValue
*/
public class Deposito
{
    // Tuliskan method hitungPresentValue di bawah comment ini.
    public static double hitungPresentValue(double futureVal, double bunga, int jangkaWaktu)
    {
        return (futureVal) / (Math.pow(1+bunga, jangkaWaktu));
    }




    /**************************************
     !!!JANGAN UBAH KODE DI BAWAH!!!
     ***************************************/
    public static void main(String[] args)
    {
        double futureVal, bunga, presentVal;
        int jangkaWaktu;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nilai future yang Anda harapkan: ");
        futureVal = keyboard.nextDouble();

        System.out.print("Bunga tahunan: ");
        bunga = keyboard.nextDouble();

        System.out.print("Jangka waktu (tahun): ");
        jangkaWaktu = keyboard.nextInt();

        presentVal = hitungPresentValue(futureVal, bunga, jangkaWaktu);
        System.out.printf("Anda harus mendepositokan sejumlah: Rp.%,.2f\n", presentVal);
    }
}
