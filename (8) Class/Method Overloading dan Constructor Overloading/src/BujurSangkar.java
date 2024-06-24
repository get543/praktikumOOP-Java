/* Soal nomor 3 */
public class BujurSangkar
{
    private double sisi;

    // [1] Tuliskan constructor yang tidak menerima argument dan menetapkan
    // nilai field sisi dengan 0.0.
    public BujurSangkar()
    {
        sisi = 0.0;
    }

    // [2] Tuliskan constructor yang menerima sebuah argument dan menyalin
    // nilai argument tersebut ke field sisi.
    public BujurSangkar(double panjang)
    {
        sisi = panjang;
    }

    public void setSisi(double panjang)
    {
        sisi = panjang;
    }

    public double getSisi()
    {
        return sisi;
    }

    public double getLuas()
    {
        return sisi * sisi;
    }

//    Tidak termasuk, hanya pengecekan saja
    public static void main(String[] args)
    {
        BujurSangkar kotak = new BujurSangkar();
        System.out.println("sisi kotak = " + kotak.getSisi());
    }
}