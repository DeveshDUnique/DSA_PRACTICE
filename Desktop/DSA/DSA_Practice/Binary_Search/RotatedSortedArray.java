public class RotatedSortedArray 
{
    public static void main(String[] args)
    {
        int arr [] = {2,4,5,6,7,0,1,2,2};
        int ans = search(arr, 2);
        System.out.println(ans);
  
    }

    public static int search(int[] nums, int target) 
    {
        //int pivot = findPivote(nums);  // we will find the pivot so as for the rotated-binary-search
        int pivot = findPivotWithoutDuplicates(nums);
        // if you didn,t find pivot then array is not rotated
        if (pivot == -1)
        {
            // normal binary search
            return binarySearch(nums,target,0,nums.length - 1);
            
        }
        
        // if pivot is found, you have found 2 asc sorted arrays
        if (target == nums[pivot]) // if found in mid
        {
            return pivot;
            
        }
        else if(target >= nums[0])  // given target greater than start element 
        {
            return binarySearch(nums, target,0 ,pivot-1 );

        }
        

        return binarySearch(nums, target,pivot + 1 ,nums.length -1);
        
    }

    public static int findPivote(int [] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2; // for finding the mid element;

            if(mid < end && arr[mid] > arr[mid + 1]) // when mid is greater than mid +1 
            {
                return mid;

            }
            else if (mid > start && arr[mid] < arr[mid - 1]) // when mid is smaller than mid -1  
            {
                return mid - 1;
                
            }
            if (arr[start] > arr[mid])
            {
                end = mid -1;
                
            }
            else if (arr[start] < arr[mid])
            {
                start = mid + 1;
            }

        }

        return -1;  // if no pivot found

    }

    // if array contains duplcate elements
    public static int findPivotWithoutDuplicates(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2; // for finding the mid element;

            if(mid < end && arr[mid] > arr[mid + 1]) // when mid is greater than mid +1 
            {
                return mid;

            }
            else if (mid > start && arr[mid] < arr[mid - 1]) // when mid is smaller than mid -1  
            {
                return mid - 1;
                
            }
            // check if start is pivot
            if (arr[start] > arr[start+1])
            {
                return start;
                
            }
            start ++; // if above condition is false as we will have same start, end and middle
            //check if end is pivot
            if (arr[end] < arr[end-1])
            {
                return end -1;

                
            }
            end --; // if above condition is false as we will have same start, end and middle

            // if left hand side is sorted the search in right hand side
            if (arr[start] <arr[mid] || arr[start] == arr[mid] && arr[end] < arr[start])
            {
                 start = mid +1;
            }
            else
            {
                end = mid -1;
            }

        }
        return -1;

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
