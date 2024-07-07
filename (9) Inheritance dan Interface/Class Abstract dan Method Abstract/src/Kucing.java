public class Kucing extends Hewan
{
    public Kucing()
    {
        super(4);
    }

    @Override
    public void bersuara()
    {
        System.out.println("Meong...");
    }

    // pengetesan class
    public static void main(String[] args)
    {
        Kucing heli = new Kucing();
        System.out.println("Banyak kaki: " + heli.getJumlahKaki());
        heli.bersuara();
    }
}
