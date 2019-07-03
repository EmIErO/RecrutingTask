import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    public static Map<String, Integer> letters = new HashMap<String, Integer>();

    private String word;


    static {
        letters.put("Q", 10);
        letters.put("Z", 10);
        letters.put("J", 8);
        letters.put("X", 8);
        letters.put("K", 5);
        letters.put("F", 4);
        letters.put("H", 4);
        letters.put("V", 4);
        letters.put("W", 4);
        letters.put("Y", 4);
        letters.put("B", 3);
        letters.put("C", 3);
        letters.put("M", 3);
        letters.put("P", 3);
        letters.put("D", 2);
        letters.put("G", 2);
        letters.put("A", 1);
        letters.put("E", 1);
        letters.put("I", 1);
        letters.put("O", 1);
        letters.put("U", 1);
        letters.put("L", 1);
        letters.put("N", 1);
        letters.put("R", 1);
        letters.put("S", 1);
        letters.put("T", 1);

    }

    public Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getScore() {
        int score = 0;
        char[] arr = word.toCharArray();

        for (char letter : arr) {
            score += letters.get(String.valueOf(letter));
        }
        return score;
    }

    public static void main(String[] args) {
        Scrabble s = new Scrabble("jkq");
        System.out.println(s.getScore());
    }


}
