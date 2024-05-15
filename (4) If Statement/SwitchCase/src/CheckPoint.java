import java.util.Scanner;

public class CheckPoint {
    public static void main(String[] args) {
        int userNum;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan angka 1, 2, atau 3: ");
        userNum = keyboard.nextInt();
        // Tuliskan statement switch di bawah
        switch(userNum)
        {
            case 1:
                System.out.println("satu");
                break;
            case 2:
                System.out.println("dua");
                break;
            case 3:
                System.out.println("tiga");
                break;
            default:
                System.out.println("error");
                break;
        }

        char pilihan = 'E';
        switch (pilihan)
        {
            case 'A':
                System.out.println("Anda memilih A.");
                break;
            case 'B':
                System.out.println("Anda memilih B.");
                break;
            case 'C':
                System.out.println("Anda memilih C.");
                break;
            case 'D':
                System.out.println("Anda memilih D.");
                break;
            default:
                System.out.println("Pilihan Anda salah.");
                break;
        }

        int funny = 7, serious = 15;
        funny = serious * 2;
        switch (funny)
        {
            case 0 :
                System.out.println("That is funny.");
                break;
            case 30:
                System.out.println("That is serious.");
                break;
            case 32:
                System.out.println("That is seriously funny.");
                break;
            default:
                System.out.println(funny);
        }
    }
}
