
public class OrderAgnostic 
{
   public static void main(String[] args)
{

    int arr[] = {-18,-12,0,4,6,8,13,15,17,22,27};
    int target = 27;
    int ans = orderAgnosticBS(arr,target);
    System.out.println("The number is at index = "+ans);
    
   }

private static int orderAgnosticBS(int[] arr, int target) 
{

    int start =0;
    int end = arr.length -1;

    //find if array is sorted in ascending or descending

    boolean isAsc = arr[start] < arr[end];


    while (end >= start)
        {
            int mid = start + (end - start) / 2;  // mid condition for the elements to not cross integer limit in array 
        
            if(arr[mid] == target)
            {
                return mid;
            }

            if(isAsc)
            {
                if (target > arr[mid])
                {
                    start = mid + 1;
                          
                }
                else 
                {
                    end = mid-1;
                    
                }
            }
            else
            {
                if(target < arr[mid])
                {
                    end = mid -1;
                    
                }
                else 
                {
                    start = mid + 1;
                    
                }


            }
        
        }


    return -1 ;
}
}
