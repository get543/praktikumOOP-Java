/*
Ini buat test class Pet

JANGAN UBAH KODENYA KARENA INI DIAMBIL DARI SOAL
*/
public class TesPet
{
    public static void main(String[] args)
    {
        Pet heli = new Pet();
        heli.setNama("Heli");
        heli.setHewan("Anjing");
        heli.setUmur(3);
        System.out.println("Nama = " + heli.getNama());
        System.out.println("Hewan = " + heli.getHewan());
        System.out.println("Umur = " + heli.getUmur());
    }
}
