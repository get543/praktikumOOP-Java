public class Car
{
    private int fuel;

    public Car()
    {
        fuel = 0;
    }

    public Car(int g)
    {
        fuel = g;
    }

    public void addFuel()
    {
        fuel++;
    }

    public void display()
    {
        System.out.print(fuel + " ");
    }
}