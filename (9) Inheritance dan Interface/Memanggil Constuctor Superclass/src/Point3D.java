public class Point3D extends Point2D
{
    private int z;

    // Empty Argument
    public Point3D()
    {

    }

    // Non-Empty Argument
    public Point3D(int x, int y, int z)
    {
        super(x, y);
        this.z = z;
    }

    public void setZ(int z)
    {
        this.z = z;
    }

    public int getZ()
    {
        return z;
    }

    // bagian pengetesan
    public static void main(String[] args)
    {
        Point3D pt1 = new Point3D();
        pt1.setX(4);
        pt1.setY(7);
        pt1.setZ(5);

        Point3D pt2 = new Point3D(3, 4, 5);

        System.out.println("Point 1: (" + pt1.getX() + ", " +
                pt1.getY() + ", " +
                pt1.getZ() + ")");

        System.out.println("Point 2: (" + pt2.getX() + ", " +
                pt2.getY() + ", " +
                pt2.getZ() + ")");
    }
}
