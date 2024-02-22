import java.util.Arrays;

public class Feb22ExerciseModifiedCountingSort {

    /**
     * Implementation of the modified counting sort
     * @param arr input array
     * @param maxValue largest possible value that can occur in the array.
     * Assume the range of elements is from 0 to maxValue, inclusive.
     */
    public static void modifiedCountingSort(Elem[] arr, int maxValue) {
        int[] counterArray = new int[maxValue + 1];
        for (int i = 0; i < arr.length; i++) {
            Elem elem = arr[i];
            counterArray[elem.getKey()]++;
        }

        // FILL IN CODE
        // Modify the counter array c[j] = c[j] + c[j-1]

        // iterate over the input array and using the counter array, place elements back into arr
        Elem[] result = new Elem[arr.length];
        // FILL IN CODE

        // Copy elements from the array "result" back to arr
        // FILL IN CODE

    }

    public static void main(String[] args) {
        Elem[] records = {
                new Elem(6, "red"),
                new Elem(1, "blue"),
                new Elem(6, "yellow"),
                new Elem(2, "black"),
                new Elem(1, "brown"),
                new Elem(6, "orange"),
                new Elem(0, "green"),
                new Elem(6, "gray")};
        modifiedCountingSort(records, 6);
        System.out.println(Arrays.toString(records));
    }

}
