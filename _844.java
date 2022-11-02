import java.util.Stack;

public class _844 {
    public static boolean backspaceCompare(String S, String T) {
        return compute(S).equals(compute(T));
    }

    public static Stack<Character> compute(String S) {
        Stack<Character> stack = new Stack();
        for (char c : S.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));

    }
}
