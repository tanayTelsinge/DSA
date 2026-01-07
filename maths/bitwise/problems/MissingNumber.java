package bitwise.problems;

public class MissingNumber {
    
    //268. Missing Number - Given n, find the missing number

    // sum (n * (n + 1))/2 
    // XOR - better avoids integer overflow.
    //All numbers from 0 to n appear twice except the missing one, which appears once, so XOR leaves it.”
    public static void main(String[] args) {

       int[] nums = new int[] {3, 0, 1};

       int n = missingNumber(nums);
       int bitN = missingNumberXOR(nums);

       System.out.println(n + " : " + bitN);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;

        int sum = (n * (n + 1)) / 2;

        for(int x : nums) {
            sum -= x;
        }
        return sum;
    }

     public static int missingNumberXOR(int[] nums) {
        int n = nums.length;

        int xor = 0;

        for(int i = 0; i <= n; i++) {
            xor ^= i;
        }

        for(int x : nums) {
            xor ^= x;
        }
        return xor;
    }
}
