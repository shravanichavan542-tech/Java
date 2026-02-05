import java.util.Arrays;

public class Cycle_sort {
    public static void main(String args[]) {
        int arr[] = {3, 2, 5, 4, 1};
        int i = 0;

        while (i < arr.length) {
            int correct_idx = arr[i] - 1;
            if (arr[i] != arr[correct_idx]) {
                // Swap arr[i] and arr[correct_idx]
                int temp = arr[i];
                arr[i] = arr[correct_idx];
                arr[correct_idx] = temp;
            } else {
                i++; // Only move to next index if element is at the correct position
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
