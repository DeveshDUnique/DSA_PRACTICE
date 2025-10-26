package Binary_Search;

public class BinarySearch 
{

    public static void main(String[] args) 
    {
        int arr[] = {-18,-12,0,4,6,8,13,15,17,22,27};
        int target = 222;
        int ans = binarySearch(arr,target);
        System.out.println("The number is at index = "+ans);
    }


    static int binarySearch(int arr[],int target)
    {
        int start = 0; // starting index
        int end = arr.length - 1;  // end index
        if(arr.length < 1)
        {
            return -1;
        }

        while (end >= start)
        {
            int mid = start + (end - start)/2;  // mid condition for the elements to not cross integer limit in array 

            if (target >arr[mid] )
            {
                start = mid + 1;
                
            }
            else if (target < arr [mid])
            {
                end = mid-1;
                
            }
             else 
            {

                return mid;

            } 
                          
        }

        return -1;
    }

}
