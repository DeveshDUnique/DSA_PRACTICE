package freshwork;

import java.util.Arrays;

public class SubArraySum1 
{
    public static int [] findSubarrayWithSum(int arr[],int targetSum)
    {
        int n = arr.length;

        for(int start = 0;start < n; start++)
        {
            int currentSum =0;

            for(int end = start; end <n; end++)
            {
                currentSum += arr[end];

                if (currentSum == targetSum)
                {
                    //Copies the specified range of the specified array into a new array.
                    return Arrays.copyOfRange(arr, start, end+1);
                    
                }
            }
        }

        // if no subarray is found, return an empty array
        return new int[0];
    }


    public static void main(String[] args) 
    {
        int[] arr = {1,30,2, 4, 20, 3, 10, 5};
        int targetSum = 33;
        int subArray[] = findSubarrayWithSum(arr, targetSum);

        if (subArray.length > 0)
        {
            System.out.println("Subarray with sum "+ targetSum + " " + Arrays.toString(subArray));
            
        }
        else
        {
            System.out.println("No of subarray found with sum  " + targetSum);
        }

        
    }
    
}
