public class Main
{
//    Soal 1
    public static int jumlah(int num1, int num2)
    {
        int hasil;
        hasil = num1 + num2;
        return hasil;
    }

    public static void main(String[] args)
    {
        int total;

        total = jumlah(15, 43);

        // Tampilkan hasil
        System.out.println("15 + 43 = " + total);
    }
}