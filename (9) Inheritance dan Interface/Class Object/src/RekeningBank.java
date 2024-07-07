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

    // [1] Tambahkan method toString di bawah.
    public String toString()
    {
        return nomorRekening + ", " + saldo;
    }

    // [2] Tambahkan method equals di bawah.
    public boolean equals(Object Rekening)
    {
        boolean status;

        // Kita menguji apakah argument object yang diberikan
        // adalah instance dari PersegiPanjang. Pengujian ini untuk
        // memastikan kita dapat melakukan casting.
        if (Rekening instanceof RekeningBank)
        {
            RekeningBank r = (RekeningBank) Rekening;
            status = this.nomorRekening == r.nomorRekening && this.saldo == r.saldo;
        }
        else
        {
            status = false;
        }

        return status;
    }

    // pengetesan class
    public static void main(String[] args)
    {
        RekeningBank rek1 = new RekeningBank("102345", 1500000);
        RekeningBank rek2 = new RekeningBank("234567", 1500000);
        RekeningBank rek3 = new RekeningBank("102345", 1500000);
        System.out.println(rek1);
        System.out.println(rek1.equals(rek2));
        System.out.println(rek1.equals(rek3));
    }
}