import java.util.HashMap;
import java.util.Map;

public class BracketChecker {

    public static Map<String, String> bracketPairs;
    private String brackets;

    static {
        bracketPairs = new HashMap<>();
        bracketPairs.put("[", "]");
        bracketPairs.put("]", "[");
        bracketPairs.put("(", ")");
        bracketPairs.put(")", "(");
        bracketPairs.put("{", "}");
        bracketPairs.put("}", "{");
    }

    public BracketChecker(String brackets) {
        this.brackets = brackets;
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {

        for (int i = 0; i < brackets.length(); i++) {
            String brace = String.valueOf(brackets.charAt(i));
            if (!(brackets.contains(bracketPairs.get(brace)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BracketChecker bracketChecker = new BracketChecker("{}[](");
        System.out.println(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }
}
