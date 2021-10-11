import java.util.ArrayList;

public class MyArray {

    public static ArrayList<Notebook> getArray(int length) {
        ArrayList<Notebook> arr = new ArrayList<>();
        for (int i = 1; i < length; i++) {
            arr.add(new Notebook());
        }
        return arr;
    }
}
