import java.util.ArrayList;

public class BubbleSort {

    public static void sort(ArrayList<Notebook> arr) {
        boolean isChange;
        int limit = arr.size();
        do {
            isChange = false;
            limit--;
            for (int i = 0; i < limit; i++) {
                if (arr.get(i).compareTo(arr.get(i + 1))) {
                    Notebook temp;
                    temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                    isChange = true;
                }
            }
        } while (isChange);
    }
}
