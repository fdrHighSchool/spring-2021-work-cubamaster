public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int nuwRows, int numColmns) {
        for (int i = 0; i < nuwRows; i++) {
            for (int j = 0; j < numColmns; j++) {
                int randomNumber = (int) (Math.random() * (10 - 1 + 1) + 1);
                if (randomNumber>= 1 && randomNumber <= 4) {
                    lights[i][j] = true;
                }
                else
                    lights[i][j] = false;
            }
        }
    }

    public  boolean evaluateLights(int row, int colm) {
        if (lights[row][colm]) {
            int count = 0;
            for(int i = 0; i < colm; i++) {
                if (lights[row][i]) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                return false;
            }
        }
        else {
            int count = 0;
            for(int i = 0; i < colm; i++) {
                if (lights[row][i]) {
                    count++;
                }
            }
            if (count % 3 == 0) {
                return true;
            }
        }
        return lights[row][colm];
    }

}
