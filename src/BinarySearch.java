import java.util.Scanner;

class BinarySearch {

    public static void main(String args[])
    {
        int arr[] = { 10, 20, 25, 35, 45, 57, 73 };
        int array_size = arr.length-1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int element = sc.nextInt();

        int result = binarySearch(arr, 0, array_size, element);

        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at: " + result);
        }

    }

    public static int binarySearch(int arr[], int first, int last, int element){
        int index=-1;
        int mid;

        while (first<last){

            mid = (first+last)/2;

            if(element==arr[mid]){
                index = mid;
                break;
            }
            else if(element>arr[mid]){
                first = mid+1;
            }
            else if(element<arr[mid]){
                last = mid-1;
            }
        }

        return index;
    }

}