public class Segitiga
{
    private double a;
    private double b;
    private double c;

    /*
        Constructor 1.
    */
    public Segitiga(double sisiA, double sisiB, double sisiC)
    {
        a = sisiA;
        b = sisiB;
        c = sisiC;
    }

    /*
        Constructor 2.
        Mengkonstruksi segitiga sama sisi.
    */
    public Segitiga(double a)
    {
        this(a, a, a);
    }

    /*
        Method ini mengembalikan luas segitiga
        @return Luas segitiga.
    */
    public double getLuas()
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

//    Pengetesan saja, tidak termasuk
    public static void main(String[] args)
    {
        Segitiga luas = new Segitiga(4.5);
        System.out.println(luas.getLuas());
    }
}