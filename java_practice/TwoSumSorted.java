package java_practice;

import java.util.Arrays;

public class TwoSumSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] testcase1 = { 2, 7, 11, 15 }, testcase2 = { 2, 3, 4 };
        int target1 = 9, target2 = 6;

        System.out.println(Arrays.toString(testcase1) + ">>>>>>" + Arrays.toString(twoSum(testcase1, target1)));
        System.out.println(Arrays.toString(testcase2) + ">>>>>>" + Arrays.toString(twoSum(testcase2, target2)));
    }
}
