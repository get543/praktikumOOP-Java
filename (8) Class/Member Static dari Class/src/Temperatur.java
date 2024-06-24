public class Temperatur
{
    private double temperatur;
    private static double maxTemp = 0;

    public Temperatur(double t)
    {
        temperatur = t;
        if (t > maxTemp)
            maxTemp = t;
    }

    public double getMaxTemp()
    {
        return maxTemp;
    }

    public static void main(String[] args)
    {
        Temperatur t1 = new Temperatur(75);
        Temperatur t2 = new Temperatur(100);
        Temperatur t3 = new Temperatur(65);
        System.out.println("Max Temp: " + t1.getMaxTemp());
    }
}