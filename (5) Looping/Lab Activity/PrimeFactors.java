/*
I got this shit from AI
 */

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> findPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        if (number <= 1) {
            return primeFactors;
        }

        for (int divisor = 2; divisor <= number; divisor++) {
            while (number % divisor == 0) {
                primeFactors.add(divisor);
                number /= divisor;
            }
        }

        return primeFactors;
    }

    public static void main(String[] args) {
        int number = 123;
        List<Integer> primeFactors = findPrimeFactors(number);

        System.out.print("Prime factors of " + number + ": ");
        for (int factor : primeFactors) {
            System.out.print(factor + " ");
        }
        System.out.print("\n");
    }
}