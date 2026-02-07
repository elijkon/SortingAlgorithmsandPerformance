import java.util.Random;

public class tester {

    sortingAlgorithim algorithm;

    public tester(sortingAlgorithim myAlgorithm) {
        algorithm = myAlgorithm;
    }

    public double singleTest(int size) {
        int[] data = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt();
        }

        long start = System.nanoTime();
        algorithm.sorty(data);
        long end = System.nanoTime();

        return (end - start) / 1000000.0;
    }

    public void test(int iterations, int size) {
        double total = 0;

        for (int i = 0; i < iterations; i++) {
            total = total + singleTest(size);
        }

        double avg = total / iterations;
        System.out.println("Sorted " + size + " elements in " + avg + " ms (avg)");
    }
}