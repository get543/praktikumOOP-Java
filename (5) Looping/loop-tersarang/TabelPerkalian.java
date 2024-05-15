/*
    Program ini menampilkan tabel perkalian dari 1 s.d 10
    menggunakan loop tersarang.
 */
public class TabelPerkalian
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                int hasil_kali = i * j;
                System.out.printf("%3d  ", hasil_kali);
            }
            System.out.print("\n");
        }
    }
}
