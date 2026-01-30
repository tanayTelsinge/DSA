package array.problems;

import java.math.BigInteger;
import java.util.PriorityQueue;

public class ThirdMaxNumber {
    
    public static int thirdMax(int[] nums) {

        PriorityQueue<BigInteger> q = new PriorityQueue<BigInteger>((a,b) -> b.intValue() - a.intValue());

        for(int num : nums) {
            if (!q.contains(num)) q.add(BigInteger.valueOf(num));
        }

        int max = q.poll().intValue();

        if (!q.isEmpty()) {
            q.poll();
        }
        return q.isEmpty() ? max : q.poll().intValue();
    }

    public static void main(String[] args) {
        int[] a = new int[]{-2147483648,1,1};

        System.out.println(thirdMax(a));
    }
}
