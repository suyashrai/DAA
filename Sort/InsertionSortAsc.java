package Sort;

class InsertionSortAsc{

    static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
    }

    public static void main(String args[]){

        int arr[] = {98, 82, 54, 34, 86, 23, 67};
        System.out.println("");
        System.out.print("Original Array: ");
        printArray(arr);
        insertionSort(arr);
        System.out.print("Sorted Array: ");
        printArray(arr);
    }

    static void printArray(int arr[]){
        System.out.println("");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}