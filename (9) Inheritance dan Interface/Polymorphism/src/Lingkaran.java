public class Lingkaran extends Bangun
{
    private double radius;
    
    public Lingkaran(double r)
    {
        radius = r;
        setLuas(Math.PI * r * r);
    }

    public double getRadius()
    {
        return radius;
    }
}
