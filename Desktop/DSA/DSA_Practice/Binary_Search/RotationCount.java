public class RotationCount 
{

    public static void main(String[] args) 
    {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println("No of rotations are = " + countRotations(arr));
        
    }

    private static int countRotations(int[] arr) 
    {
        // TODO Auto-generated method stub
        int ans = findPivote(arr);

        if (ans == -1) 
        {
            System.out.println(ans + "rotations ");
       
        }


        return ans+1;
    }


    //use this pivot method when we don't have any duplicates into the array
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



     // if array contains duplcate elementsuse this pivot method
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
    
}
