import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        SuperArray arr = new SuperArray(3);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.add(1);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.add(2);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.add(3);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.add(4);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.add(5);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.add(1,2);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.set(0, 3);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.growArray(6);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.remove(2);
        System.out.println(Arrays.toString(arr.getArr()));

    }

}
