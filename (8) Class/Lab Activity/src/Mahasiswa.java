public class Mahasiswa
{
    private String nama;
    private int totalSkor;
    private int banyakKuis;

    public Mahasiswa(String nama)
    {
        this.nama = nama;
    }

    public void addSkor(int skor)
    {
        this.totalSkor += skor;
        this.banyakKuis++;
    }

    public String getNama()
    {
        return this.nama;
    }

    public int getTotalSkor()
    {
        return this.totalSkor;
    }

    public double getAverageSkor()
    {
        return this.totalSkor / (double) this.banyakKuis;
    }

    public static void main(String[] args)
    {
        Mahasiswa mahasiswa = new Mahasiswa("Harry Cooper");
        mahasiswa.addSkor(7);
        mahasiswa.addSkor(10);
        mahasiswa.addSkor(8);
        System.out.println("Nama mahasiswa: " + mahasiswa.getNama());
        System.out.println("Total skor: " + mahasiswa.getTotalSkor());
        System.out.println("Skor rata-rata: " + mahasiswa.getAverageSkor());
    }

}