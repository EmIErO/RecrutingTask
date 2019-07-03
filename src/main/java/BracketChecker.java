import java.util.*;

public class BracketChecker {

    public static Map<String, String> bracketPairs;
    private List<String> openingBrackets = new ArrayList<>(Arrays.asList("(", "{", "["));
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

        if (brackets.length() % 2 == 1) {
            return  false;
        }

        for (int i = 0; i < brackets.length() / 2; i++) {
            String currentBrace = String.valueOf(brackets.charAt(i));
            if (!openingBrackets.contains(currentBrace)) {
                return false;
            }
            String closingBrace = bracketPairs.get(currentBrace);
            if(!())
        }

    }

    public static void main(String[] args) {
        BracketChecker bracketChecker = new BracketChecker("{}[](");
        System.out.println(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }
}
