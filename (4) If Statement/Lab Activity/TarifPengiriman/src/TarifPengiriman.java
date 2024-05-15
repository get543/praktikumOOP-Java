import java.util.Scanner;

public class TarifPengiriman
{
    public static void main(String[] args)
    {
        int tarifperKm;
        double beratPaket, jarakPengiriman;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan berat paket Anda (kg): ");
        beratPaket = keyboard.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        jarakPengiriman = keyboard.nextDouble();

        if (beratPaket <= 2) {
            tarifperKm = 1500;
        } else if (beratPaket > 2 && beratPaket < 6) {
            tarifperKm = 3000;
        } else if (beratPaket > 6 && beratPaket < 10) {
            tarifperKm = 5000;
        } else {
            tarifperKm = 5500;
        }

        double totalTarif = tarifperKm * (int) jarakPengiriman;

        System.out.printf("Tarif Pengiriman = Rp.%,.2f\n", totalTarif);
    }
}