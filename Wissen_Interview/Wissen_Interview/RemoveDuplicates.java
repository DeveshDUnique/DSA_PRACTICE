package Wissen_Interview;

//Here's a code snippet to remove duplicates from a sorted array in-place without using extra space:


public class RemoveDuplicates 
{
    public static int removeDuplicates(int[] arr)
    {
        int n = arr.length;

        if(n==0 || n ==1)
        {
            return n;
        }

        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if (arr[i] != arr[i+1])
            {
                arr[j++] = arr[i];
                
            }
        }
        arr[j++] = arr[n-1]; //pushing the last element in the array if it is indifferent to the last second
        return j; //eturning the new length of array
    }

    public static void main(String[] args) 
    {
        int [] arr = {1,1,2,2,3,4,4,5};

        int m = removeDuplicates(arr);
        System.out.println(m);
        for(int i=0; i<m; i++)
        {
            System.out.print(arr[i]);
        }


        
    }
    
}
