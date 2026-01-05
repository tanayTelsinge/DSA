package prime;

public class SieveOfErasthoneses {
    // tc log log N
    // why used? to find prime no from 1 to N.
    // normally we go from 1 to root N, now we only go same but skip composite ones,
    // tc (N.rootN) but for this, 0(log log N), why because if log N every divisor
    // we need to check, but as we go up, prime no. reduce.
    // eg. normal 2 3 4, in sieve, 2 3 5 7 11 13 17 19 23
    public static void main(String[] args) {
        int N = 24;

        int count = sieveOfEras(N);
        System.out.println(count);
    }

    public static int sieveOfEras(int N) {

        boolean[] isPrime = new boolean[N + 1]; // as index start from 0

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= N; i++) { // instead of root N we prefer i * i
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j+=i) { // we took j = i * i because less than that is already handled by smaller prime
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int k = 2; k < isPrime.length; k++) {
            if (isPrime[k])
                count++;
        }
        return count;

    }

}
