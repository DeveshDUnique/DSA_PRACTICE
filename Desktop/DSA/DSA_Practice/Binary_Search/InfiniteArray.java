// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray 
{
    public static void main(String[] args) 
    {
        //
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 179;
        int ans = findPos(arr, target);
        System.out.println(ans);

    }

    public static int findPos(int arr[],int target)
    {
        int start = 0;
        int end = 1;

        while (target > arr[end]) // doubling the chunk size if the target is not in the current array size
        {
            int newStart = end + 1; //newStart
            end = (end - start + 1) * 2 + start -1 ;// doubling the chunk

            start = newStart; //changing the start 
        
            // Ensure end does not exceed the length of the array
        if (end >= arr.length) 
        {
            end = arr.length - 1;
        }
            
        }
     

        return binarySearch(arr, target, start, end);

    }


    public static int binarySearch(int [] arr,int target, int start,int end)
    {
        while(start <= end) 
        {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) 
            {
                end = mid - 1;
            } 
            else if (target > arr[mid]) 
            {
                start = mid + 1;
            } 
            else 
            {
                // ans found
                return mid;
            }
        }
        return -1;
    }

}
    

