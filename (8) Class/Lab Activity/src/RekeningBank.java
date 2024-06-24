public class RekeningBank
{
    private double saldo;
    private int nomorRekening;
    private static int noRekTerakhir = 1000;

    public RekeningBank()
    {
        saldo = 0.0;
        noRekTerakhir++;
        this.nomorRekening = noRekTerakhir;
    }

    public RekeningBank(double saldoAwal)
    {
        saldo = saldoAwal;
        noRekTerakhir++;
        this.nomorRekening = noRekTerakhir;
    }

    public void deposit(double jumlah)
    {
        saldo += jumlah;
    }

    public void withdraw(double jumlah)
    {
        if (saldo >= jumlah)
            saldo -= jumlah;
        else
            System.out.println("Dana tidak mencukupi.");
    }

    public void setSaldo(double s)
    {
        saldo = s;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public int getNomorRekening()
    {
        return nomorRekening;
    }
}