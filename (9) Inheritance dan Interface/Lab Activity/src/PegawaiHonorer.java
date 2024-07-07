public class PegawaiHonorer extends Pegawai
{
    private double honorPerJam;
    private double jamKerja;

    public PegawaiHonorer(String nama, int gajiPokok, double jamKerja)
    {
        super(nama, gajiPokok);
        this.jamKerja = jamKerja;
    }

    @Override
    public double getGaji()
    {
        return super.getGaji() * jamKerja;
    }

    public double getHonorPerJam()
    {
        return honorPerJam;
    }

    public static void main(String[] args)
    {
        PegawaiHonorer staff = new PegawaiHonorer("Herman Winardi", 150000, 45.5);
        System.out.println("Pegawai Honorer: ");
        System.out.println("Nama: " + staff.getNama());
        System.out.printf("Gaji: Rp.%,.2f\n", staff.getGaji());
    }
}
