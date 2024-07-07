public class Pegawai
{
    private String nama;
    private double gajiPokok;

    public Pegawai(String nama, double gajiPokok)
    {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama()
    {
        return nama;
    }

    public double getGaji()
    {
        return gajiPokok;
    }
}