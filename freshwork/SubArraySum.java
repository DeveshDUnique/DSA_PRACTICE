package freshwork;

import java.util.Arrays;

public class SubArraySum 
{


        public static void findSubarrayWithSum(int[] arr, int targetSum) 
        {
            int n = arr.length;  //length of array

            for(int start=0; start<n; start++)
            {
                int currentSum = 0; // to store the sum of array elements

                for(int end = start; end<n; end++)
                {
                    currentSum += arr[end];

                    if (currentSum == targetSum)
                    {
                        // This line will return the indices 
                        System.out.println("Subarray with sum of " + targetSum + " found between indices of " + start + " and " +end);

                        // This line will return the array elements
                        // return Arrays.copyOfRange(arr,start,end+1);

                        return;
                    }

                }

            }
            System.out.println("No of subarray found with sum " + targetSum);
        }
    
        public static void main(String[] args) 
        {
            int[] arr = {1, 4, 20, 3, 10, 5};
            int targetSum = 33;
            findSubarrayWithSum(arr, targetSum);


            //for returning the sub-arrays 
            // int subArray[] = findSubarrayWithSum(arr, targetSum);
            // if (subArray.length > 0)
            // {
            //     System.out.println("Subarray with sum " + targetSum + Arrays.toString(subArray));
            // }
            // else
            // {
            //     System.out.println("No subArray found with sum " + targetSum);
            // }



        }
    }
    









    

