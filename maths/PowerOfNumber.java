
public class PowerOfNumber {
//Input: 2^10
//Output: 1024

//mistakes
//binpow(n, half) * binpow(n, half) - this results in 0(n) as 2 * 0(n/2)
//binpowOptimized is 0(log n)

    public static void main(String[] args) {

        int res = pow(2, 50);
        System.out.println(res);

        int binres = binpow(2, 50);
        System.out.println(binres);


        long binoptres = binpowOptimized(2, 50);
        System.out.println(binoptres);
    }

    //tc 0(n) sc()
    public static int pow(int n, int power) {
        int ans = 1;    
        for(int i = 1; i <= power; i++) {
            ans = ans * n;
        }
        return ans;
    }

    public static int binpow(int n, int power) {
        if (power == 1) {
            return n;
        } else if (power == 0) {
            return 1;
        }
        int ans = 1;
        int half = power / 2;
        if (power % 2 == 0) {
            //if even, half * half
            ans = binpow(n, half) * binpow(n, half);
        } else {
            //if odd, half * half * n
            ans = binpow(n, half) * binpow(n, half) * n;
        }
        return ans;
    }


    public static long binpowOptimized(int n, int power) {
        if (power == 0) return 1;

        long half = binpowOptimized(n, power / 2);

        if (power % 2 == 0) {
            return half * half;
        } else {
            return half * half * n;
        }
    }
}
