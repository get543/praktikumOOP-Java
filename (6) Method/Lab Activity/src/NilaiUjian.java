import java.util.Scanner;

public class NilaiUjian
{
    // Tuliskan definisi-definisi method yang diperlukan di bawah comment ini.
    public static double hitungRatarata(double nilai1, double nilai2, double nilai3, double nilai4, double nilai5)
    {
        return (nilai1 + nilai2 + nilai3 + nilai4 + nilai5) / 5;
    }

    public static char tentukanGrade(double ratarata)
    {
        char grade = ' ';

        if (ratarata < 60)
            grade = 'E';
        else if (ratarata >= 60 && ratarata <= 70)
            grade = 'D';
        else if (ratarata >= 70 && ratarata <= 80)
            grade = 'C';
        else if (ratarata >= 80 && ratarata < 90)
            grade = 'B';
        else if (ratarata >= 90)
            grade = 'A';

        return grade;
    }





    /****************************************
     *  !!! JANGAN UBAH KODE DI BAWAH !!!   *
     ****************************************/
    public static void main(String[] args)
    {
        double nilai1;
        double nilai2;
        double nilai3;
        double nilai4;
        double nilai5;
        double ratarata;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian ke-1: ");
        nilai1 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-2: ");
        nilai2 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-3: ");
        nilai3 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-4: ");
        nilai4 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-5: ");
        nilai5 = keyboard.nextDouble();

        ratarata = hitungRatarata(nilai1, nilai2, nilai3, nilai4, nilai5);

        System.out.println("Rata-rata nilai ujian = " + ratarata);
        System.out.println("Grade Anda = " + tentukanGrade(ratarata));

    }
}
