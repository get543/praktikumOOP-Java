public class contohVariable {
    public static void main(String[] args) {
        int num;
        int num_2;
        int temp;

        num = 10;
        num_2 = 11;
        temp = 0;

        num = num_2;
        num_2 = temp;
        num = temp;

        System.out.print("Nilai variable num adalah ");
        System.out.println(num);
        System.out.print("Nilai variable num2 adalah ");
        System.out.println(num_2);
    }
  }
