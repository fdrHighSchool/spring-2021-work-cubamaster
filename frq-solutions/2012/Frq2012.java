public class Frq2012 {
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
        int i = 0, j = 0;
        while(i + 2 < pixelValues.length && j + 2 < pixelValues[0].length) {
            pixelValues[i][j]  -= pixelValues[i+2][j+2];
            if (pixelValues[i][j] < BLACK)
                pixelValues[i][j] = BLACK;
            i++;
            j++;
        }
    }
}
