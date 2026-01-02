package gcd_lcm;

public class GCDArray {

    public static void main(String[] args) {

        int[] arr = { 20, 30, 50 };

        int res = gcdOfArray(arr);
        System.out.println(res);
    }

    public static int gcdOfArray(int[] arr) {
        int result = 0;
        for (int n : arr) {
            result = gcd(n, result);
            if (result == 1) {
                break;
            }
        }
        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
