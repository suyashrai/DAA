package Sort;

class QuickSort {

    static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i=low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;

    }

    public static void main(String args[])
    {
        int arr[] = { 6,3,9,5,2,8 };
        int n = arr.length - 1;

        System.out.println("Original array");
        printArray(arr);
        System.out.println("");

        quickSort(arr, 0, n);

        System.out.println();
        System.out.println("Sorted array");
        printArray(arr);
    }

    /* Prints the array */
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}