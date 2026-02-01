package java_practice;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() == 1)
            return false;
        // Java uses Deque
        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if (top != map.get(c))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args){
        String[] tests = {
            "()",
            "()[]{}",
            "([)]"
        };

        for(String s : tests){
            System.out.println("Input>>>" + s + " => " + isValid(s));
        }
    }

}
