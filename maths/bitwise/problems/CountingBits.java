package bitwise.problems;

import java.util.Arrays;

public class CountingBits {
    /*
     * Given an integer n, return an array ans of length n + 1 such that for each i
     * (0 <= i <= n),
     * ans[i] is the number of 1's in the binary representation of i.
     * 
     * Input: n = 5
     * Output: [0,1,1,2,1,2]
     * Explanation:
     * 0 --> 0
     * 1 --> 1
     * 2 --> 10
     * 3 --> 11
     * 4 --> 100
     * 5 --> 101
     */

    // this is n log n, can we optimize to log(n)?
    public static int[] countBits(int n) {
        int[] arr = new int[n + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = countSetBits(i);
        }
        return arr;
    }

    //check below at last, basically we use stored i & (i - 1) and add 1 in it. (DP)
    public static int[] countBitsOptimized(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i < bits.length; i++) {
            bits[i] = bits[i & (i - 1)] + 1;
        }
        return bits;
    }

    public static int countSetBits(int n) {
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp = temp & (temp - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Arrays.stream(countBits(5)).forEach(e -> System.out.print(e + " "));
    }

}

/*
 * 
 * Optimized flow
 * 
 * bits[0] = 0 (default)
 * 
 * i = 1 (0001)
 * i & (i-1) = 0
 * bits[1] = bits[0] + 1 = 1
 * 
 * i = 2 (0010)
 * i & (i-1) = 0
 * bits[2] = bits[0] + 1 = 1
 * 
 * i = 3 (0011)
 * i & (i-1) = 2
 * bits[3] = bits[2] + 1 = 2
 * 
 * i = 4 (0100)
 * i & (i-1) = 0
 * bits[4] = bits[0] + 1 = 1
 * 
 * i = 5 (0101)
 * i & (i-1) = 4
 * bits[5] = bits[4] + 1 = 2
 * 
 * i = 6 (0110)
 * i & (i-1) = 4
 * bits[6] = bits[4] + 1 = 2
 * 
 * i = 7 (0111)
 * i & (i-1) = 6
 * bits[7] = bits[6] + 1 = 3
 * 
 * i = 8 (1000)
 * i & (i-1) = 0
 * bits[8] = bits[0] + 1 = 1
 * 
 */