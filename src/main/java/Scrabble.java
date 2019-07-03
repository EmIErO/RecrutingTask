import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    public static Map<String, Integer> letters = new HashMap<String, Integer>();

    private String word;

    public Scrabble(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getScore() {

    }


}
