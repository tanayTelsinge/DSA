package prime.problems;

import java.util.Scanner;

//LC 204. Count Primes - Medium
//Given an integer n, return the number of prime numbers that are strictly less than n.

public class CountPrimesLC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countPrimes(n));

        sc.close();
    }

    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        sieve(isPrime);

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i])
                count++;
        }

        return count;
    }

    public static void sieve(boolean[] isPrime) {

        // init
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
