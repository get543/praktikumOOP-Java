public class RaceCar extends Car
{
    public RaceCar(int g)
    {
        super(2*g);
    }

    public static void main(String[] args)
    {
        Car car = new Car(5);
        RaceCar fastCar = new RaceCar(5);
        car.display();
        car.addFuel();
        car.display();
        fastCar.display();
        fastCar.addFuel();
        fastCar.display();
    }
}