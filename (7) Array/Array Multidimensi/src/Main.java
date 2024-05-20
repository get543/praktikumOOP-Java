import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
//        Soal 1
        int[][] grades = new int[30][10];
        System.out.println(Arrays.deepToString(grades));

//      Soal 2
        /*
        * Apabila kita menarik garis diagonal dari sebuah array dua dimensi 3x3 bernama board dari pojok kiri atas
        * sampai kanan bawah, elemen-elemen mana sajakah yang masuk dalam area diagonal tersebut?
        * Jawaban : board[0][0], board[1][1], board[2][2]
        */

//        Soal 3
        int[][] arrAngka = new int[9][11];
        arrAngka[0][0] = 145;
        arrAngka[8][10] = 18;
        System.out.println(Arrays.deepToString(arrAngka));

//        Soal 4
        int[][] board = new int[8][8];

        // Tuliskan kode Anda di bawah.
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                if ((i + j) % 2 != 0)
                {
                    board[i][j] = 1;
                }
            }
        }
        System.out.print(Arrays.deepToString(board));
        System.out.print("\n");

//        Soal 5
        double total = 0;
        double[][] nilai = { {1.1, 2.1}, {3.1, 4.1} };

        // Tuliskan kode Anda di bawah!
        for (int i = 0; i < nilai.length; i++)
        {
            for (int j = 0; j < nilai[i].length; j++)
            {
                total += nilai[i][j];
            }
        }

        System.out.println(total);
    }
}