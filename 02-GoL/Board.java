import java.util.*;
public class Board{
    int currentGeneration;
    Cell[][] grid;

    public Board() {
        this.currentGeneration = 1;
        grid = new Cell[10][10];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                grid[i][j] = new Cell();
            }
        }
    }
    public Board(int height, int width) {
        this.currentGeneration = 1;
        grid = new Cell[height][width];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public Cell[][] nextGeneration(Cell[][] grid) {
        Cell new_grid[][] = new Cell[grid.length][grid[0].length]; // create next grid
        for(int i = 0; i < new_grid.length; i++) {
            for(int j = 0; j < new_grid[0].length; j++) {
                new_grid[i][j] = new Cell();
                new_grid[i][j].setLiveorDead(0);
            }
        }

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {

                int living_neighbors = countNeightbors(i, j); // live cells around considering cell
                // looks at every rule in which detect //will cell life or die
                if((this.grid[i][j].getLiveorDead() == 1) && (living_neighbors < 2)) {
                    new_grid[i][j].setLiveorDead(0);
                }//end of if statement
                else if((this.grid[i][j].getLiveorDead() == 1) && (living_neighbors > 3)) {
                    new_grid[i][j].setLiveorDead(0);
                }// end of if else statement
                else if ((this.grid[i][j].getLiveorDead() == 0) && (living_neighbors == 3)) {
                    new_grid[i][j].setLiveorDead(1);
                }// end of if else statement

                else {
                    new_grid[i][j].setLiveorDead(grid[i][j].getLiveorDead());
                }// end of  else statement
            }//end of first for loop
        }// end of second for loop
        this.currentGeneration++;
        return new_grid;
    }


    public void printGrid() {
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j].getLiveorDead() == 1) {
                    System.out.print("#");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }

    public int getheight() {
        return grid.length;
    }

    public int getlength() {
        return grid[0].length;
    }

    public int countNeightbors(int i, int j) {
        int living_neighbors = 0;
        for(int x = -1; x <= 1; x++) {
            for(int y = -1; y <= 1; y++) {
                int considering_x;
                int considering_y;
                if(i + x < 0)
                    considering_x = this.grid.length + x;
                else if (i + x > this.grid.length -1)
                    considering_x = x;
                else
                    considering_x = i + x;
                if(j + y < 0)
                    considering_y = this.grid[i].length + y;
                else if (j + y > this.grid.length -1)
                    considering_y = y;
                else
                    considering_y = j + y;
                if (this.grid[considering_x][considering_y].getLiveorDead() == 1)
                    living_neighbors++; // count //living neighbors
            }
        }
        if (this.grid[i][j].getLiveorDead() == 1)
            living_neighbors--;// decrease by 1 because we considered our current cell
        return living_neighbors;
    }

}
