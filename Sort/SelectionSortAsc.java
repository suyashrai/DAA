package Sort;

class SelectionSortAsc{

    static void selectionSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int min_idx=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String args[]){

        int arr[] = {90, 82, 54, 34, 86, 23, 67};
        System.out.println("");
        System.out.print("Original Array: ");
        printArray(arr);
        selectionSort(arr);
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