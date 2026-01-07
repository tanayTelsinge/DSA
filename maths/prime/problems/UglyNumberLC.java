package prime.problems;

import java.util.Scanner;

public class UglyNumberLC {
    // An ugly number is a positive integer which does not have a prime factor other
    // than 2, 3, and 5.

    /*
     * Example 1:
     * 
     * Input: n = 6
     * Output: true
     * Explanation: 6 = 2 × 3
     * Example 2:
     * 
     * Input: n = 1
     * Output: true
     * Explanation: 1 has no prime factors.
     * Example 3:
     * 
     * Input: n = 14
     * Output: false
     * Explanation: 14 is not ugly since it includes the prime factor 7.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(isUgly(n));
        s.close();
    }

    public static int MOD = 1_000_000_007;
    public static int MAX = Integer.MAX_VALUE % MOD;

    public static boolean isUgly(int n) {
        int[] primes = { 2, 3, 5 };
        if (n < 1)
            return false;
        for (int i = 0; i < primes.length; i++) {
            while (n % primes[i] == 0) {
                n /= primes[i];
            }
        }

        return n <= 1 ? true : false;
    }
}
