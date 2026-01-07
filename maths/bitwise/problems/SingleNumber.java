package bitwise.problems;

public class SingleNumber {

    //LC 136. every element appears twice in array except 1 find it. (Easy)
    public static int singleNumber(int[] nums) {
        int ans = 0;

        for (int x : nums) {
            ans ^= x;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 2, 2, 4 }));
    }
}
