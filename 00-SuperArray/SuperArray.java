import java.util.Arrays;

public class SuperArray {
    private int [] arr;

    public SuperArray() {
        arr = new int[10];
    }

    public SuperArray(int size) {
        arr = new int[size];
    }

    //Overload
    public void add(int value) {
        /**
         * search if I have 0 in my current size array
         */
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = value;
                return;
            }
        }
        // case if I don't have space for value
        int [] arr2 = new int[arr.length + 1];
        /**
         * copy values to current array(arr2)
         */
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length-1] = value; // added new value
        arr = new int[arr2.length]; // increased the array
        arr = arr2; // put values back from temp array
    }

    public void add(int index, int value) {
        int []arr2 = new int[arr.length+1]; // created a temp array
        /**
         * copied all the values that go up to the cell index
         */
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }// close for loop
        arr2[index] = value; // put value in specific index
        /**
         * copied other values but add 1 for their index
         */
        for (int i = index; i < arr.length; i++) {
            arr2[i+1] = arr[i];
        }
        arr = new int[arr2.length]; // increased the array
        arr = arr2;
    }

    public void set(int index, int value) {
        if (index > arr.length -1) {// check that the entered index was not greater than the maximum index
            System.out.println("ERROR: out of index");
            return;
        }
        arr[index] = value; // set value in the index
    }

    public int getValue(int index) {
        return arr[index]; // return value
    }

    public void growArray(int size) {
        int [] arr2 = new int[arr.length + size];
        /**
         * copy values to the temporary array
         */
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr = new int[arr2.length]; // grow array size
        arr = arr2; // set values back
    }

    public void remove(int index) {
        int [] arr2 = new int[arr.length-1]; // temp array
        /**
         * copy all values before index
         */
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        /**
         * I put all values but on a reduced index by 1
         */
        for (int i = index; i < arr2.length; i++) {
            arr2[i] = arr[i + 1];
        }
        arr = new int[arr.length-1];
        arr = arr2;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public boolean isEmpty() {
        // check entire array for any numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}