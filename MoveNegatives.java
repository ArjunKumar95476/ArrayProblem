public class MoveNegatives {

    public static void main(String[] args) {
        int[] array = { 12, -7, 3, -1, 5, -2, 0, 6, -8 };

        moveNegatives(array);

        System.out.println("Array after moving negatives to one side: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void moveNegatives(int[] array) {
        int n = array.length;
        int j = 0; // Pointer for the position of the last negative element

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                // Swap if the current element is negative
                if (i != j) {
                    swap(array, i, j);
                }
                j++; // Move the pointer for negative elements
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
