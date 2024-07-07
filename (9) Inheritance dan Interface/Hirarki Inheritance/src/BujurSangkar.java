public class BujurSangkar extends PersegiPanjang
{
    public BujurSangkar(double sisi)
    {
        super(sisi, sisi);
    }

    // pengetesan
    public static void main(String[] args)
    {
        BujurSangkar boks1 = new BujurSangkar(5.0);
        System.out.println("Sisi = " + boks1.getPanjang());
        System.out.println("Luas = " + boks1.getLuas());
    }
}
