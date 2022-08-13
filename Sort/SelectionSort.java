package Sort;

class SelectionSort {

    public static void main(String args[])
    {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original array");
        printArray(arr);
        System.out.println("");

        for (int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                   min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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