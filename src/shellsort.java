import java.util.Arrays;

public class shellsort implements sortingAlgorithim{
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;

        for (int gap = n / 2; gap > 0; gap = gap / 2) {

            for (int i = gap; i < n; i++) {
                int currentNumber = input[i];
                int j = i;

                while (j >= gap && input[j - gap] > currentNumber) {
                    input[j] = input[j - gap];
                    j = j - gap;
                }

                input[j] = currentNumber;
            }
        }
        return input;
    }
    public static void main (String[] args) {
        sortingAlgorithim algo4 = new shellsort();
        int[] ar = {7,5,0,9,0,4};
        System.out.println(Arrays.toString(algo4.sorty(ar)));
    }
}
