import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }
    public ArrayList<String> getDelimetersList (String[] tokens) {
        ArrayList<String> delimiters = new ArrayList<>();
        for(String s : tokens) {
            if(s.equals(this.openDel) || s.equals(this.closeDel))
                delimiters.add(s);
        }
        return delimiters;
    }
    public boolean isBalanced(ArrayList<String> delimiters) {
        int open = 0;
        int close = 0;
        for(String s : delimiters) {
            if (s.equals(openDel))
                open ++;
            if(s.equals(closeDel))
                close ++;
            if (close > open)
                return false;
        }
        if (open != close)
            return false;
        return true;
    }
}
