public class quickSort implements sortingAlgorithim{
    @Override
    public int[] sorty(int[] input) {

        runQuickSort(input, 0, input.length - 1);
        return input;
    }

    private void runQuickSort(int[] ar, int start, int end) {
        if (start < end) {
            int pIndex = partition(ar, start, end);

            runQuickSort(ar, start, pIndex - 1);
            runQuickSort(ar, pIndex + 1, end);
        }
    }

    private int partition(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (ar[j] <= pivot) {
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        int temp = ar[i + 1];
        ar[i + 1] = ar[end];
        ar[end] = temp;

        return i + 1;
    }
}
