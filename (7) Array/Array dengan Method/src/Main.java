import java.util.Arrays;

public class Main
{
    public static boolean myMethod(double[] array)
    {
        return false;
    }

//    Soal 2
    public static void ones(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = 1;
        }
    }

//    Soal 3
    public static double[] randomArray(int bykElemen)
    {
        double[] arr = new double[bykElemen];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.random() * 100;
        }

        return arr;
    }

//    Soal 4
    public static int[] balikArray(int[] sourceArray)
    {
        int[] reverseArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++)
        {
            reverseArray[i] = sourceArray[sourceArray.length - 1 - i];
        }
        return reverseArray;
    }

//    Soal 5
    public static int[] isiArray(int[] array, int elemen)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = elemen;
        }
        return array;
    }


    public static void main(String[] args)
    {
//        Soal 1
//        double[] angka = new double[100];
//        System.out.println(myMethod(angka));

//        Soal 2
//        int[] angka = new int[10];
//        System.out.println(ones(angka));

//        Soal 3
        System.out.println(Arrays.toString(randomArray(10)));

//        Soal 4
        int[] himpAngka1 = { 1, 2, 3, 4, 5 };
        int[] himpAngka2 = balikArray(himpAngka1);
        System.out.println(Arrays.toString(himpAngka2));

//        Soal 5
        int[] skor = new int[5];
        System.out.println(Arrays.toString(isiArray(skor, 10)));
    }
}