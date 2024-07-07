public class PengetesanKelasKapal
{
    public static void main(String[] args)
    {
        public static void main(String[] args)
        {
            Kapal[] ship = new Kapal[5];
            ship[0] = new Kapal("ALMIRA", 1991);
            ship[1] = new KapalPesiar("PHINISI", 2005, 750);
            ship[2] = new KapalKargo("MEDELLIN", 1993, 250);
            ship[3] = new KapalPesiar("TITANIC", 2012, 1500);
            ship[4] = new KapalPesiar("OCEANIA", 2010, 1000);

            for (int i = 0; i < ship.length; i++)
            {
                System.out.println("Kapal " + (i + 1) + ":");
                System.out.println(ship[i]);
                System.out.println();
            }
        }
    }
}
