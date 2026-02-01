package java_practice;

import java.util.*;

public class MergeInterval {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0];
        res.add(cur);

        for(int i = 1; i < intervals.length; i++){
            int[] _interval = intervals[i];
            // if overlap, merge
            if(_interval[0] <= cur[1]){
                cur[1] = Math.max(cur[1], _interval[1]);
            }else{
                // no overlap, add new interval
                cur = _interval;
                res.add(cur);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][][] tests = {
                { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } },
                { { 1, 4 }, { 4, 5 } }
        };

        for (int[][] testcase : tests) {
            System.out.println(Arrays.deepToString(testcase) + " >>>>>>> " + Arrays.deepToString(merge(testcase)));
        }
    }
}
