import java.util.Arrays;

public class CountingSortExercise {
    /**
     * @param arr input array
     * Assume the range of elements  in the array is from 0 to maxValue
     * @param maxValue the largest value that we can have in the array
     * Note: this is not how the counting sort is typically implemented!
     */
    public static void basicCountingSort(int[] arr, int maxValue) {
        int[] counterArray = new int[maxValue + 1];
        // Iterate over arr, and for each val = arr[i], increment counterArray[val].
        // FILL IN CODE
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            counterArray[elem]++;
        }
        int k = 0;
        for (int j = 0; j < counterArray.length; j++) {
            // Value j occurs counterArray[j] times in arr
            int frequencyOfJ = counterArray[j];
            while (k < frequencyOfJ) {
                arr[k] = j;
                k++;
            }

        }
        // Iterate over the counter array, and use it to sort arr
        // FILL IN CODE
        // write a loop that adds k to arr num=counterArray[k] times
        // FILL IN CODE

    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 5, 9, 0, 1, 9, 6, 4};
        basicCountingSort(arr, 9);
        System.out.println(Arrays.toString(arr));

    }

}

