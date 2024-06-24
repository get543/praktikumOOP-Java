public class Main
{
//    Soal 1
    public static double getAverage(int[] array)
    {
        int total = 0;
        for (int e : array)
        {
            total += e;
        }
        return (double) total / (array.length);
    }

//    Soal 2
    public static double minimum(double[] array)
    {
        double min = array[0];

        for (double e : array)
        {
            if (e < min)
            {
                min = e;
            }
        }

        return min;
    }

//    Soal 3
    public static int banyakNol(int[] array)
    {
        int zeroCounter = 0;
        for (int e : array)
        {
            if (e == 0)
            {
                zeroCounter++;
            }
        }
        return zeroCounter;
    }

    public static int cariNilai(int[] array, int nilai)
    {
        int index = -1;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == nilai)
            {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args)
    {
//        Pengecekan Soal 1
        int[] nilaiUjian = { 75, 85, 95, 70, 80, 90, 85, 65 };
        double ratarata = getAverage(nilaiUjian);
        System.out.println(ratarata);

//        Pengecekan Soal 2
        double[] nilai = {7.6, 8.9, 9.6, 7.3};
        double min = minimum(nilai);
        System.out.println(min);

//        Pengecekan Soal 3
//        int[] angka = {87, 78, 0, 98, 54, 34, 0, 45, 55, 89, 87, 0};
//        int count = banyakNol(angka);
//        System.out.println(count);

//        Pengecekan Soal 4
        int[] angka = {34, 58, 46, 75, 68, 97, 43, 23, 19};
        int indeksDitemukan = cariNilai(angka, 97);
        System.out.println(indeksDitemukan);
    }
}