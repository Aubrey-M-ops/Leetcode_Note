package java_practice;

import java.util.*;

public class GenerateParentheses {

    private List<String> res = new ArrayList<>();

    public void backtracking(StringBuilder path, int openNum, int closeNum, int n){
        String curStr = path.toString();
        if(curStr.length() == 2 * n){
            res.add(curStr);
            return;
        }
        // add (
        if(openNum < n){
            backtracking(path.append("("), openNum + 1, closeNum, n);
            path.deleteCharAt(path.length() - 1);
        }
        // add )
        if(closeNum < openNum){
            backtracking(path.append(")"), openNum, closeNum + 1, n);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n){
        res = new ArrayList<>();
        backtracking(new StringBuilder(), 0, 0, n);
        return res;
    }
    
    public static void main(String[] args) {
        int[] testcases = {3, 1};
        GenerateParentheses solver = new GenerateParentheses();
        for(int testcase: testcases){
            System.out.println(testcase + ">>>>" + Arrays.toString(solver.generateParenthesis(testcase).toArray()));
        }
    }
}
