public class MyClass
{
    int a;
    int b;

    public MyClass(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    // ... Method-method lainnya
    // Hanya pengetesan saja
    public static void main(String[] args)
    {
        MyClass myObject = new MyClass(5, 10);
        System.out.println(myObject.a);
        System.out.println(myObject.b);
    }

}