public class CashRegister
{
    private int itemCount;
    private double totalPrice;

    public void addItem(double price)
    {
        itemCount++;
        totalPrice = totalPrice + price;
    }

    public double getTotal()
    {
        return totalPrice;
    }

    public int getCount()
    {
        return itemCount;
    }

    public void clear()
    {
        itemCount = 0;
        totalPrice = 0;
    }

    public static void main(String[] args)
    {
//        Pengetesan nomor 2
        CashRegister reg1 = new CashRegister();
        reg1.addItem(3.25);
        reg1.addItem(1.95);
        CashRegister reg2 = new CashRegister();
        reg2.addItem(3.25);
        reg2.clear();

        System.out.println("reg1.getCount() outputs " + reg1.getCount()); // a
        System.out.println("reg1.getTotal() outputs " + reg1.getTotal()); // b
        System.out.println("reg2.getCount() outputs " + reg2.getCount()); // c
        System.out.println("reg2.getTotal() outputs " + reg2.getTotal()); // d
    }
}