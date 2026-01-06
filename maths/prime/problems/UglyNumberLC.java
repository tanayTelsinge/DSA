package prime.problems;

import java.util.Scanner;

public class UglyNumberLC {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(isUgly(n));
        s.close();
    }

    public static int MOD = 1_000_000_007;
    public static int MAX = Integer.MAX_VALUE % MOD;


    public static boolean isUgly(int n1) {
        //if (n <= 10) return true;
        int n = n1 % MOD;
        int[] spf = new int[MAX];
        sieve(spf);

        return fact(n, spf);
    }

    public static boolean fact(int n, int[] spf) {
        while (n > 1) {
                int prime = spf[n];
                if (prime > 5) return false;
                while (n % prime == 0) {
                    n /= prime;
                }
        }
        return true;
    }

    public static void sieve(int[] spf) {

        for(int i = 0; i < spf.length; i++) {
            spf[i] = i;
        }

        for(int i = 2; i * i < spf.length; i++) {
            if (spf[i] == i) {
                for(int j = i * i; j < spf.length; j+=i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }
}
