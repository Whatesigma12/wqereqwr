package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Tasks 1.1-1.4: generics and Comparable. */
public class GenericTasks {
    // 1.1: remove duplicates, preserving first occurrence order; use contains().
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E item : list) {
            if (!result.contains(item)) result.add(item);
        }
        return result;
    }

    // 1.2: linear search, index or -1.
    public static <E> int linearSearch(E[] array, E key) {
        for (int i = 0; i < array.length; i++) {
            if (java.util.Objects.equals(array[i], key)) return i;
        }
        return -1;
    }

    // 1.3: max element in a one-dimensional array using compareTo().
    public static <E extends Comparable<? super E>> E max(E[] array) {
        if (array.length == 0) throw new IllegalArgumentException("Empty array");
        E greatest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(greatest) > 0) greatest = array[i];
        }
        return greatest;
    }

    // 1.4: max element in a two-dimensional array using compareTo().
    public static <E extends Comparable<? super E>> E max(E[][] matrix) {
        E greatest = null;
        boolean found = false;
        for (E[] row : matrix) {
            for (E value : row) {
                if (!found || value.compareTo(greatest) > 0) {
                    greatest = value;
                    found = true;
                }
            }
        }
        if (!found) throw new IllegalArgumentException("Empty matrix");
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 3, 2, 1, 5));
        System.out.println("1.1 Original: " + numbers);
        System.out.println("1.1 Unique:   " + removeDuplicates(numbers));

        String[] words = {"Java", "C++", "Python", "Java"};
        System.out.println("1.2 Python index: " + linearSearch(words, "Python"));
        System.out.println("1.2 Kotlin index: " + linearSearch(words, "Kotlin"));

        Circle[] circles = {new Circle(2.5), new Circle(7), new Circle(4.2)};
        System.out.println("1.3 Largest circle: " + max(circles));

        Integer[][] matrix = {{3, 12, 1}, {8, 4, 15}, {2, 7, 9}};
        System.out.println("1.4 Matrix maximum: " + max(matrix));
    }
}
