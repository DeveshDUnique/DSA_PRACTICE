public class SearchInMountain 
{
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,4,5,3,1};
        int target = 5;
        int index = findInMountainArray(arr,target);
        System.out.println("Index of element is at " + index);
        
    }

    static int findInMountainArray(int arr[], int target)
    {
        int peak = peakIndexInMountainArray(arr);

           int firstTry  = orderAgnosticBS(arr,target, 0 ,peak); // binary search in ascending array

           if (firstTry != -1)  // if found in ascendng array the element
           {
             return firstTry; // returning the index
            
           }
         
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1); // to search in the descending array elements

    }

    public static int peakIndexInMountainArray(int[] arr) 
    {
        int start = 0;
        int end = arr.length -1;
        
        while (start < end) 
        {
            int mid = start + (end - start) / 2; // for finding the mid element;

            if (arr[mid] > arr[mid + 1]) // we are in decreasing part of array and need to find to left of mid
            {

                end = mid;
                
            }
            else  // we are in ascending part of array and need to find the peak element in the right side of array
            {
                start = mid + 1;  // as mid element is already smaller than the mid +1
            }

            
        }

        return start;  //when the start and end will point to same element then we need to return th start or end as its the peak element.

    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) 
    {
        

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) 
        {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) 
            {
                return mid;
            }

            if (isAsc) 
            {
                if (target < arr[mid]) 
                {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else 
            {
                if (target > arr[mid])
                 {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


    
}
