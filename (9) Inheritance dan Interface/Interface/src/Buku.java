public class Buku implements BarangRitel
{
    private String judul;
    private String pengarang;
    private int hargaRitel;

    public Buku(String judul, String pengarang, int hargaRitel)
    {
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaRitel = hargaRitel;
    }

    public String getJudul()
    {
        return this.judul;
    }

    public String getPengarang()
    {
        return this.pengarang;
    }

    @Override
    public double getHargaRitel()
    {
        return this.hargaRitel;
    }

    public static void main(String[] args)
    {
        Buku novel = new Buku("Laskar Pelangi", "Andrea Hirata", 125000);
        System.out.println("Judul: " + novel.getJudul());
        System.out.println("Pengarang: " + novel.getPengarang());
        System.out.printf("Harga: Rp.%,.2f", novel.getHargaRitel());
    }
}
