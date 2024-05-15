public class Main {
    public static void main(String[] args) {
        int skor = 100;
        int y = 0;
        int x = 0;
        boolean minimum = true;
        int hours = 0;

        if (skor >= 60) {
            System.out.println("Anda Lulus");
        }

//        Soal 1
        if (y == 0)
        {
            x = 100;
        }
        System.out.println(x);

//        Soal 2
        if (minimum) {
            hours = 10;
        }
        System.out.println(hours);

//        Soal 3
        int n = 1;
        int k = 2;
        int r = n;
        if (k < n)
        {
            r = k;
        }
        System.out.println(n);
        System.out.println(k);
        System.out.println(r);

//        Soal 4
        int gaji = 1000000;
        int jam = 45;

        if (jam > 40) {
            gaji *= 1.5;
        }
        System.out.println(gaji);

//        --------------------------------- IF ELSE ---------------------------------
//        Soal 1
        int penjualan = 1;
        double komisi = 0;

        if (penjualan >= 500000) {
            komisi = 0.2;
        } else {
            komisi = 0.10;
        }
        System.out.println(komisi);

//        Soal 2
        int x1 = 0;
        int y1 = 10;

        if (y1 == 10) {
            x1 = 0;
        } else {
            x1 = 1;
        }
        System.out.println(x1);
        System.out.println(y1);

//        ---------------------- IF BERSARANG ----------------------
//        Soal 1
        int jumlah1 = 11;
        int jumlah2 = 1;

        if (jumlah1 > 10) {
            if (jumlah2 < 100) {
                if (jumlah1 > jumlah2) {
                    System.out.println(jumlah1);
                } else {
                    System.out.println(jumlah2);
                }
            }
        }

//        Soal 2
        int x2 = 1;
        int y2 = 19;
        int z = 0;

        if (x2 > 0) {
            if (y2 < 20) {
                z = 1;
            } else {
                z = 0;
            }
        }
        System.out.println(x2);
        System.out.println(y2);
        System.out.println(z);

//        --------------------------- IF ELSEIF ---------------------------
//        Soal 1
        String grade = "";
        int score = 68;

        if (score < 60) {
            grade = "E";
        } else if (score < 70) {
            grade = "D";
        } else if (score < 80) {
            grade = "C";
        } else if (score < 90) {
            grade = "B";
        } else if (score >= 90) {
            grade = "A";
        }
        System.out.println(grade);

//        Soal 2
        double a, b;

        a = -2.5;

        if (a > 0.0)

        {

            b = a;

        }

        else if (a < 0.0)

        {

            b = -a;

        }

        else

        {

            b = 0;

        }
        System.out.println(b);

//        Soal 3
        int s = 0;
        int x3 = 0;

        if (x3 > 0) {
            s = 1;
        } else if (x < 0) {
            s = -1;
        } else if (x == 0) {
            s = 0;
        }
        System.out.println(s);

        int aa = 2, bb = 4, cc =6;

        if (aa == 4 || bb > 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (cc >= 6 && aa > 3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (bb != 1 && cc != 3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (aa >= -1 || aa < bb) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (!(a > 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        Soal 2
        int aaa = 5;
        if (!(aaa > 8))
        {
            System.out.println("Kondisi true");
        }
        else
        {
            System.out.println("Kondisi false");
        }

//        Soal 3
        int kecepatan = 150;

        if (kecepatan >= 0 && kecepatan <= 200) {
            System.out.println("Angka valid");
        } else {
            System.out.println("Angka tidak valid");
        }
    }
}