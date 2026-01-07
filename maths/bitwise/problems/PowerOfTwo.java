package bitwise.problems;

public class PowerOfTwo {

    // 231. Power of Two (Easy), true if n is power of two, else false

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }
}
