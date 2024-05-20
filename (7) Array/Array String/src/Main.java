import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
//        Soal 1
        String[] words = new String[10];
        System.out.println(Arrays.toString(words));

//        Soal 2
        String[] planet = {"Merkurius", "Venus", "Bumi", "Mars"};
        System.out.println(Arrays.toString(planet));

//        Soal 3
        String[] hewan = {"Jerapah", "Singa", "Badak", "Kuda"};
        for (String e : hewan) {
            System.out.print(e + " ");
        }
        System.out.print("\n");

//        Soal 4
        int bykKarakter = 0;

        // Tulis loop yang menghitung banyak karakter semua elemen dari array
        // yang direferensikan variabel hewan.
        for (String e : hewan)
        {
            bykKarakter += e.length();
        }

        System.out.println(bykKarakter);
    }
}