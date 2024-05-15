import java.util.Scanner;

public class OlahData
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double sentinel;
        double rataRata;
        double selisihMaxMin;
        double total = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        int counter = 0;

        do {
            System.out.print("Masukkan angka floating point positif (-1 untuk mengakhiri): ");
            sentinel = keyboard.nextDouble();

            if (sentinel == -1)
                break;

            if (sentinel > max)
                max = sentinel;

            if (sentinel < min)
                min = sentinel;

            total += sentinel;
            counter++;
        } while (sentinel != -1);

        if (counter == 0)
            return;

        rataRata = total / counter;
        selisihMaxMin = max - min;

        System.out.println("Rata-rata = " + rataRata);
        System.out.println("Maksimum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Selisih Maks dan Min = " + selisihMaxMin);
    }
}
