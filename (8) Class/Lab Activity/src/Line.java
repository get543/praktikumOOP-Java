public class Line
{
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1()
    {
        return p1;
    }

    public Point getP2()
    {
        return p2;
    }

    public String toString()
    {
        String str_p1 = "(" + this.p1.getX() + ", " + this.p1.getY() + ")";
        String str_p2 = "(" + this.p2.getX() + ", " + this.p2.getY() + ")";
        return "[" + str_p1 + ", " + str_p2 + "]";
    }

    public double getSlope()
    {
        return (p1.getY() - p2.getY()) / (double) (p1.getX() - p2.getX());
    }
}