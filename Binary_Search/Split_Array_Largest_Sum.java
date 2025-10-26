public class Split_Array_Largest_Sum 
{
    public static void main(String[] args) 
    {
        int arr[] = {7,2,5,10,8};
        int k =2 ;
        int ans = splitArray(arr,k);
        System.out.println(ans);
        
    }

    // we will solve this with binary-search only
    private static int splitArray(int[] nums, int k)
    {
        int start = 0;
        int end = 0;


        //minimum answer we will find which is the maximum value in the array so that will be our start
        for(int i =0; i < nums.length; i++)
        {
            start = Math.max(start, nums[i]);
            end += nums[i]; /// sum of all the elements in the array which is our end for binary-search

        }

        // binary search
        while (start < end)
        {
            int sum = 0;
            int splits = 1;
            //mid value
            int mid = start + (end - start)/2;  // here start,end, mid are direct array values and not indexes!

            // iterating through the array
            for(int num:nums)
            {
                if (sum + num > mid) // first check
                {
                    // when the array sum becomes larger than the mid value then made another sub-array
                    // splits <= k should be condition and do split ++

                    sum = num;
                    splits++;
                }
                else // add in the same array
                {
                    sum += num;
                }
            }
                // check if splits are greater than the k
                if (splits > k)
                {
                    start = mid +1; 
                }
                else
                {
                    end = mid;
                }

        }
        return start; // return the start or end as it will point to same sum
    }
    
}
