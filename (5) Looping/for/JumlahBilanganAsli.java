import java.util.Scanner;

public class JumlahBilanganAsli
{
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        n = keyboard.nextInt();

        for (int i = 0; i <= n; i++)
        {
            total += i;
        }

        System.out.println("Jumlah bilangan asli dari 1 s.d " + n + " = " + total);
    }
}
