public class Manager extends Pegawai
{
    private int bonus;

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }

    public int getBonus()
    {
        return bonus;
    }

    public Manager(String nama, int gajiPokok, int bonus)
    {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    @Override
    public double getGaji()
    {
        return super.getGaji() + bonus;
    }

    // pengecekan
    public static void main(String[] args)
    {
        Manager mgr = new Manager("Budi", 5000000, 2500000);
        System.out.println("Manager:");
        System.out.println("Nama: " + mgr.getNama());
        System.out.printf("Gaji: Rp.%,.2f\n", mgr.getGaji());
    }
}
