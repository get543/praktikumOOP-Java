public class Lingkaran extends Bangun
{
    private double radius;

    public void setRadius(double radius)
    {
        super.setLuas(Math.PI * radius * radius);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    // pengetesan saja, tidak termasuk
    public static void main(String[] args)
    {
        Lingkaran bulat = new Lingkaran();
        bulat.setRadius(3.5);
        System.out.printf("Lingkaran dengan radius %.2f cm mempunyai luas = %.2f cm2",
                bulat.getRadius(), bulat.getLuas());
    }
}
