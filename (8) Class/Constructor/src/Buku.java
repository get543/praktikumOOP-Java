public class Buku
{
    private String judul;
    private String penulis;
    private String penerbit;
    private int jumlahTerjual;

    // Tuliskan sebuah constructor yang menerima sebuah argument
    // untuk setiap field di bawah!
    public Buku(String jdl, String pnls, String pnrbt, int jmlhTerjual)
    {
        judul = jdl;
        penulis = pnls;
        penerbit = pnrbt;
        jumlahTerjual = jmlhTerjual;
    }

//    Ini tidak termasuk, Hanya untuk pengecekan saja
    public static void main(String[] args)
    {
        Buku java = new Buku("Big Java", "Cay Horstmann", "Wiley", 250000);

        System.out.println(java.judul);
        System.out.println(java.penulis);
        System.out.println(java.penerbit);
        System.out.println(java.jumlahTerjual);
    }
}