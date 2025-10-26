package Arrays;

// return the array indexes so that 

public class TwoSum 
{
    public static int[] twoSum(int[]num,int target)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if (num[i] + num[j] == target)
                {
                    int a[] = {num[i],num[j]}; // adding indexes to array
                    return a;
                    
                }
            }
        }   
        return null;
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,7,5,4};
        int result[] = twoSum(arr, 9);
        System.out.print("{");
        for(int i=0; i < result.length; i++)
        {
            
            System.out.print( + result[i] + ",");
        }
        System.out.println("}");
      
    }
    
}
