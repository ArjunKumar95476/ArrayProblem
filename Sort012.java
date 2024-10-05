public class Sort012 {
    public static void main(String[] args) {
        int[] array = { 0,0, 1, 2, 1, 0, 2, 0, 1, 2 };

        sortArray(array);

        System.out.println("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void sortArray(int[] array) {
        int low = 0; // Pointer for the next position of 0
        int mid = 0; // Pointer for the current element
        int high = array.length - 1; // Pointer for the next position of 2

        while (mid <= high) {
            switch (array[mid]) {
                case 0:
                    // Swap low and mid, increment both
                    swap(array, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // Move mid pointer
                    mid++;
                    break;
                case 2:
                    // Swap mid and high, decrement high
                    swap(array, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
