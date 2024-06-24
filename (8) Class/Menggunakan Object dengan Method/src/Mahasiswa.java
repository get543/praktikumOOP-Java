import java.util.Scanner;

public class Mahasiswa
{
    private String nama;
    private String email;

    public Mahasiswa(String nama, String email)
    {
        this.nama = nama;
        this.email = email;
    }

    public String getData()
    {
        return nama + ", " + email;
    }

    public static Mahasiswa buatMahasiswa()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = keyboard.nextLine();

        System.out.print("Masukkan email: ");
        String email = keyboard.nextLine();

        return new Mahasiswa(nama, email);
    }

//    Hanya untuk pengetesan
    public static void main(String[] args)
    {
        Mahasiswa maba = buatMahasiswa();
        System.out.println("Mahasiswa: " + maba.getData());
    }
}