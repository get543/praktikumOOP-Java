public class Karyawan
{

    private String nama;
    private String departemen;
    private String posisi;
    private int nomorId;

    public Karyawan(String nama, int nomorId, String departemen, String posisi)
    {
        this.nama = nama;
        this.departemen = departemen;
        this.posisi = posisi;
        this.nomorId = nomorId;
    }

    public Karyawan(String nama, int nomorId)
    {
        this(nama, nomorId, "", "");
    }

    public Karyawan()
    {
        this("Unknown", 0, "", "");
    }

    public String getNama()
    {
        return nama;
    }

    public String getDepartemen()
    {
        return departemen;
    }

    public String getPosisi()
    {
        return posisi;
    }

    public int getNomorId()
    {
        return nomorId;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setDepartemen(String departemen)
    {
        this.departemen = departemen;
    }

    public void setPosisi(String posisi)
    {
        this.posisi = posisi;
    }

    public void setNomorId(int nomorId)
    {
        this.nomorId = nomorId;
    }

    public static void main(String[] args)
    {
        Karyawan karyawan = new Karyawan("Susan Meyers", 47899, "Accounting", "Vice President");
        System.out.println("Nama Karyawan: " + karyawan.getNama());
        System.out.println("Nomor ID karyawan: " + karyawan.getNomorId());
        System.out.println("Departemen: " + karyawan.getDepartemen());
        System.out.println("Posisi: " + karyawan.getPosisi());
    }
}