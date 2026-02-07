import java.util.Arrays;

public class insertionSort implements sortingAlgorithim{
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;

        for (int i = 1; i < n; i++) {
            int key = input[i];
            int j = i - 1;

            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
        return input;
    }
    public static void main (String[] args) {
        sortingAlgorithim algo3 = new insertionSort();
        int[] ar = {7,5,0,9,0,4};
        System.out.println(Arrays.toString(algo3.sorty(ar)));
    }
}
