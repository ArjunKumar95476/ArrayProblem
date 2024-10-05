import java.util.Arrays;

public class KthMinMaxFinder {
    public static void main(String[] args) {
        int[] array = {3, 5, 1,4, 8, 2, - 7};
        int k = 2; // Change this value to find the Kth min/max

        try {
            int kthMin = findKthMin(array, k);
            int kthMax = findKthMax(array, k);
            System.out.println(k + "th Minimum element: " + kthMin);
            System.out.println(k + "th Maximum element: " + kthMax);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findKthMin(int[] array, int k) {
        if (array == null || array.length == 0 || k <= 0 || k > array.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        Arrays.sort(array);
        return array[k - 1]; // Kth minimum is at index k-1
    }

    public static int findKthMax(int[] array, int k) {
        if (array == null || array.length == 0 || k <= 0 || k > array.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        Arrays.sort(array);
        return array[array.length - k]; // Kth maximum is at index length-k
    }
}
