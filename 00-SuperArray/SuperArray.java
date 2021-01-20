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

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
