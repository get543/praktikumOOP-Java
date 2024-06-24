/* Soal 2 */

public class CheckPoint
{
    public void pesan(int x)
    {
        System.out.println("Versi 1 dari method.");
    }

    public void pesan(String x)
    {
        System.out.println("Versi 2 dari method.");
    }

//    Ini hanya pengetesan saja
    public static void main(String[] args)
    {
        CheckPoint cp = new CheckPoint();
        cp.pesan("1");
    }
}