package LinearSearch;


public class MaximumWealth 
{

    public static void main(String[] args)
    {
        int arr[] [] = {{1,2,3},{3,6,1},{9,2,9}};
        System.out.println(maximumWealth(arr));


    }

    public static int maximumWealth(int arr [][] )
    {
      int ans = Integer.MIN_VALUE; 
        //System.out.println(ans);

        for(int row = 0; row < arr.length; row++)
        {
            int rowsum = 0; // for summing in each row

            for(int col = 0; col < arr[row].length; col++)
            {
                rowsum += arr[row][col];
            }

            // now we have the sum of accounts for person and now we check for the overall answer


            if (rowsum > ans)
            {
                ans = rowsum ;
                
            }
            
        }

        return ans;
    } 



    
}
