import java.util.ArrayList;

public class InsertionSort {
    public static void sort(ArrayList<Notebook> arr){
        for (int i = 1; i < arr.size(); i++) {
            Notebook value;
            value = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j).compareTo(value)) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, value);
        }
    }
}