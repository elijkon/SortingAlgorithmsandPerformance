import java.io.*;
import java.util.Random;

public class kSort {

    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("Report_KSorted.txt")));

        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;
        runTest(new bubbleSort(), "Bubble sort", sizes, iterations);
        runTest(new insertionSort(), "Insertion sort", sizes, iterations);
        runTest(new selectionSort(), "Selection sort", sizes, iterations);
        runTest(new shellsort(), "Shell sort", sizes, iterations);
        runTest(new quickSort(), "Quick sort", sizes, iterations);
        runTest(new mergeSort(), "Merge sort", sizes, iterations);
    }
    public static void generateKSorted(int[] input) {
        Random rand = new Random();
        for (int i = 0; i < input.length; i++) {
            input[i] = rand.nextInt();
        }
        int gap = 10;
        for (int i = gap; i < input.length; i++) {
            int temp = input[i];
            int j = i;

            while (j >= gap && input[j - gap] > temp) {
                input[j] = input[j - gap];
                j -= gap;
            }
            input[j] = temp;
        }
    }



    public static void runTest(sortingAlgorithim algorithm, String name, int[] sizes, int iterations) {
        System.out.println("Sorting algorithmP: " + name);

        for (int i = 0; i < sizes.length; i++) {
            double total = 0;

            for (int j = 0; j < iterations; j++) {
                int[] data = new int[sizes[i]];
                generateKSorted(data);

                long start = System.nanoTime();
                algorithm.sorty(data);
                long end = System.nanoTime();

                total += (end - start) / 1000000.0;
            }
            double avg = total / iterations;
            System.out.println("Sorted " + sizes[i] + " elements in " + avg + " ms (avg)");
        }
    }
}