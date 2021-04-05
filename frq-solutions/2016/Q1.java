import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomStringChooser {
    String[] words;
    private ArrayList<String> word2 = new ArrayList<String>(Arrays.asList(words));

    public RandomStringChooser(String[] words) {
        this.words = words;
    }

    public String getNext() {
        if(word2.isEmpty())
            return "NONE";
        Random random = new Random();
        int picking_number = random.nextInt(word2.size());
        String return_word = word2.get(picking_number);
        word2.remove(picking_number);
        return return_word;
    }

    public class RandomLetterChooser extends RandomStringChooser {
        public RandomLetterChooser(String str) {
            super(getSingleLetters(str));
        }

        public static String[] getSingleLetters(String str) {
            ArrayList<String> letters = new ArrayList<>();
            for(int i = 0; i < str.length(); i++) {
                letters.add(str.substring(i,i+1));
            }
            String[] return_letters = new String[letters.size()];
            for(int i = 0; i < letters.size(); i++) {
                return_letters[i] = letters.get(i);
            }
            return return_letters;
        }
    }

}
