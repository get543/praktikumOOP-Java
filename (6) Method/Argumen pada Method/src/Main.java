public class Main
{
    public static void methodSaya(int a, int b, int c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void average(double a, double b, double c)
    {
        double total = (a + b + c) / 3;
        System.out.printf("%.2f\n", total);
    }

    public static void main(String[] args)
    {
        methodSaya(3, 2, 1);
        average(34.3, 56.7, 95.7);
    }
}