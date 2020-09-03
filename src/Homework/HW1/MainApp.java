package Homework.HW1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many happy primes? ");
        int n;
        try {
            n = kb.nextInt();
        } catch (Exception e) {
            throw new InputMismatchException("Please input an integer.");
        }
        if (n < 1) {
            throw new InputMismatchException("Input must be a natural number.");
        }
        int i = 0;
        int count = 0;
        while(count < n) {
            if (PrimeNumber.isPrime(i) && HappyNumber.isHappy(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
