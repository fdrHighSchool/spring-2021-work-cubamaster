import java.util.List;

public class StringFormatter {

    public static int totalLetters(List<String> wordlist) {
        int totalLetters = 0;
        for(String word: wordlist) {
            totalLetters += word.length();
        }
        return totalLetters;
    }

    public static int basicGapWidth(List<String> wordlist, int formattedLen) {
        int  basicGapWidth = (formattedLen - totalLetters(wordlist)) / (wordlist.size() - 1);
        return basicGapWidth;
    }

    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        int leftoverSpaces = (formattedLen - totalLetters(wordList)) % (wordList.size() - 1);
        return leftoverSpaces;
    }




}
