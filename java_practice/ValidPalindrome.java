package java_practice;

public class ValidPalindrome {

    public static boolean isValid(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }

            if (leftChar != rightChar) {
                return false;
            } 
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testcases = {
                "A man, a plan, a canal: Panama",
                // "race a car",
                // " "
        };
        for (String testcase : testcases) {
            System.out.println(testcase + ">>>>>>" + isValid(testcase));
        }
    }

}