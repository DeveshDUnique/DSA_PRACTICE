package Wissen_Interview;

public class PairOfArrayNumbers 
{

    public static int[] twoDifference(int[]num,int target)
    {
        int n = num.length;

        for(int i=0; i<n-1;i++)
        {
            for(int j =i+1 ;j<n ;j++)
            {
                if (num[i] - num[j] == target)
                {
                    int arr[] = {i,j}; //adding to array
                    return arr;
                }
            }
        }
    
        return null;
    }

    public static void main(String[] args) 
    {
        int arr[] = {1,2,5,10,6};

        int  result[] = twoDifference(arr, -5);
        
        for(int i=0; i<result.length; i++)
        {
            System.out.println(result[i]);
        }

        
    }
    
}
