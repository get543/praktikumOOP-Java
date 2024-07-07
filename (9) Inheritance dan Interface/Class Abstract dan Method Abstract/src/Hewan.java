public abstract class Hewan
{
    private int jumlahKaki;

    public Hewan(int jumlahKaki)
    {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki()
    {
        return jumlahKaki;
    }

    public abstract void bersuara();
}