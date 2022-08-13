package Sort;

class InsertionSort {

    public static void main(String args[])
    {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original array");
        printArray(arr);
        System.out.println("");

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        System.out.println();
        System.out.println("Sorted array");
        printArray(arr);
    }

    /* Prints the array */
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

}