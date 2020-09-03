package Homework.HW1;

public class PrimeNumber {
    public static boolean isPrime(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else {
            if (n == 0 || n == 1) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
