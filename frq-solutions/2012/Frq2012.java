public class Frq2014 {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;


    public  int countWhitePixels(){
        int count = 0;
        for (int i = 0; i < pixelValues.length; i++) {
            for (int j = 0; j < pixelValues[0].length; j++) {
                if (pixelValues[i][j] == WHITE)
                    count++;
            }
        }
        return count;
    }

    public void processImage() {
        for(int i = 0; i < pixelValues.length; i++) {
            for (int j = 0; j < pixelValues[0].length; j++) {
                if (i + 2 > pixelValues.length || j + 2 > pixelValues[0].length) {
                    j++;
                }
                else {
                    pixelValues[i][j] -= pixelValues[i + 2][j + 2];
                    if (pixelValues[i][j] < BLACK)
                        pixelValues[i][j] = BLACK;
                }
            }
        }
    }
}
