import java.util.Arrays;

public class Feb22ExerciseSolutionModifiedCountingSort {

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

        // Modify the counter array
        for (int j = 1; j < counterArray.length; j++) {
            counterArray[j] = counterArray[j-1] + counterArray[j];
        }

        // iterate over the input array and using the counter array, place elements back into arr
        Elem[] result = new Elem[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            Elem elem = arr[i];
            int key = elem.getKey();
            counterArray[key]--;
            result[counterArray[key]] = arr[i];
        }

        for (int i = 0; i < result.length; i++)
            arr[i] = result[i];
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
