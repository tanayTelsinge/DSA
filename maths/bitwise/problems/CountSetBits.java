package bitwise.problems;

public class CountSetBits {

    // Also known as Hamming Weight or Brian Kernighan's Algo

    // 191. Number of 1 Bits (Easy), for number 'n', count no of set bits in its binary
    // representation.

    // i/p n = 11, o/p = 3 (1011)
    // Trick : n & (n - 1)
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }

    public static int hammingWeight(int n) {
        int ans = 0;

        while (n != 0) { //because n & (n - 1) remove 1 set bit, finally it becomes 0.
            n = n & (n - 1);
            ans++;
        }

        return ans;
    }
}
