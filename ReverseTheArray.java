
public class ReverseTheArray{
    public static void main(String []args)
    {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(array);
        reverseArray(array);
        System.out.println("Reversed array:");
        printArray(array);
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    private static void printArray(int[] array) {
        for(int arr:array){System.out.print(arr+" ");}System.out.println();
    }
}