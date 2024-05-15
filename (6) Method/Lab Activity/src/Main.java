public class Main
{
    // Tulis definisi method hitungVokal di bawah.
    // Hanya tulis definisi method. Jangan tulis program lengkap.
    public static int hitungVokal(String huruf)
    {
        int vocalCounter = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < huruf.length(); i++)
        {
            for (char vowel : vowels)
            {

                if (Character.toLowerCase(huruf.charAt(i)) == vowel)
                {
                    vocalCounter += 1;
                    break;
                }
            }
        }
        return vocalCounter;
    }

//    Soal 2
// [1] Tulis definisi method firstDigit di bawah.
    public static int firstDigit(int number)
    {
        int firstDigit = 0;
        while (number != 0)
        {
            firstDigit = number % 10;
            number /= 10;

        }
        return firstDigit;
    }

    // [2] Tulis definisi method lastDigit di bawah.
    public static int lastDigit(int number)
    {
        return number % 10;
    }

    // [3] Tulis definisi method banyakDigit di bawah.
    public static int banyakDigit(int number)
    {

        return (int) (Math.log10(number) + 1);
    }




    public static void main(String[] args)
    {
        System.out.println(hitungVokal("Selamat Pagi Indonesia"));
        System.out.println(hitungVokal("Sungai Mississippi"));

        System.out.println(firstDigit(1729));
        System.out.println(lastDigit(1729));
        System.out.println(banyakDigit(1729));
    }
}