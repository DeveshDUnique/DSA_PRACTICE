public class MountainPeakIndex 
{

    public static void main(String[] args) 
    {
        int arr [] = {0,2,1,0};
       int ans = peakIndexInMountainArray(arr);
       System.out.println("element at index " + ans);

        
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

    
}
