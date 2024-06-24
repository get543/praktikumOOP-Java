/*
Jika kita punya class BujurSangkar,
gimana cara manggilnya di class TesBujurSangkar ?

JANGAN UBAH KODENYA KARENA INI DIAMBIL DARI SOAL
*/

public class BujurSangkar 
{
    private double sisi;

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
}
