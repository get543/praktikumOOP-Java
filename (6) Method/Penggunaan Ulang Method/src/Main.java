import java.util.Scanner;

public class Main
{
//    Soal 1
    public static double readDouble(String prompt)
    {
        // Tuliskan kode method readDouble di bawah comment ini.
        Scanner keyboard = new Scanner(System.in);
        System.out.print(prompt + " ");

        return keyboard.nextDouble();
    }

//    Soal 2
//    Modifikasi method di bawah sehingga dapat digunakan untuk berbagai
//    nilai saldo awal dan berbagai nilai bunga.
    public static double balance(double saldoAwal, double bunga, int jangkaWaktu)
    {
        return saldoAwal * Math.pow(bunga + 1, jangkaWaktu);
    }

    public static void main(String[] args)
    {
//        int gaji = readDouble("Masukkan gaji Anda:");
//        double persenKenaikan = readDouble("Berapa persen kenaikan gaji yang Anda harapkan?");

        double saldoAwal = 15000000;
        int jangkaWaktu = 7;
        double bunga = 0.075;
        double saldoAkhir = balance(saldoAwal, bunga, jangkaWaktu);
        System.out.printf("Saldo Akhir = Rp.%,.2f\n", saldoAkhir);
    }
}