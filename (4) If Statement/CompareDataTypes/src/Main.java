import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Soal 1
        /*
        * Method dari class String apa yang digunakan untuk membandingkan dua object String berisi string yang sama?
        * !!!!!!!!Method equals!!!!!!!!
        * Contoh : nama1.equals(nama2)
        */

//        Soal 2
        double a = (0.3 * 3) + 0.1;
        double b = 1;
        if (a == b)
        {
            System.out.println("a dan b sama.");
        }
        else
        {
            System.out.println("a dan b tidak sama.");
        }

//        Soal 3
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ketikkan Y untuk keluar: ");
        String input = keyboard.nextLine();
        input = "Y";

        if (input == "Y")
        {
            System.out.println("Selamat tinggal.");
        }
    }
}