public class PersegiPanjang extends Bangun
{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
        setLuas(panjang * lebar);
    }

    public double getPanjang()
    {
        return panjang;
    }

    public double getLebar()
    {
        return lebar;
    }
}