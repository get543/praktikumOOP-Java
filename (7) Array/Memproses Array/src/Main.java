import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
//        Soal 1
//        int[] nilai = { 4, 7, 6, 8, 2 };
//        int x;
//
//        System.out.println(nilai[4]); // a
//
//        x = nilai[2] + nilai[3]; // b
//        System.out.println(x);

//        Soal 2
        int[] skorUjian = {87, 78, 93};
        System.out.println(skorUjian.length);

//        Soal 3
        int[] himpAngka1 = { 1, 3, 6, 9 };
        int[] himpAngka2 = { 2, 4, 6, 8 };
        int hasil;

        hasil = himpAngka1[0] * himpAngka2[3]; // ini
        System.out.println(hasil);

//        Soal 4
        int[] nilai = {10, 10, 10};
        int total = 0;
        for (int i : nilai) // ini
        {
            total += i;
        }
        System.out.println(total);

//        Soal 5
        int[] a = { 1, 3, 6, 9 };
        int[] b = new int[4];

        for (int i = 0; i < a.length; i++) // ini
        {
            b[i] = a[i];
        }

        System.out.println(Arrays.toString(b));
    }
}