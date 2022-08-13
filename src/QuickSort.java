class QuickSort{

    public static void quickSort(int arr[], int low, int high) {
        if(low < high){
            int pivot_index = partition(arr, low, high);
            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index+1, high);
        }
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i; // pivot_index

    }

    public static void main(String args[])
    {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original array");
        printArray(arr);
        System.out.println("");

        quickSort(arr, 0, arr.length-1);

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