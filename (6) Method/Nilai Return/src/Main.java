import java.util.Scanner;

public class Main
{
//    Soal 1
    public static double jarak(double laju, double waktu)
    {
        return laju * waktu;
    }

//    Soal 2
    public static double smallest(double a, double b, double c)
    {
        return Math.min(a, Math.min(b, c));
    }

//    Soal 3
    public static boolean semuaBerbeda(double a, double b, double c)
    {
        if (a != b && b != c && a != c)
        {
            return true;
        }
        return false;
    }

//    Soal 4
    public static String getNama()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");

        return keyboard.nextLine();
    }

    public static void main(String[] args)
    {
        double jarak = jarak(12, 3);
        System.out.println(jarak);

        System.out.println(smallest(56.45, 83.34, 34.99));
        System.out.println(smallest(56.45, 56.45, 56.45));

        System.out.println(semuaBerbeda(45.6, 45.6, 23.3));
        System.out.println(semuaBerbeda(32.5, 68.4, 48.3));

        String nama = getNama();
        System.out.println(nama);
    }
}