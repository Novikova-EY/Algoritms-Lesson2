import java.util.ArrayList;

public class Main {
    private static Long time;

    public static void main(String[] args) {
        final int SIZE = 30000;
        ArrayList<Notebook> arr = MyArray.getArray(SIZE);
//        System.out.println(arr);
        allSort(arr);
    }

    private static void allSort(ArrayList<Notebook> arr) {
        printSortName("Сортировка пузырьком");
        startTime();
        BubbleSort.sort(arr);
        endTime();
//        System.out.println(arr);

        printSortName("Шейкерная сортировка");
        startTime();
        CocktailSort.sort(arr);
        endTime();
//        System.out.println(arr);

        printSortName("Вставками сортировка");
        startTime();
        InsertionSort.sort(arr);
        endTime();
//        System.out.println(arr);
    }

    public static void startTime() {
        time = System.currentTimeMillis();
    }

    public static void endTime() {
        time = System.currentTimeMillis() - time;
        System.out.println(time);
    }

    public static void printSortName(String sortName) {
        System.out.printf("%s: ", sortName);
    }
}
