import java.util.*;
class Main  {
    public static void main(String[] args) {
       Board board = new Board();

        //print first grid
        for(int count = 0; count < 5; count++) {
            System.out.println("---------------GENERATION " + board.currentGeneration + "---------------");
            board.printGrid();
            board.grid = board.nextGeneration(board.grid);
        }
    }
}

