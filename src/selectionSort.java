import java.util.Arrays;

public class selectionSort implements sortingAlgorithim{
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }

        return input;
    }
    public static void main (String[] args) {
        sortingAlgorithim algo2 = new selectionSort();
        int[] ar = {7,5,0,9,0,4};
        System.out.println(Arrays.toString(algo2.sorty(ar)));
    }
}
