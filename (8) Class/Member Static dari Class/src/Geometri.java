public class Geometri
{
    public static double luasLingkaran(double r)
    {
        return Math.PI * r * r;
    }

    public static double luasPersegiPanjang(double p, double l)
    {
        return p * l;
    }

    public static double luasSegitiga(double a, double t)
    {
        return (a * t) / 2;
    }

    public static void main(String[] args)
    {

        System.out.println("Luas lingkaran (r = 3.5) = " + Geometri.luasLingkaran(3.5));
        System.out.println("Luas persegi panjang (p = 4.5, l = 2.5) = " + Geometri.luasPersegiPanjang(4.5, 2.5));
        System.out.println("Luas segitiga (alas = 3.5, tinggi = 5.0) = " + Geometri.luasSegitiga(3.5, 5.0));
    }
}