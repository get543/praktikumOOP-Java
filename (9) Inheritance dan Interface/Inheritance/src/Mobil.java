public class Mobil
{
    private String pabrikan;
    private String model;
    private String warna;
    private int kecepatanMax;

    public void setPabrikan(String pabrikan)
    {
        this.pabrikan = pabrikan;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setWarna(String warna)
    {
        this.warna = warna;
    }

    public void setKecepatanMax(int kecepatanMax)
    {
        this.kecepatanMax = kecepatanMax;
    }

    public String getPabrikan()
    {
        return pabrikan;
    }

    public String getModel()
    {
        return model;
    }

    public String getWarna()
    {
        return warna;
    }

    public int getKecepatanMax()
    {
        return kecepatanMax;
    }
}