public class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c) {
        int [] arr = new int[arr2D.length];
        for(int i = 0; i < arr2D.length; i++) {
            arr[i] = arr2D[i][c];
        }
        return arr;
    }

    public static boolean isLatin(int[][] squre) {
        if (containsDuplicates(square[0])) {
            for (int i = 0; i < square.length; i++) {
                if (hasAllValues(square[0], square[i]) && hasAllValues(square[0], getColumn(square, i))) {
                    return true;
                } //end if
                return false;
            } //end for loop
        } //end if
        return false;
    }
}
