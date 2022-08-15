package Sort;

class MergeSortDesc
{
    static void divide(int arr[], int si, int ei){
        if(si>=ei) return;
        int mid = si + (ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        conquer(arr, si, mid, ei);

    }

    static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int idxM = 0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]>arr[idx2]){
                merged[idxM++] = arr[idx1++];
            }
            else{
                merged[idxM++] = arr[idx2++];
            }
        }

        while(idx1<=mid){
            merged[idxM++] = arr[idx1++];
        }

        while(idx2<=ei){
            merged[idxM++] = arr[idx2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }


    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length - 1;

        System.out.println("Given Array");
        printArray(arr);

        divide(arr, 0, n);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}