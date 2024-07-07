public class RekeningMinMax extends RekeningBank
{
    private double saldoMax;
    private double saldoMin;

    public RekeningMinMax(String nomorRekening, int saldoAwal)
    {
        super(nomorRekening, saldoAwal);
        this.saldoMax = saldoAwal;
        this.saldoMin = saldoAwal;
    }

    public double getSaldoMax()
    {
        return saldoMax;
    }

    public double getSaldoMin()
    {
        return saldoMin;
    }

    @Override
    public void deposit(double jumlah)
    {
        setSaldo(getSaldo() + jumlah);

        if (getSaldo() > this.saldoMax)
            saldoMax = getSaldo();
    }

    @Override
    public void withdraw(double jumlah)
    {
        if (getSaldo() >= jumlah)
        {
            setSaldo(getSaldo() - jumlah);
            if (getSaldo() < this.saldoMin)
                saldoMin = getSaldo();
        }
        else
        {
            System.out.println("Dana tidak mencukupi.");
        }
    }

    public static void main(String[] args)
    {
        RekeningMinMax rek = new RekeningMinMax("123456", 1500000);
        System.out.printf("Nomor Rekening: %s, Saldo Awal: Rp.%,.2f\n",
                            rek.getNomorRekening(), rek.getSaldo());
        rek.deposit(250000);
        rek.withdraw(750000);
        rek.withdraw(500000);
        rek.withdraw(250000);
        rek.deposit(250000);
        System.out.printf("Saldo: Rp.%,.2f\n", rek.getSaldo());
        System.out.printf("Saldo Max: Rp.%,.2f\n", rek.getSaldoMax());
        System.out.printf("Saldo Min: Rp.%,.2f\n", rek.getSaldoMin());
        rek.withdraw(800000);
    }

}
