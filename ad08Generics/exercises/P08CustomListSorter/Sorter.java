package JavaAdvanced.ad08Generics.exercises.P08CustomListSorter;

public class Sorter {

    public static <T extends Comparable<T>> void sort(CustomList<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            T leftElement = list.get(i);
            T rightElement = list.get(i + 1);
            if (leftElement.compareTo(rightElement) > 0) {
                list.swap(i, i + 1);
                i = -1;
            }
        }
    }
}
