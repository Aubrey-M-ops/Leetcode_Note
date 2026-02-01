package java_practice;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static int[] Product(int[] nums){
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i = 1; i < nums.length; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[][] testcases = {
            {0},
            {1},
            {1,2,3,4},
            {-1,1,0,-3,3}
        };

        for(int[] testcase : testcases){
            System.out.println(Arrays.toString(testcase) + ">>>>>>>>" + Arrays.toString(Product(testcase)));
        }
    }

}
