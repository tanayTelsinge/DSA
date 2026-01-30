package array.problems;

public class FindNumberOfEvenDigits {
    /*
     * Given an array nums of integers, return how many of them contain an even
     * number of digits.
     * Example 1:
     * 
     * Input: nums = [12,345,2,6,7896]
     * Output: 2
     */

    public int findNumbers(int[] nums) {
        int cnt = 0;

        for (int num : nums) {
            if (isEvenCount(num)) {
                cnt++;
            }
        }

        return cnt;
    }

    public boolean isEvenCount(int num) {
        int cnt = 0;

        while (num > 0) {
            cnt++;
            num /= 10;
        }
        return (cnt & 1) == 0;
    }

    public static void main(String[] args) {

    }
}
