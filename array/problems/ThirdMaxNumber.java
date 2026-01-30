package array.problems;

import java.util.PriorityQueue;

public class ThirdMaxNumber {
    
    public static int thirdMax(int[] nums) {

        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> Integer.compare(b, a));

        for(int num : nums) {
            if (!q.contains(num)) q.add(num);
        }

        int max = q.poll();

        if (!q.isEmpty()) {
            q.poll();
        }
        return q.isEmpty() ? max : q.poll();
    }

    public static void main(String[] args) {
        int[] a = new int[]{-2147483648,1,1};

        System.out.println(thirdMax(a));
    }
}
