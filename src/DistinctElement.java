import java.util.*;
public class DistinctElement {
        public static void distinctElementsInWindow(int[] arr, int k) {
            int n = arr.length;

            // Iterate through each window
            for (int i = 0; i <= n - k; i++) {
                HashSet<Integer> distinct = new HashSet<>();

                // Traverse the current window and store distinct elements in a set
                for (int j = i; j < i + k; j++) {
                    distinct.add(arr[j]);
                }
                // Print the distinct elements in the current window
                System.out.println("Distinct elements in window " + (i + 1) + ": " + distinct);
            }
        }
        public static void main(String[] args) {
            int[] array = {1, 2, 1, 3, 4, 2, 3};
            int windowSize = 4;
            distinctElementsInWindow(array, windowSize);
        }
    }

