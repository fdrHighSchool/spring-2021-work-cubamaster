import java.util.Arrays;

public class SuperArray {
    private int [] arr;

    public SuperArray() {
        arr = new int[10];
    }

    public SuperArray(int size) {
        arr = new int[size];
    }

    public void addToTheEnd(int value) {
        int [] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length-1] = value;
        arr = new int[arr2.length];
        arr = arr2;
    }

    public void add(int index, int value) {
        int []arr2 = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        arr2[index] = value;
        for (int i = index; i < arr.length; i++) {
            arr2[i+1] = arr[i];
        }
        arr = new int[arr2.length];
        arr = arr2;
    }

    public void set(int index, int value) {
        if (index > arr.length -1) {
            System.out.println("ERROR: out of index");
            return;
        }
        arr[index] = value;
    }

    public int getValue(int index) {
        return arr[index];
    }

    public void growArray(int size) {
        if (size <= arr.length) {
            System.out.println("ERROR: size must be greater than the length of the array");
        }
        int [] arr2 = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr = new int[size];
        arr = arr2;
    }

    public void remove(int index) {
        int [] arr2 = new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
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

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
