import java.util.ArrayList;
import java.util.Arrays;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Lucas Huang
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        ArrayList<String> misspelled = new ArrayList<String>();
        for (int i = 0; i < text.length; i++) {
            int index = Arrays.binarySearch(dictionary, text[i]);
            if (index < 0 && !misspelled.contains(text[i])) {
                misspelled.add(text[i]);
            }
        }
        return misspelled.toArray(new String[0]);
    }
}
