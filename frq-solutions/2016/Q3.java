public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] blacksquares) {
        this.puzzle = new Square[blacksquares.length][blacksquares[0].length];
        int count = 1;
        for(int i = 0; i < puzzle.length; i++) {
            for(int j = 0; j < puzzle[i].length; j++) {
                if(toBeLabeled(i, j, blacksquares)) {
                    puzzle[i][j] = count;
                    count++;
                }
            }
        }
    }

    private boolean toBeLabeled(int r, int c, boolean[][] blacksquares) {
        if(blacksquares[r][c] == false) {
            if(r!= 0 & c != 0) {
                if(blacksquares[r-1][c] == false && blacksquares[r][c-1] == false )
                    return false;
            }
            return true;
        }
        return false;
    }
}
