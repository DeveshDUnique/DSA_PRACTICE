
public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
    int arr [] = {20,15,11,8,4,2,1};
    int search = orderBinary(arr, 80);
    System.out.println("Element at index = " + search);
        
    }

    static int orderBinary(int arr[], int target) {

        int start = 0;
        int end = arr.length -1;
        Boolean isAsc = arr[start] < arr[end];
        
        while (start <= end) {
        int mid = start + (end - start)/2;
        if(isAsc) {
            if(arr[mid] == target) {
                return mid;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        else{
            if(arr[mid] == target) {
                return mid;
            }
            else if(target < arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
    }
    return -1;
    }
}
