package modular_arithmetic;

public class ModPow {

    public static void main(String[] args) {
        System.out.println(binPow(2, 13, 1_000_000_007));
    }

    // iterative - sc big o (log power)
    static long binPow(long n, long power, long mod) {
        long result = 1;
        n = n % mod;

        while (power > 0) {
            if ((power & 1) == 1) {
                result = (result * n) % mod;
            }
            n = (n * n) % mod;
            power >>= 1;
        }
        return result;
    }

    //recursive sc - big o (log power) tc big o (log power)
    static long binpowOptimized(long n, long power, long mod) {
        if (power == 0)
            return 1;

        long half = binpowOptimized(n, power / 2, mod);
        half = (half * half) % mod;

        if (power % 2 == 1) {
            half = (half * n) % mod;
        }

        return half;
    }

}
