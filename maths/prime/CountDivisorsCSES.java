package prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDivisorsCSES {
    //CSES Problem
    // for given no. use SPF and divide by it, store count and final sum of counts
    // will be answer.
    // MAX we took, because we need initial size for SPF.

    public static int MAX = 1_000_000;

    public static void main(String[] args) throws IOException {

        int[] spf = new int[MAX + 1];

        precompute(spf);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // used this because, else after each n we will get answer, we want n answers at last.

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = countDivisors(n, spf);
            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }

    public static int countDivisors(int n, int[] spf) {
        if (n == 1)
            return 1;

        int count = 1;

        while (n > 1) {
            int prime = spf[n];
            int power = 0;

            while (n % prime == 0) {
                power++;
                n /= prime;
            }

            count *= (power + 1);
            //12 = 2^2 × 3^1
            //Divisors = (2+1)(1+1) = 6
        }
        return count;
    }

    public static void precompute(int[] spf) {

        for (int i = 1; i <= MAX; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }
}
