package java_practice;

public class BestBuySell {
    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE, ans = 0;
        for(int p : prices){
            min = Math.min(min, p);
            ans = Math.max(ans, p - min);
        }
        return ans;
    }

    public static void main(String[] args){
        int[][] tests = {
            {7, 1, 5, 3, 6, 4},   // expected: 5
            {7, 6, 4, 3, 1},      // expected: 0 (prices only decrease)
            {1, 2},               // expected: 1
            {2, 1},               // expected: 0
            {1},                  // expected: 0 (single element)
            {3, 3, 3, 3},        // expected: 0 (all same)
            {1, 2, 3, 4, 5},     // expected: 4 (monotonic increase)
        };

        for (int[] prices : tests) {
            System.out.println(java.util.Arrays.toString(prices) + " -> " + maxProfit(prices));
        }
    }
    
}
