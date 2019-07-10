import java.util.*;

public class BracketChecker {

    public static Map<Character, Character> bracketPairs;
    private String brackets;

    static {
        bracketPairs = new HashMap<>();
        bracketPairs.put(']', '[');
        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
    }

    public BracketChecker(String brackets) {
        brackets = brackets.replaceAll("[^()\\[\\]{}]", "");
        this.brackets = brackets;
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {

        if (brackets.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);

            if (bracketPairs.containsValue(currentBracket)) {
                stack.push(currentBracket);
            } else if (bracketPairs.containsKey(currentBracket)) {
                if (stack.isEmpty()) { return false; }

                char actualBracket = stack.peek();
                char expectedBracket = bracketPairs.get(currentBracket);

                if (actualBracket == expectedBracket) {
                    stack.pop();
                } else { return false; }
            }
        }
        return stack.isEmpty();
    }
}
