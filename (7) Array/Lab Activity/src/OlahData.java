import java.util.Scanner;

public class OlahData
{
    // [1] Tuliskan definisi method getTotal
    public static int getTotal(int[] array)
    {
        int total = 0;

        for (int e : array)
            total += e;

        return total;
    }

    // [2] Tuliskan definisi method getAverage
    public static double getAverage(int[] array)
    {
        double sum = 0;

        for (double e : array)
            sum += e;

        return sum / array.length;
    }

    // [3] Tuliskan definisi method getHighest
    public static int getHighest(int[] array)
    {
        int highest = array[0];

        for (int e : array)
        {
            if (e > highest)
                highest = e;
        }

        return highest;
    }

    // [4] Tuliskan definisi method getLowest
    public static int getLowest(int[] array)
    {
        int lowest = array[0];

        for (int e : array)
        {
            if (e < lowest)
                lowest = e;
        }

        return lowest;
    }






    /********************************************
     *                                           *
     *    !!! JANGAN UBAH KODE DI BAWAH !!!      *
     *                                           *
     *********************************************/
    public static void main(String[] args)
    {
        int banyakElemen;
        int[] nilai;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Berapa banyak nilai yang ingin di-input? ");
        banyakElemen = keyboard.nextInt();

        nilai = new int[banyakElemen];

        for (int i = 0; i < banyakElemen; i++)
        {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = keyboard.nextInt();
        }

        System.out.println("Total = " + getTotal(nilai));
        System.out.println("Rata-rata = " + getAverage(nilai));
        System.out.println("Nilai tertinggi = " + getHighest(nilai));
        System.out.println("Nilai terendah = " + getLowest(nilai));
    }
}