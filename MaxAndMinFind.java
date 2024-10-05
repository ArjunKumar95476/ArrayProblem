public class MaxAndMinFind {
    public static void main(String[] args) {

        int[] array = { -10, 3, 5, 1, 8, 2, -4, 7, 10 };

        // Call the method to find the min and max
        int[] result = findMinMax(array);

        System.out.println("Minimum element: " + result[0]);
        System.out.println("Maximum element: " + result[1]);

    }

    private static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");

        }
        int min = array[0];
        int max = array[0];
        // logic for max and min
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return new int[] { min, max };
    }
}
