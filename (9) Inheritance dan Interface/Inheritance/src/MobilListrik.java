public class MobilListrik extends Mobil
{
    private int lamaRecharge;

    public MobilListrik()
    {

    }

    public MobilListrik(String pabrikan, String model, String warna, int kecepatanMax, int lamaRecharge)
    {
        super.setPabrikan(pabrikan);
        super.setModel(model);
        super.setWarna(warna);
        super.setKecepatanMax(kecepatanMax);
        this.lamaRecharge = lamaRecharge;
    }

    public int getLamaRecharge()
    {
        return lamaRecharge;
    }

    public void setLamaRecharge(int lamaRecharge)
    {
        this.lamaRecharge = lamaRecharge;
    }

    // ini cuma pengetesan saja
    // tidak termasuk
    public static void main(String[] args)
    {
        MobilListrik kona = new MobilListrik("Hyundai", "Kona", "Silver", 180, 4);
        MobilListrik tesla = new MobilListrik();
        tesla.setPabrikan("Tesla");
        tesla.setModel("X");
        tesla.setWarna("Merah");
        tesla.setKecepatanMax(250);
        tesla.setLamaRecharge(3);

        System.out.println("Data Mobil Listrik: ");
        System.out.println(kona.getPabrikan() + "\t" +
                kona.getModel() + "\t" +
                kona.getWarna() + "\t" +
                kona.getKecepatanMax() + "\t" +
                kona.getLamaRecharge() + "\t");
        System.out.println(tesla.getPabrikan() + "\t" +
                tesla.getModel() + "\t" +
                tesla.getWarna() + "\t" +
                tesla.getKecepatanMax() + "\t" +
                tesla.getLamaRecharge() + "\t");
    }
}