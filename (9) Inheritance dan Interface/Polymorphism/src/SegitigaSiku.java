public class SegitigaSiku extends Bangun
{
    private double alas;
    private double tinggi;
    
    public SegitigaSiku(double alas, double tinggi)
    {
        this.alas = alas;
        this.tinggi = tinggi;
        setLuas(0.5 * alas * tinggi);
    }

    public double getAlas()
    {
        return alas;
    }

    public double getTinggi()
    {
        return tinggi;
    }
}
