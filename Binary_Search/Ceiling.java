
public class Ceiling
{

    public static void main(String[] args) 
    {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr,target);
        System.out.println("The number is  = "+ arr[ans]);
    }

    static int ceiling(int arr[],int target)
    {
        int start = 0; // starting index

        int end = arr.length - 1;  // end index
        
        if(arr.length < 1)
        {
            return -1;
        }

        if(target > arr[arr.length -1])
        {
            return -1;
        }

        while (start <= end)
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
        return start;
    }
}



// public class Ceiling {

//     public static void main(String[] args) {
//         int arr[] = {2, 3, 5, 9, 14, 16, 18};
//         int target = 8;
//         int ans = ceiling(arr, target);
        
//         if (ans == -1) {
//             System.out.println("No ceiling found for the target.");
//         } else {
//             System.out.println("The ceiling of the number is = " + arr[ans]);
//         }
//     }

//     static int ceiling(int arr[], int target) {
//         int start = 0; // starting index
//         int end = arr.length - 1; // end index

//         if (arr.length == 0 || target > arr[arr.length - 1]) {
//             return -1; // No ceiling possible
//         }

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (target > arr[mid]) 
//             {
//                 start = mid + 1;
//             } 
//             else if (target < arr[mid]) 
//             {
//                 end = mid - 1;
//             }
//             else
//              {
//                 return mid; // Exact match
//             }
//         }

//         // If start is within bounds, return start
//         if (start < arr.length) 
//         {
//             return start;
//         }

//         return -1; // No ceiling found
//     }
// }


