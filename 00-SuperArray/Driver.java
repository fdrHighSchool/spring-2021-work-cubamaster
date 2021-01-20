import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        SuperArray arr = new SuperArray(3);
        arr.addToTheEnd(4);
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println("");
        arr.add(1,2);
        System.out.println(Arrays.toString(arr.getArr()));
    }

}
