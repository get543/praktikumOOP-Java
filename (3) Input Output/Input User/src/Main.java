import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int sisi;
        int luas;

        Scanner scan = new Scanner(System.in);


//        double sisi = scan.nextDouble();
//        String sisi = scan.nextLine();

//        System.out.print(sisi);
        // =================================================================
        // Soal PreLab
        // =================================================================
        String str = "Herman";
        int n = str.length();
        String misteri = str.substring(0, 1) + str.substring(n - 1, n);
        System.out.println(misteri);

        String angka;
        angka = "33" + 3;
        System.out.println(angka);

        System.out.print("Be careful\n");
        System.out.print("This might/n be a trick ");
        System.out.print("question.");

        System.out.println();
        System.out.println("C:\\new\\praktikum");

        System.out.printf("%,.2f\n", Math.PI);

        double temp = 78.42819;
        System.out.printf("Temperatur = %.1f derajat.\n", temp);

        double harga = 1234567.456;
        System.out.printf("Rp.%,.2f\n", harga);

        int number = 123456;
        System.out.printf("%010d\n", number);
    }
}
