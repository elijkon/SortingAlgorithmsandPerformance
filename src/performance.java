import java.io.*;

public class performance {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("Report.txt")));
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;

        System.out.println("Sorting algorith: Bubble sort");
        tester t1 = new tester(new bubbleSort());
        for (int i = 0; i < sizes.length; i++) {
            t1.test(iterations, sizes[i]);
        }
        System.out.println("Sorting algorithm: Insertion sort");
        tester t2 = new tester(new insertionSort());
        for (int i = 0; i < sizes.length; i++) {
            t2.test(iterations, sizes[i]);
        }

        System.out.println("Sorting algorithm: Selection sort");
        tester t3 = new tester(new selectionSort());
        for (int i = 0; i < sizes.length; i++) {
            t3.test(iterations, sizes[i]);
        }

        System.out.println("Sorting algorithm: Shell sort");
        tester t4 = new tester(new shellsort());
        for (int i = 0; i < sizes.length; i++) {
            t4.test(iterations, sizes[i]);
        }
        System.out.println("Sorting algorithm: Quick sort");
        tester t5 = new tester(new quickSort());
        for (int i = 0; i < sizes.length; i++) {
            t5.test(iterations, sizes[i]);
        }

        System.out.println("Sorting algorithm: Merge sort");
        tester t6 = new tester(new mergeSort());
        for (int i = 0; i < sizes.length; i++) {
            t6.test(iterations, sizes[i]);
        }
    }
}