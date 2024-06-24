/*
Class PersegiPanjang, tahap 4
Sedang dalam pengerjaan!

!!!!!!!!!!!!! dari modul !!!!!!!!!!!!!
*/
public class PersegiPanjang
{
    private double panjang;
    private double lebar;
    /*
    Method setPanjang menyimpan sebuah nilai
    dalam field panjang.
    @param pjg Nilai yang disimpan dalam field panjang.
    */
    public void setPanjang(double pjg)
    {
        panjang = pjg;
    }
    /*
    Method setLebar menyimpan sebuah nilai
    dalam field lebar.
    @param lbr Nilai yang disimpan dalam field lebar.
    */
    public void setLebar(double lbr)
    {
        lebar = lbr;
    }
    /*
    Method getPanjang mengembalikan panjang dari
    object PersegiPanjang.
    @return Nilai dalam field panjang
    */
    public double getPanjang()
    {
        return panjang;
    }
    /*
    Method getLebar mengembalikan lebar dari
    object PersegiPanjang.
    @return Nilai dalam field lebar
    */
    public double getLebar()
    {
        return lebar;
    }
    /*
    Method getLuas mengembalikan luas dari
    object PersegiPanjang.
    @return Hasil dari panjang kali lebar.
    */
    public double getLuas()
    {
        return panjang * lebar;
    }
}