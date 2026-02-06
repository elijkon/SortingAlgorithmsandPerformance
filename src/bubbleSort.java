import java.util.Arrays;

public class bubbleSort implements sortingAlgorithim{
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;

        for(int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i -1; j++){
                if(input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }


    public static void main (String[] args) {
        sortingAlgorithim algo = new bubbleSort();
        int[] ar = {7,5,0,9,0,4};
        System.out.println(Arrays.toString(algo.sorty(ar)));
    }
}
