package Sort;

class BubbleSort {

    static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){

        int arr[] = {90, 82, 54, 34, 86, 23, 67};
        System.out.println("");
        System.out.print("Original Array: ");
        printArray(arr);
        bubbleSort(arr);
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