public class Student extends Person
{
    private int id;
    private static int nextId = 0;

    public Student(String theName)
    {
        super(theName);
        id = nextId;
        nextId++;
    }

    public int getId()
    {
        return id;
    }

    public void setId (int theId)
    {
        this.id = theId;
    }

    // No 3
    public String getFood()
    {
        return "Bakso";
    }

    // Bagian pengecekan
    public static void main(String[] args) {
        Student student1 = new Student("Udin");
        Student student2 = new Student("Jarso");
        System.out.println(student1.getId() + student1.getFood());
        System.out.println(student2.getId() + student2.getFood());
    }
}