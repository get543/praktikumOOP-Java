public class RataRata
{
    public static void main(String[] args)
    {
        double sum = 0;

        for (String arg : args)
            sum += Double.parseDouble(arg);

        double average = sum / args.length;
        System.out.println(average);
    }
}
