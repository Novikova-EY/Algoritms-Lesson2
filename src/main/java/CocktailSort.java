import java.util.ArrayList;

public class CocktailSort {
    public static void sort(ArrayList<Notebook> arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= arr.size() - 2; i++) {
                if (arr.get(i).compareTo(arr.get(i + 1))) {
                    Notebook temp;
                    temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = arr.size() - 2; i >= 0; i--) {
                if (arr.get(i).compareTo(arr.get(i + 1))) {
                    Notebook temp;
                    temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
