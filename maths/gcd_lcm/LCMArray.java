package gcd_lcm;

public class LCMArray {
    
    public static void main(String[] args) {
           int[] arr = { 20, 30, 50 };

        int res = lcmOfArray(arr);
        System.out.println(res);
    }

    public static int lcmOfArray(int[] arr) {
        int result = 1;
        for(int n : arr) {
            result = lcm(result, n);
            if (result == 0) {
                return 0;
            }
        }
        return result;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a / gcd(a, b)) * b;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
