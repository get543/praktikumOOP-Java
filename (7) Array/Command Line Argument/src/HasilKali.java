public class HasilKali
{

    public static void main(String[] args)
    {
        int total = 1;
        for (String arg : args)
        {
            total *= Integer.parseInt(arg);
        }
        System.out.println(total);
    }
}
