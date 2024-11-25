package jdk_;

import java.util.Arrays;
import java.util.Comparator;

public class ParrallelArraySort {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 1, 6, 2, 9, 4, 7, 3};

        // Parallel sort the array
        Arrays.parallelSort(numbers);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        String[] words = {"apple", "orange", "banana", "grape", "pear"};

        // Parallel sort the array
        Arrays.parallelSort(words);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(words));

//        String[] words = {"apple", "orange", "banana", "grape", "pear"};

        // Parallel sort the array with a custom comparator (sort in reverse order)
        Arrays.parallelSort(words, Comparator.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(words));
    }
}

/**
 * Java 8 introduced parallel array sorting,
 * which can be utilized to sort large arrays more quickly by leveraging multiple cores of the CPU.
 * This feature is part of the java.util.Arrays class
 * sorts the array of integers using multiple threads.
 * parallel sort uses the Fork/Join framework introduced in Java 7 to achieve parallelism.
 */

/**
 * Key Points
 * Efficiency: Parallel sorting can significantly reduce the time required to sort large arrays by utilizing multiple CPU cores.
 * Simplicity: The API is straightforward and similar to the traditional Arrays.sort() method.
 * Performance: While parallel sorting can be faster for large arrays,
 * it might not provide significant benefits for smaller arrays due to the overhead of managing multiple threads.
 */

/**
 * Comparison with Traditional Sort
 * Arrays.sort(): Performs sorting in a single thread.
 * Arrays.parallelSort(): Performs sorting using multiple threads to potentially reduce sorting time for large arrays.
 */


/**
 * Conclusion
 * Parallel array sorting in Java 8 is a powerful feature for optimizing the performance of sorting large arrays.
 * It leverages multiple CPU cores to speed up the sorting process,
 * making it an excellent tool for performance-critical applications.
 * By using Arrays.parallelSort(), you can achieve faster sorting with minimal changes to your existing code.
 */
