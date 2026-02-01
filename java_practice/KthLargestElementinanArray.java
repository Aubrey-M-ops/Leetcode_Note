package java_practice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {

    public static int kLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: nums){
            pq.offer(num);
            if(pq.size() > k) pq.poll();
        }
        return pq.poll();

    }

    public static void main(String[] args) {
        int [][] testcases = {
            {3,2,1,5,6,4},
            {3,2,3,1,2,4,5,5,6}
        };

        for(int[] testcase: testcases)
        System.out.println(Arrays.toString(testcase) + ">>>>>>" + kLargest(testcase, 3));
    }
    
}
