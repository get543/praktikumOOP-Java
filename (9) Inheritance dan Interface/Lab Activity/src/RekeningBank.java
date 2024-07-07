public class RekeningBank
{
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldo)
    {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public String getNomorRekening()
    {
        return nomorRekening;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public void deposit(double jumlah)
    {
        saldo = saldo + jumlah;
    }

    public void withdraw(double jumlah)
    {
        if (saldo >= jumlah)
        {
            saldo = saldo - jumlah;
        }
        else
        {
            System.out.println("Dana tidak mencukupi.");
        }
    }
}