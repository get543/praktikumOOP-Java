public class No1
{
    public static int alternatingSum(int[] array)
    {
        int result = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (i % 2 == 0)
                result += array[i];
            else
                result -= array[i];

        }
        return result;
    }


    public static void main(String[] args)
    {
        int[] angka = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        int hasil = alternatingSum(angka);
        System.out.println(hasil);
    }
}
