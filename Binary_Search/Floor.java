public class Floor 
{

    public static void main(String[] args)
    {
        int arr[] = {-1,-4, 0,4,8,9,14,18};

        int target = 10;
        int ans = floor(arr,target);
        System.out.println("The number is = " + arr[ans]);

    }

    static int floor(int arr[],int target)
    {
        int start = 0;
        int end = arr.length;

        if (arr.length < 1 || target > arr[arr.length -1]) 
        {
            return -1;
            
        }

        while (start <= end)
     {
        int mid = start + (end - start)/2;  // finding the mid

        if (target < arr[mid]) 
        {
            end = mid -1;
            
        }
        else if(target > arr[mid])
        {
            start = mid +1;
        }
        else
        {
           return mid;
        }
  
     }

     return end;

    }
    
}
