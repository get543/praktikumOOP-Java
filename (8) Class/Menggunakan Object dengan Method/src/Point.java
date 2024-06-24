public class Point
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    // Tuliskan definisi method static jarak di bawah!
    // Hanya tuliskan definisi method. Jangan tuliskan program lengkap.
    public static double jarak(Point p1, Point p2)
    {
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }

//    Hanya untuk pengetesan saja
    public static void main(String[] args)
    {
        Point p1 = new Point(6, 8);
        Point p2 = new Point(3, 4);

        double jrk = jarak(p1, p2);
        System.out.println("Jarak = " + jrk);
    }
}