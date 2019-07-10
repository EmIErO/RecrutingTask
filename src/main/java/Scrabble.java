import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Scrabble {

    public static Map<String, Integer> letters = new HashMap<String, Integer>();

    private String word;


    static {
        String[] tenPointsLetters = {"Q", "Z"};
        String[] eightPointsLetters = {"J", "X"};
        String[] fivePointsLetters = {"K"};
        String[] fourPointsLetters = {"F", "H", "V", "W", "Y"};
        String[] threePointsLetters = {"B", "C", "M", "P"};
        String[] twoPointsLetters = {"D", "G"};
        String[] onePointLetters = {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"};

        loadLetters(tenPointsLetters, 10);
        loadLetters(eightPointsLetters, 8);
        loadLetters(fivePointsLetters, 5);
        loadLetters(fourPointsLetters, 4);
        loadLetters(threePointsLetters, 3);
        loadLetters(twoPointsLetters, 2);
        loadLetters(onePointLetters, 1);
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
        if (word.isEmpty() || word == null) {
            return 0;
        }

        Pattern.compile("").splitAsStream(word)
                .mapToInt(i -> letters.get(i))
                .sum();

        return word.chars()
                .mapToObj(i -> (char) i)
                .mapToInt(i ->letters.get(String.valueOf(i)))
                .sum();
    }

    private static void loadLetters(String[] arr, int points) {

        Arrays.stream(arr)
                .map(String::toUpperCase)
                .forEach(i ->letters.put(i, points));
    }

    public static void main(String[] args) {

        Scrabble s = new Scrabble("aaa");
        System.out.println(s.getScore());

    }


}
