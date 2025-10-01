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
    private static final int A_START = 1;
    private static final int B_START = 9130;
    private static final int C_START = 16743;
    private static final int D_START = 29785;
    private static final int E_START = 38323;
    private static final int F_START = 44385;
    private static final int G_START = 49850;
    private static final int H_START = 54355;
    private static final int I_START = 59879;
    private static final int J_START = 65618;
    private static final int K_START = 66847;
    private static final int L_START = 68384;
    private static final int M_START = 72940;
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
