package Arrays;

import java.util.Arrays;

public class MergeArray 
{

    public static int[] mergeArrays(int [] arr1, int[] arr2)
    {
        int n = arr1.length;
        int m = arr2.length;
        int arr3 [] = new int[n+m];

    // System.out.println(arr3.length);
        int i=0, j=0, k=0;
        while(i<n && j<m) 
        {
            if (arr1[i] < arr2[j])  // while number in 1st array is lesser than in 2nd array
            {
                arr3[k++] = arr1[i++];
                
            }
            else
            {
                arr3[k++] = arr2[j++];
            }
            
        }
    // If there are remaining elements in arr1 or arr2, add them to arr3  because sizes of arrays can be different
        while (i<n) {
            arr3[k++] = arr1[i++];
            
            
        }

        while (j<m) 
        {
            arr3[k++] = arr2[j++];
           
        }

        return arr3;
    }
     
    public static void main(String[] args) 
    {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};
 
        int arr3[] = mergeArrays(arr1, arr2);
 
        System.out.println("Array after merging - " + Arrays.toString(arr3));
    }
    
}
